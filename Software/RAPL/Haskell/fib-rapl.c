/* Read the RAPL registers on a sandybridge-ep machine                */
/* Code based on Intel RAPL driver by Zhang Rui <rui.zhang@intel.com> */
/*                                                                    */
/* The /dev/cpu/??/msr driver must be enabled and permissions set     */
/* to allow read access for this to work.                             */
/*                                                                    */
/* Code to properly get this info from Linux through a real device    */
/*   driver and the perf tool should be available as of Linux 3.14    */
/* Compile with:   gcc -O2 -Wall -o rapl-read rapl-read.c -lm         */
/*                                                                    */
/* Vince Weaver -- vincent.weaver @ maine.edu -- 29 November 2013     */
/*                                                                    */
/* Additional contributions by:                                       */
/*   Romain Dolbeau -- romain @ dolbeau.org                           */


#include <HsFFI.h>
#ifdef __GLASGOW_HASKELL__
#include "F_stub.h"
#endif

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <errno.h>
#include <inttypes.h>
#include <unistd.h>
#include <math.h>
#include <string.h>



#define MSR_RAPL_POWER_UNIT		0x606

/*
 * Platform specific RAPL Domains.
 * Note that PP1 RAPL Domain is supported on 062A only
 * And DRAM RAPL Domain is supported on 062D only
 */
/* Package RAPL Domain */
#define MSR_PKG_RAPL_POWER_LIMIT	0x610
#define MSR_PKG_ENERGY_STATUS		0x611
#define MSR_PKG_PERF_STATUS		0x613
#define MSR_PKG_POWER_INFO		0x614

/* PP0 RAPL Domain */
#define MSR_PP0_POWER_LIMIT		0x638
#define MSR_PP0_ENERGY_STATUS		0x639
#define MSR_PP0_POLICY			0x63A
#define MSR_PP0_PERF_STATUS		0x63B

/* PP1 RAPL Domain, may reflect to uncore devices */
#define MSR_PP1_POWER_LIMIT		0x640
#define MSR_PP1_ENERGY_STATUS		0x641
#define MSR_PP1_POLICY			0x642

/* DRAM RAPL Domain */
#define MSR_DRAM_POWER_LIMIT		0x618
#define MSR_DRAM_ENERGY_STATUS		0x619
#define MSR_DRAM_PERF_STATUS		0x61B
#define MSR_DRAM_POWER_INFO		0x61C

/* RAPL UNIT BITMASK */
#define POWER_UNIT_OFFSET	0
#define POWER_UNIT_MASK		0x0F

#define ENERGY_UNIT_OFFSET	0x08
#define ENERGY_UNIT_MASK	0x1F00

#define TIME_UNIT_OFFSET	0x10
#define TIME_UNIT_MASK		0xF000

int open_msr(int core) {

  char msr_filename[BUFSIZ];
  int fd;

  sprintf(msr_filename, "/dev/cpu/%d/msr", core);
  fd = open(msr_filename, O_RDONLY);
  if ( fd < 0 ) {
    if ( errno == ENXIO ) {
      fprintf(stderr, "rdmsr: No CPU %d\n", core);
      exit(2);
    } else if ( errno == EIO ) {
      fprintf(stderr, "rdmsr: CPU %d doesn't support MSRs\n", core);
      exit(3);
    } else {
      perror("rdmsr:open");
      fprintf(stderr,"Trying to open %s\n",msr_filename);
      exit(127);
    }
  }

  return fd;
}

long long read_msr(int fd, int which) {

  uint64_t data;

  if ( pread(fd, &data, sizeof data, which) != sizeof data ) {
    perror("rdmsr:pread");
    exit(127);
  }

  return (long long)data;
}

#define CPU_SANDYBRIDGE     42
#define CPU_SANDYBRIDGE_EP  45
#define CPU_IVYBRIDGE       58
#define CPU_IVYBRIDGE_EP    62
#define CPU_HASWELL     60
#define CPU_HASWELL_ULT     69
#define CPU_HASWELL_GT3E    70
#define CPU_HASWELL_EP      63
#define CPU_BROADWELL       61
#define CPU_BROADWELL_GT3E  71
#define CPU_BROADWELL_EP    79
#define CPU_BROADWELL_DE    86
#define CPU_SKYLAKE     78
#define CPU_SKYLAKE_HS      94
#define CPU_SKYLAKE_X       85
#define CPU_KNIGHTS_LANDING 87
#define CPU_KNIGHTS_MILL    133
#define CPU_KABYLAKE_MOBILE 142
#define CPU_KABYLAKE        158
#define CPU_ATOM_SILVERMONT 55
#define CPU_ATOM_AIRMONT    76
#define CPU_ATOM_MERRIFIELD 74
#define CPU_ATOM_MOOREFIELD 90
#define CPU_ATOM_GOLDMONT   92
#define CPU_ATOM_GEMINI_LAKE    122
#define CPU_ATOM_DENVERTON  95

