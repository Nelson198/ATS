/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:43:58 GMT 2019
 */

package View.ViewModel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Utils.Point;
import View.ViewModel.CheapestNearCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CheapestNearCar_ESTest extends CheapestNearCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      CheapestNearCar cheapestNearCar0 = new CheapestNearCar(point0, 0, "gas");
      int int0 = cheapestNearCar0.getWalkDistance();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CheapestNearCar cheapestNearCar0 = new CheapestNearCar((Point) null, (-2096), "hybrid");
      int int0 = cheapestNearCar0.getWalkDistance();
      assertEquals((-2096), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CheapestNearCar cheapestNearCar0 = new CheapestNearCar((Point) null, (-2096), "hybrid");
      cheapestNearCar0.getPoint();
      assertEquals((-2096), cheapestNearCar0.getWalkDistance());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      CheapestNearCar cheapestNearCar0 = null;
      try {
        cheapestNearCar0 = new CheapestNearCar(point0, (-3122), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.CheapestNearCar", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double((-0.2765570708356885));
      Point point0 = new Point(double0, double0);
      CheapestNearCar cheapestNearCar0 = new CheapestNearCar(point0, 80982235, "electric");
      cheapestNearCar0.getPoint();
      assertEquals(80982235, cheapestNearCar0.getWalkDistance());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Double double0 = new Double((-0.2765570708356885));
      Point point0 = new Point(double0, double0);
      CheapestNearCar cheapestNearCar0 = new CheapestNearCar(point0, 80982235, "electric");
      cheapestNearCar0.getType();
      assertEquals(80982235, cheapestNearCar0.getWalkDistance());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = new Double((-0.2765570708356885));
      Point point0 = new Point(double0, double0);
      CheapestNearCar cheapestNearCar0 = new CheapestNearCar(point0, 80982235, "electric");
      int int0 = cheapestNearCar0.getWalkDistance();
      assertEquals(80982235, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CheapestNearCar cheapestNearCar0 = null;
      try {
        cheapestNearCar0 = new CheapestNearCar((Point) null, 0, "NH0E<vP`?Op+");
        fail("Expecting exception: Throwable");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.CheapestNearCar", e);
      }
  }
}
