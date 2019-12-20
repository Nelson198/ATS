/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:42:24 GMT 2019
 */

package View.ViewModel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Utils.Point;
import View.ViewModel.RegisterCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegisterCar_ESTest extends RegisterCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("S1bSxEv", "any", (-1.0), 0.0, 0.0, 0, point0, "Todos");
      int int0 = registerCar0.getRange();
      assertEquals("Todos", registerCar0.getBrand());
      assertEquals("S1bSxEv", registerCar0.getNumberPlate());
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(0.0, registerCar0.getBasePrice(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("a&XkRXb^>", "electric", 0.0, 730.653204324119, 0.0, 1667, point0, "View.ViewModel.RegisterCar");
      int int0 = registerCar0.getRange();
      assertEquals("View.ViewModel.RegisterCar", registerCar0.getBrand());
      assertEquals(1667, int0);
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(730.653204324119, registerCar0.getBasePrice(), 0.01);
      assertEquals("a&XkRXb^>", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("any", "any", (-1.0), (-1.0), 1.0, 1560, (Point) null, "any");
      registerCar0.getPos();
      assertEquals(1.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(1560, registerCar0.getRange());
      assertEquals((-1.0), registerCar0.getBasePrice(), 0.01);
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar((String) null, "electric", (-1.0), 2.0, 2398.48, 100, (Point) null, "");
      String string0 = registerCar0.getNumberPlate();
      assertEquals(2398.48, registerCar0.getGasMileage(), 0.01);
      assertNull(string0);
      assertEquals("", registerCar0.getBrand());
      assertEquals(2.0, registerCar0.getBasePrice(), 0.01);
      assertEquals(100, registerCar0.getRange());
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("", "any", (-1.0), (-2941.932084191339), (-1.0), (-1767), point0, "");
      String string0 = registerCar0.getNumberPlate();
      assertEquals((-1.0), registerCar0.getGasMileage(), 0.01);
      assertEquals((-2941.932084191339), registerCar0.getBasePrice(), 0.01);
      assertEquals("", registerCar0.getBrand());
      assertEquals((-1767), registerCar0.getRange());
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 0.0, 0.15, 0.0, (-1767), point0, "_r");
      double double0 = registerCar0.getGasMileage();
      assertEquals(0.0, double0, 0.01);
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals("_r", registerCar0.getBrand());
      assertEquals(0.15, registerCar0.getBasePrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("", "any", (-1.0), (-2941.932084191339), (-1.0), (-1767), point0, "");
      double double0 = registerCar0.getGasMileage();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
      assertEquals("", registerCar0.getNumberPlate());
      assertEquals((-2941.932084191339), registerCar0.getBasePrice(), 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals("", registerCar0.getBrand());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("", "any", 0.0, 2483.4, 0.0, (-417), point0, (String) null);
      String string0 = registerCar0.getBrand();
      assertEquals((-417), registerCar0.getRange());
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(2483.4, registerCar0.getBasePrice(), 0.01);
      assertNull(string0);
      assertEquals("", registerCar0.getNumberPlate());
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("", "any", (-1.0), (-2941.932084191339), (-1.0), (-1767), point0, "");
      String string0 = registerCar0.getBrand();
      assertEquals("", registerCar0.getNumberPlate());
      assertEquals("", string0);
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-1.0), registerCar0.getGasMileage(), 0.01);
      assertEquals((-2941.932084191339), registerCar0.getBasePrice(), 0.01);
      assertEquals((-1767), registerCar0.getRange());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", (-1.0), 0.0, (-1.0), (-1767), point0, "_r");
      double double0 = registerCar0.getBasePrice();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1.0), registerCar0.getGasMileage(), 0.01);
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals("_r", registerCar0.getBrand());
      assertEquals((-1767), registerCar0.getRange());
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("", "any", (-1.0), (-2941.932084191339), (-1.0), (-1767), point0, "");
      double double0 = registerCar0.getBasePrice();
      assertEquals((-1767), registerCar0.getRange());
      assertEquals("", registerCar0.getBrand());
      assertEquals("", registerCar0.getNumberPlate());
      assertEquals((-2941.932084191339), double0, 0.01);
      assertEquals((-1.0), registerCar0.getGasMileage(), 0.01);
      assertEquals((-1.0), registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 0.0, 0.15, 0.0, (-1767), point0, "_r");
      double double0 = registerCar0.getAvgSpeed();
      assertEquals((-1767), registerCar0.getRange());
      assertEquals(0.15, registerCar0.getBasePrice(), 0.01);
      assertEquals("_r", registerCar0.getBrand());
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", (-1.0), 0.15, (-1.0), (-1767), point0, "_r");
      double double0 = registerCar0.getAvgSpeed();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals((-1.0), registerCar0.getGasMileage(), 0.01);
      assertEquals(0.15, registerCar0.getBasePrice(), 0.01);
      assertEquals("_r", registerCar0.getBrand());
      assertEquals("_r", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = null;
      try {
        registerCar0 = new RegisterCar("", "", 0.0, 0.0, 0.0, 0, point0, "");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.RegisterCar", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = null;
      try {
        registerCar0 = new RegisterCar((String) null, (String) null, 1282.77844802, 1911.9413679215065, (-2693.491523888), 0, point0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.RegisterCar", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      int int0 = registerCar0.getRange();
      assertEquals("any", registerCar0.getBrand());
      assertEquals((-1767), int0);
      assertEquals(23.09838443166806, registerCar0.getBasePrice(), 0.01);
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals(23.09838443166806, registerCar0.getAvgSpeed(), 0.01);
      assertEquals(23.09838443166806, registerCar0.getGasMileage(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      double double0 = registerCar0.getBasePrice();
      assertEquals("any", registerCar0.getBrand());
      assertEquals(23.09838443166806, registerCar0.getAvgSpeed(), 0.01);
      assertEquals(23.09838443166806, registerCar0.getGasMileage(), 0.01);
      assertEquals(23.09838443166806, double0, 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals("_r", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      double double0 = registerCar0.getAvgSpeed();
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals("any", registerCar0.getBrand());
      assertEquals((-1767), registerCar0.getRange());
      assertEquals(23.09838443166806, registerCar0.getBasePrice(), 0.01);
      assertEquals(23.09838443166806, double0, 0.01);
      assertEquals(23.09838443166806, registerCar0.getGasMileage(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      String string0 = registerCar0.getBrand();
      assertEquals(23.09838443166806, registerCar0.getGasMileage(), 0.01);
      assertEquals(23.09838443166806, registerCar0.getBasePrice(), 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals(23.09838443166806, registerCar0.getAvgSpeed(), 0.01);
      assertEquals("any", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      registerCar0.getType();
      assertEquals((-1767), registerCar0.getRange());
      assertEquals(23.09838443166806, registerCar0.getBasePrice(), 0.01);
      assertEquals("any", registerCar0.getBrand());
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals(23.09838443166806, registerCar0.getGasMileage(), 0.01);
      assertEquals(23.09838443166806, registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      double double0 = registerCar0.getGasMileage();
      assertEquals("_r", registerCar0.getNumberPlate());
      assertEquals(23.09838443166806, registerCar0.getBasePrice(), 0.01);
      assertEquals(23.09838443166806, double0, 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals(23.09838443166806, registerCar0.getAvgSpeed(), 0.01);
      assertEquals("any", registerCar0.getBrand());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      String string0 = registerCar0.getNumberPlate();
      assertEquals("_r", string0);
      assertEquals(23.09838443166806, registerCar0.getBasePrice(), 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals(23.09838443166806, registerCar0.getGasMileage(), 0.01);
      assertEquals("any", registerCar0.getBrand());
      assertEquals(23.09838443166806, registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      doReturn("_r").when(point0).toString();
      RegisterCar registerCar0 = new RegisterCar("_r", "any", 23.09838443166806, 23.09838443166806, 23.09838443166806, (-1767), point0, "any");
      registerCar0.getPos();
      assertEquals(23.09838443166806, registerCar0.getGasMileage(), 0.01);
      assertEquals(23.09838443166806, registerCar0.getAvgSpeed(), 0.01);
      assertEquals(23.09838443166806, registerCar0.getBasePrice(), 0.01);
      assertEquals((-1767), registerCar0.getRange());
      assertEquals("any", registerCar0.getBrand());
      assertEquals("_r", registerCar0.getNumberPlate());
  }
}