int detect_cpu(void) {

	FILE *fff;

	int family,model=-1;
	char buffer[BUFSIZ],*result;
	char vendor[BUFSIZ];

	fff=fopen("/proc/cpuinfo","r");
	if (fff==NULL) return -1;

	while(1) {
		result=fgets(buffer,BUFSIZ,fff);
		if (result==NULL) break;

		if (!strncmp(result,"vendor_id",8)) {
			sscanf(result,"%*s%*s%s",vendor);

			if (strncmp(vendor,"GenuineIntel",12)) {
				printf("%s not an Intel chip\n",vendor);
				return -1;
			}
		}

		if (!strncmp(result,"cpu family",10)) {
			sscanf(result,"%*s%*s%*s%d",&family);
			if (family!=6) {
				printf("Wrong CPU family %d\n",family);
				return -1;
			}
		}

		if (!strncmp(result,"model",5)) {
			sscanf(result,"%*s%*s%d",&model);
		}

	}

	fclose(fff);

	switch(model) {
		case CPU_SANDYBRIDGE:
			printf("Found Sandybridge CPU\n");
			break;
		case CPU_SANDYBRIDGE_EP:
			printf("Found Sandybridge-EP CPU\n");
			break;
		case CPU_IVYBRIDGE:
			printf("Found Ivybridge CPU\n");
			break;
		case CPU_IVYBRIDGE_EP:
			printf("Found Ivybridge-EP CPU\n");
			break;
    case CPU_HASWELL:
      printf("Found Haswell CPU\n");
      break;
    case CPU_HASWELL_ULT:
      printf("Found Haswell-ULT CPU\n");
      break;
    case CPU_HASWELL_GT3E:
      printf("Found Haswell-GT3E CPU\n");
      break;
    case CPU_HASWELL_EP:
      printf("Found Haswell-EP CPU\n");
      break;
    case CPU_BROADWELL:
      printf("Found Broadwell CPU\n");
      break;
    case CPU_BROADWELL_GT3E:
      printf("Found Broadwell-GT3E CPU\n");
      break;
    case CPU_BROADWELL_EP:
      printf("Found Broadwell-EP CPU\n");
      break;
    case CPU_BROADWELL_DE:
      printf("Found Broadwell-DE CPU\n");
      break;
    case CPU_SKYLAKE:
      printf("Found Skylake CPU\n");
      break;
    case CPU_SKYLAKE_HS:
      printf("Found Skylake-HS CPU\n");
      break;
    case CPU_SKYLAKE_X:
      printf("Found Skylake-X CPU\n");
      break;
    case CPU_KNIGHTS_LANDING:
      printf("Found Knights-Landing CPU\n");
      break;
    case CPU_KNIGHTS_MILL:
      printf("Found Knights-Mill CPU\n");
      break;
    case CPU_KABYLAKE_MOBILE:
      printf("Found Kabylake-Mobile CPU\n");
      break;
    case CPU_KABYLAKE:
      printf("Found Kabylake CPU\n");
      break;
    case CPU_ATOM_SILVERMONT:
      printf("Found Atom-Silvermont CPU\n");
      break;
    case CPU_ATOM_AIRMONT:
      printf("Found Atom-Airmont CPU\n");
      break;
    case CPU_ATOM_MERRIFIELD:
      printf("Found Atom-Merrifield CPU\n");
      break;
    case CPU_ATOM_MOOREFIELD:
      printf("Found Atom-Moorefield CPU\n");
      break;
    case CPU_ATOM_GOLDMONT:
      printf("Found Atom-Goldmont CPU\n");
      break;
    case CPU_ATOM_GEMINI_LAKE:
      printf("Found Atom-Gemini-Lake CPU\n");
      break;
    case CPU_ATOM_DENVERTON:
      printf("Found Atom-Denverton CPU\n");
      break;
		default:	printf("Unsupported model %d\n",model);
				//model=-1;
				break;
	}
	return model;
}




