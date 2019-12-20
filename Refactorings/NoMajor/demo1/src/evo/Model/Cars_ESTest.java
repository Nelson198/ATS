/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:39:24 GMT 2019
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Car;
import Model.Cars;
import Model.Owner;
import Utils.Point;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cars_ESTest extends Cars_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.1);
      Point point0 = new Point(double0, double0);
      Point point1 = point0.clone();
      Car.CarType car_CarType0 = Car.CarType.gas;
      try { 
        cars0.getCar(point1, point0, 1.0, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double((-2509.5029117));
      Point point0 = new Point(double0, double0);
      Point point1 = point0.clone();
      Car.CarType car_CarType0 = Car.CarType.any;
      try { 
        cars0.getCar("MaisBarato", point0, point1, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      Point point1 = point0.clone();
      Car.CarType car_CarType0 = Car.CarType.electric;
      try { 
        cars0.getCar("MaisPerto", point1, point0, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cars cars0 = new Cars();
      Car.CarType car_CarType0 = Car.CarType.electric;
      Owner owner0 = new Owner("", "", "e-=3'>La>d2", 0, "e-=3'>La>d2");
      Double double0 = new Double((-94.3892018));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 1035.004, 0, 0, 0, point0, "");
      cars0.addCar(car0);
      ArrayList<Car> arrayList0 = cars0.listOfCarType(car_CarType0);
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Owner owner0 = new Owner("Model.Client", "Model.Client", "Model.Client", 52, "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Car car0 = new Car("Model.Client", owner0, car_CarType0, 52, 0.0, 0.0, 758, point0, ".^7?SwcG@A");
      cars0.addCar(car0);
      Car car1 = cars0.getCar(point0, 1.2, car_CarType0);
      assertSame(car1, car0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cars cars0 = new Cars();
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-132.7704));
      Point point0 = new Point(double0, double0);
      // Undeclared exception!
      try { 
        cars0.getCar((String) null, point0, point0, car_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("MaiBara|Mo", (String) null, "MaiBara|Mo", 1, "C{Z(UT");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 2410.358275, 0.0, (-1), (Point) null, "Custo Total: ");
      cars0.addCar(car0);
      Double double0 = new Double(0.1);
      Point point0 = new Point(double0, double0);
      // Undeclared exception!
      try { 
        cars0.getCar(point0, point0, 0.1, car_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("Model.Cars", "MaisBarato", "D?6DG`]!/3l-)sfn;x", (-1849489121), "T|s1SsD(h");
      Car.CarType car_CarType0 = Car.CarType.any;
      Car car0 = new Car("MaisBarato", owner0, car_CarType0, (-70.717686726), 1.0, 265.0, 0, (Point) null, "T|s1SsD(h");
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.getCar((Point) null, (-70.717686726), car_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cars cars0 = new Cars();
      // Undeclared exception!
      try { 
        cars0.addCar((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cars cars0 = new Cars();
      boolean boolean0 = cars0.equals("e-=3'>La>d2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Cars cars0 = new Cars();
      boolean boolean0 = cars0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Cars cars0 = new Cars();
      boolean boolean0 = cars0.equals(cars0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Cars cars0 = new Cars();
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-94.3892018));
      Point point0 = new Point(double0, double0);
      try { 
        cars0.getCar("e-=3'>La>d2", point0, point0, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Cars cars0 = new Cars();
      try { 
        cars0.searchCar((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("D56HH64rf*<T@", "?", "D56HH64rf*<T@", (-520), "D56HH64rf*<T@");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("?", owner0, car_CarType0, (-520), (-520), (-525.2208277066268), (-1719145501), point0, "?");
      cars0.addCar(car0);
      Car car1 = cars0.searchCar("?");
      assertSame(car1, car0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("D56HH64rf*<T@", "?", "D56HH64rf*<T@", (-520), "D56HH64rf*<T@");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("?", owner0, car_CarType0, (-520), (-520), (-525.2208277066268), (-1719145501), point0, "?");
      cars0.addCar(car0);
      try { 
        cars0.addCar(car0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.15);
      Point point0 = new Point(double0, double0);
      Car.CarType car_CarType0 = Car.CarType.electric;
      try { 
        cars0.getCar(point0, 0.15, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Cars cars0 = new Cars();
      Car.CarType car_CarType0 = Car.CarType.electric;
      ArrayList<Car> arrayList0 = cars0.listOfCarType(car_CarType0);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Cars cars0 = new Cars();
      Cars cars1 = cars0.clone();
      assertTrue(cars1.equals((Object)cars0));
      
      Car.CarType car_CarType0 = Car.CarType.electric;
      Owner owner0 = new Owner("", "", "e-=3'>La>d2", 0, "e-=3'>La>d2");
      Double double0 = new Double((-94.3892018));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 1035.004, 0, 0, 0, point0, "");
      cars1.addCar(car0);
      boolean boolean0 = cars1.equals(cars0);
      assertFalse(cars1.equals((Object)cars0));
      assertFalse(boolean0);
  }
}
