/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:42:53 GMT 2019
 */

package View.ViewModel;

import org.junit.Test;
import static org.junit.Assert.*;
import Utils.Point;
import View.ViewModel.SpecificCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpecificCar_ESTest extends SpecificCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpecificCar specificCar0 = new SpecificCar((Point) null, (String) null);
      Point point0 = specificCar0.getPoint();
      assertNull(point0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpecificCar specificCar0 = new SpecificCar((Point) null, (String) null);
      String string0 = specificCar0.getNumberPlate();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      SpecificCar specificCar0 = new SpecificCar(point0, ")");
      String string0 = specificCar0.getNumberPlate();
      assertEquals(")", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double((-2115.670232549));
      Point point0 = new Point(double0, double0);
      SpecificCar specificCar0 = new SpecificCar(point0, "");
      Point point1 = specificCar0.getPoint();
      assertSame(point0, point1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double((-2115.670232549));
      Point point0 = new Point(double0, double0);
      SpecificCar specificCar0 = new SpecificCar(point0, "");
      String string0 = specificCar0.getNumberPlate();
      assertEquals("", string0);
  }
}
