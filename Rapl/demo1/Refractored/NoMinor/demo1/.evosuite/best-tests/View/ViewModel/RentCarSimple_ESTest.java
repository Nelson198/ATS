/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:41:57 GMT 2019
 */

package view.view_model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import model.Car;
import utils.Point;
import view.view_model.RentCarSimple;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RentCarSimple_ESTest extends RentCarSimple_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double((-1069.66975414));
      Point point0 = new Point(double0, double0);
      RentCarSimple rentCarSimple0 = new RentCarSimple(point0, "hybrid");
      Point point1 = rentCarSimple0.getPoint();
      assertSame(point1, point0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RentCarSimple rentCarSimple0 = null;
      try {
        rentCarSimple0 = new RentCarSimple((Point) null, "\n");
        fail("Expecting exception: Throwable");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.RentCarSimple", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Double double0 = new Double((-344.032764691));
      Point point0 = new Point(double0, double0);
      RentCarSimple rentCarSimple0 = null;
      try {
        rentCarSimple0 = new RentCarSimple(point0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.RentCarSimple", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RentCarSimple rentCarSimple0 = new RentCarSimple((Point) null, "any");
      Car.CarType car_CarType0 = rentCarSimple0.getCarType();
      assertEquals(Car.CarType.any, car_CarType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RentCarSimple rentCarSimple0 = new RentCarSimple((Point) null, "any");
      Point point0 = rentCarSimple0.getPoint();
      assertNull(point0);
  }
}
