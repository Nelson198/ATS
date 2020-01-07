package main;

import controller.Controller;
import model.Parser;
import model.UMCarroJa;


import java.lang.reflect.Field;
import java.io.IOException;
import exceptions.InvalidUserException;
import exceptions.WrongPasswordExecption;
import exceptions.InvalidCarException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );
   public native static int scale(int freq);
    public native static int[] freqAvailable();

    public native static double[] GetPackagePowerSpec();
    public native static double[] GetDramPowerSpec();
    public native static void SetPackagePowerLimit(int socketId, int level, double costomPower);
    public native static void SetPackageTimeWindowLimit(int socketId, int level, double costomTimeWin);
    public native static void SetDramTimeWindowLimit(int socketId, int level, double costomTimeWin);
    public native static void SetDramPowerLimit(int socketId, int level, double costomPower);
    public native static int ProfileInit();
    public native static int GetSocketNum();
    public native static String EnergyStatCheck();
    public native static void ProfileDealloc();
    public native static void SetPowerLimit(int ENABLE);
    public static int wraparoundValue;

    public static int socketNum;
    static {
        System.setProperty("java.library.path", System.getProperty("user.dir"));
        try {
            Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
            fieldSysPath.setAccessible(true);
            fieldSysPath.set(null, null);
        } catch (Exception e) { }

        System.loadLibrary("CPUScaler");
        wraparoundValue = ProfileInit();
        socketNum = GetSocketNum();
    }

    /**
     * @return an array of current energy information.
     * The first entry is: Dram/uncore gpu energy(depends on the cpu architecture.
     * The second entry is: CPU energy
     * The third entry is: Package energy
     */

    public static double[] getEnergyStats() {
        socketNum = GetSocketNum();
        String EnergyInfo = EnergyStatCheck();
        //System.out.println(EnergyInfo);
        /*One Socket*/
        if(socketNum == 1) {
            double[] stats = new double[3];
            String[] energy = EnergyInfo.split("#");

            stats[0] = Double.parseDouble(energy[0].replaceFirst(",","."));
            stats[1] = Double.parseDouble(energy[1].replaceFirst(",","."));
            stats[2] = Double.parseDouble(energy[2].replaceFirst(",","."));

            return stats;

        } else {
        /*Multiple sockets*/
            String[] perSockEner = EnergyInfo.split("@");
            double[] stats = new double[3*socketNum];
            int count = 0;


            for(int i = 0; i < perSockEner.length; i++) {
                String[] energy = perSockEner[i].split("#");
                for(int j = 0; j < energy.length; j++) {
                    count = i * 3 + j;  //accumulative count
                    stats[count] = Double.parseDouble(energy[j].replaceFirst(",","."));
                }
            }
            return stats;
        }

    }
    public static void main(String[] args) {
        UMCarroJa model = new UMCarroJa();
        try {
            model = UMCarroJa.read(".tmp");
            LOGGER.log(Level.ALL, "adasdsada1");
        }
        catch (IOException | ClassNotFoundException e) {
            LOGGER.log(Level.ALL, "adasdsada2");
             System.out.println("adasdsada2");double[] before = getEnergyStats();
            new Parser("../../../db/logsPOO_carregamentoInicial.bak", model);
            double[] after = getEnergyStats();  
            System.out.println("Energy consumption of dram: " + (after[0] - before[0])+ " Energy consumption of cpu: " + (after[1] - before[1])+ " Energy consumption of package: " + (after[2] - before[2]));
               try {
            double[] beforei = getEnergyStats();
            model.logIn("168283301@outlook.com","168283301@outlook.com");
            model.logIn("168283301@outlook.com","168283301@outlook.com");
            model.logIn("168283301@outlook.com","168283301@outlook.com");
            model.logIn("168283301@outlook.com","168283301@outlook.com");
            model.logIn("168283301@outlook.com","168283301@outlook.com");
            model.logIn("168283301@outlook.com","168283301@outlook.com");
            model.getBestClientsTravel();
            model.getBestClientsTimes();
            model.getBestClients();
            model.rate("231390477",78);
            model.rate("778124711",01);
            model.rate("231390477",99);
            model.rate("151156220",56);
            double[] afteri = getEnergyStats(); 
            System.out.println("Functions Energy consumption of dram: " + (afteri[0] - beforei[0])+ " Energy consumption of cpu: " + (afteri[1] - beforei[1])+ " Energy consumption of package: " + (afteri[2] - beforei[2]));
            

        } catch (InvalidCarException | InvalidUserException | WrongPasswordExecption w) {};
        }
        try { Thread.sleep(10000);} catch (Exception e) {
            LOGGER.log(Level.ALL, e.toString(), e);
        }
        new Controller(model).run();
        try {
            model.save(".tmp");
        }
        catch (IOException e) {
            LOGGER.log(Level.ALL, e.toString(), e);
        }
    }
}
