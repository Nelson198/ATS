/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:42:15 GMT 2019
 */

package view.view_model;

import org.junit.Test;
import static org.junit.Assert.*;
import view.view_model.RateOwnerCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RateOwnerCar_ESTest extends RateOwnerCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar(0, (-1));
      int int0 = rateOwnerCar0.getOwnerRate();
      assertEquals(0, int0);
      assertEquals((-1), rateOwnerCar0.getCarRate());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar(180, 1458);
      int int0 = rateOwnerCar0.getOwnerRate();
      assertEquals(180, int0);
      assertEquals(1458, rateOwnerCar0.getCarRate());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar(180, 1458);
      int int0 = rateOwnerCar0.getCarRate();
      assertEquals(180, rateOwnerCar0.getOwnerRate());
      assertEquals(1458, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar((-1339), (-1339));
      int int0 = rateOwnerCar0.getCarRate();
      assertEquals((-1339), rateOwnerCar0.getOwnerRate());
      assertEquals((-1339), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar((-1), 0);
      int int0 = rateOwnerCar0.getCarRate();
      assertEquals((-1), rateOwnerCar0.getOwnerRate());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar((-1), 0);
      int int0 = rateOwnerCar0.getOwnerRate();
      assertEquals((-1), int0);
      assertEquals(0, rateOwnerCar0.getCarRate());
  }
}