int main(int argc, char **argv) {

  int fd;
  int core=0;
  long long result;
  double power_units,energy_units,time_units;
  double package_before,package_after;
  double pp0_before,pp0_after;
  double pp1_before=0.0,pp1_after;
  double dram_before=0.0,dram_after;
  double thermal_spec_power,minimum_power,maximum_power,time_window;
  int cpu_model;
  int c;

  int v;

    hs_init(&argc, &argv);


  opterr=0;

  while ((c = getopt (argc, argv, "c:")) != -1) {
    switch (c)
    {
    case 'c':
      core = atoi(optarg);
      break;
    default:
      exit(-1);
    }
  }

  cpu_model=detect_cpu();
  if (cpu_model<0) {
	printf("Unsupported CPU type\n");
	return -1;
  }

  printf("Checking core #%d\n",core);

  fd=open_msr(core);

  /* Calculate the units used */
  result=read_msr(fd,MSR_RAPL_POWER_UNIT);
  
  power_units=pow(0.5,(double)(result&0xf));
  energy_units=pow(0.5,(double)((result>>8)&0x1f));
  time_units=pow(0.5,(double)((result>>16)&0xf));

  printf("Power units = %.3fW\n",power_units);
  printf("Energy units = %.8fJ\n",energy_units);
  printf("Time units = %.8fs\n",time_units);
  printf("\n");

  /* Show package power info */
  result=read_msr(fd,MSR_PKG_POWER_INFO);
  thermal_spec_power=power_units*(double)(result&0x7fff);
  printf("Package thermal spec: %.3fW\n",thermal_spec_power);
  minimum_power=power_units*(double)((result>>16)&0x7fff);
  printf("Package minimum power: %.3fW\n",minimum_power);
  maximum_power=power_units*(double)((result>>32)&0x7fff);
  printf("Package maximum power: %.3fW\n",maximum_power);
  time_window=time_units*(double)((result>>48)&0x7fff);
  printf("Package maximum time window: %.6fs\n",time_window);

  /* Show package power limit */
  result=read_msr(fd,MSR_PKG_RAPL_POWER_LIMIT);
  printf("Package power limits are %s\n", (result >> 63) ? "locked" : "unlocked");
  double pkg_power_limit_1 = power_units*(double)((result>>0)&0x7FFF);
  double pkg_time_window_1 = time_units*(double)((result>>17)&0x007F);
  printf("Package power limit #1: %.3fW for %.6fs (%s, %s)\n", pkg_power_limit_1, pkg_time_window_1,
           (result & (1LL<<15)) ? "enabled" : "disabled",
           (result & (1LL<<16)) ? "clamped" : "not_clamped");
  double pkg_power_limit_2 = power_units*(double)((result>>32)&0x7FFF);
  double pkg_time_window_2 = time_units*(double)((result>>49)&0x007F);
  printf("Package power limit #2: %.3fW for %.6fs (%s, %s)\n", pkg_power_limit_2, pkg_time_window_2,
          (result & (1LL<<47)) ? "enabled" : "disabled",
          (result & (1LL<<48)) ? "clamped" : "not_clamped");

  printf("\n");

  /* result=read_msr(fd,MSR_RAPL_POWER_UNIT); */

  result=read_msr(fd,MSR_PKG_ENERGY_STATUS);
  package_before=(double)result*energy_units;
  printf("Package energy before: %.6fJ\n",package_before);

  /* only available on *Bridge-EP */
  if ((cpu_model==CPU_SANDYBRIDGE_EP) || (cpu_model==CPU_IVYBRIDGE_EP))
  {
    result=read_msr(fd,MSR_PKG_PERF_STATUS);
    double acc_pkg_throttled_time=(double)result*time_units;
    printf("Accumulated Package Throttled Time : %.6fs\n",acc_pkg_throttled_time);
  }

  result=read_msr(fd,MSR_PP0_ENERGY_STATUS);
  pp0_before=(double)result*energy_units;
  printf("PowerPlane0 (core) for core %d energy before: %.6fJ\n",core,pp0_before);

  result=read_msr(fd,MSR_PP0_POLICY);
  int pp0_policy=(int)result&0x001f;
  printf("PowerPlane0 (core) for core %d policy: %d\n",core,pp0_policy);

  /* only available on *Bridge-EP */
  if ((cpu_model==CPU_SANDYBRIDGE_EP) || (cpu_model==CPU_IVYBRIDGE_EP))
  {
    result=read_msr(fd,MSR_PP0_PERF_STATUS);
    double acc_pp0_throttled_time=(double)result*time_units;
    printf("PowerPlane0 (core) Accumulated Throttled Time : %.6fs\n",acc_pp0_throttled_time);
  }

  /* not available on *Bridge-EP */
  //if ((cpu_model==CPU_SANDYBRIDGE) || (cpu_model==CPU_IVYBRIDGE) ||
	//(cpu_model==CPU_HASWELL)) {
  if ((cpu_model!=CPU_SANDYBRIDGE_EP) && (cpu_model!=CPU_IVYBRIDGE_EP)) {
     result=read_msr(fd,MSR_PP1_ENERGY_STATUS);
     pp1_before=(double)result*energy_units;
     printf("PowerPlane1 (on-core GPU if avail) before: %.6fJ\n",pp1_before);
     result=read_msr(fd,MSR_PP1_POLICY);
     int pp1_policy=(int)result&0x001f;
     printf("PowerPlane1 (on-core GPU if avail) %d policy: %d\n",core,pp1_policy);
  }

	/* Despite documentation saying otherwise, it looks like */
	/* You can get DRAM readings on regular Haswell          */
  //if ((cpu_model==CPU_SANDYBRIDGE_EP) || (cpu_model==CPU_IVYBRIDGE_EP) ||
	//(cpu_model==CPU_HASWELL)) {
  if ((cpu_model!=CPU_SANDYBRIDGE) && (cpu_model!=CPU_IVYBRIDGE)) {
     result=read_msr(fd,MSR_DRAM_ENERGY_STATUS);
     dram_before=(double)result*energy_units;
     printf("DRAM energy before: %.6fJ\n",dram_before);
  }

  printf("Introduza um inteiro: \n");scanf("%d",&v);
 
 // printf("\n\n fib(%d): %lld \n\n",v,fib(v));
  //   printf("\n\n fibe(%d): %lld \n\n",v,fibe(v));


  //  printf("\n\n fib(%d): %lld \n\n",45,fib(45));
  //  printf("\n\n fibE(%d): %lld \n\n",45,fibe(45));

  // Calling HASKELL

  //  printf("Fibonacci standard(%d): %d\n", v, fib_hs(v));
  printf("Fibonacci efficient(%d): %d\n", v, fibe(v));

  result=read_msr(fd,MSR_PKG_ENERGY_STATUS);
  package_after=(double)result*energy_units;
  printf("Package energy after: %.6f  (%.6fJ consumed)\n",
	 package_after,package_after-package_before);

  result=read_msr(fd,MSR_PP0_ENERGY_STATUS);
  pp0_after=(double)result*energy_units;
  printf("PowerPlane0 (core) for core %d energy after: %.6f  (%.6fJ consumed)\n",
	 core,pp0_after,pp0_after-pp0_before);

  /* not available on SandyBridge-EP */

  //if ((cpu_model==CPU_SANDYBRIDGE) || (cpu_model==CPU_IVYBRIDGE) ||
  //(cpu_model==CPU_HASWELL)) {
  if ((cpu_model!=CPU_SANDYBRIDGE_EP) && (cpu_model!=CPU_IVYBRIDGE_EP)) {
     result=read_msr(fd,MSR_PP1_ENERGY_STATUS);
     pp1_after=(double)result*energy_units;
     printf("PowerPlane1 (on-core GPU if avail) after: %.6f  (%.6fJ consumed)\n",
	 pp1_after,pp1_after-pp1_before);
  }

  //if ((cpu_model==CPU_SANDYBRIDGE_EP) || (cpu_model==CPU_IVYBRIDGE_EP) ||
  //(cpu_model==CPU_HASWELL)) {
  if ((cpu_model!=CPU_SANDYBRIDGE) && (cpu_model!=CPU_IVYBRIDGE)) {
     result=read_msr(fd,MSR_DRAM_ENERGY_STATUS);
     dram_after=(double)result*energy_units;
     printf("DRAM energy after: %.6f  (%.6fJ consumed)\n",
	 dram_after,dram_after-dram_before);
  }












  printf("\n");
  printf("Note: the energy measurements can overflow in 60s or so\n");
  printf("      so try to sample the counters more often than that.\n\n");
  close(fd);

  hs_exit();
  return 0;
}



/* 
 *  sudo modprobe msr
 *  change permitions.
 *
 * taskset
 */
