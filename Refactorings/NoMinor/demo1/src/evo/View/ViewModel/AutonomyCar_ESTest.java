/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:43:12 GMT 2019
 */

package view.view_model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import utils.Point;
import view.view_model.AutonomyCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutonomyCar_ESTest extends AutonomyCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AutonomyCar autonomyCar0 = new AutonomyCar((Point) null, (-1), "any");
      autonomyCar0.getPoint();
      assertEquals((-1), autonomyCar0.getAutonomy());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Double double0 = new Double((-913.444711));
      Point point0 = new Point(double0, double0);
      AutonomyCar autonomyCar0 = new AutonomyCar(point0, 0, "hybrid");
      int int0 = autonomyCar0.getAutonomy();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AutonomyCar autonomyCar0 = new AutonomyCar((Point) null, 1867, "any");
      int int0 = autonomyCar0.getAutonomy();
      assertEquals(1867, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double(429.22206);
      Point point0 = new Point(double0, double0);
      AutonomyCar autonomyCar0 = null;
      try {
        autonomyCar0 = new AutonomyCar(point0, (-720), "Hibrido");
        fail("Expecting exception: Throwable");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.AutonomyCar", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      AutonomyCar autonomyCar0 = null;
      try {
        autonomyCar0 = new AutonomyCar(point0, 0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.AutonomyCar", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Double double0 = new Double((-18.85623554721566));
      Point point0 = new Point(double0, double0);
      AutonomyCar autonomyCar0 = new AutonomyCar(point0, (-1881), "any");
      autonomyCar0.getType();
      assertEquals((-1881), autonomyCar0.getAutonomy());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = new Double((-1402.597));
      Point point0 = new Point(double0, double0);
      AutonomyCar autonomyCar0 = new AutonomyCar(point0, 1283, "any");
      autonomyCar0.getPoint();
      assertEquals(1283, autonomyCar0.getAutonomy());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Double double0 = new Double((-18.85623554721566));
      Point point0 = new Point(double0, double0);
      AutonomyCar autonomyCar0 = new AutonomyCar(point0, (-1881), "any");
      int int0 = autonomyCar0.getAutonomy();
      assertEquals((-1881), int0);
  }
}
