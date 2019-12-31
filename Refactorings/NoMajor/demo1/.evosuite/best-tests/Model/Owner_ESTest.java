/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:39:53 GMT 2019
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Car;
import Model.Client;
import Model.Owner;
import Model.Rental;
import Utils.Point;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Owner_ESTest extends Owner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Owner owner0 = new Owner("KtG8d", "KtG8d", "", 1, "");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 1, 1, 1, 1, point0, "");
      Client client0 = new Client(point0, ";!/", "\n", "\n", "\n", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.refuse(rental0);
      assertEquals(100, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Owner owner0 = new Owner("", "LSmCPa", "", (-946), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(1.2);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-946), 4750.004525092, 2966.943139349, (-946), point0, "VpH_D<<\"t_gpm");
      Client client0 = new Client(point0, "VpH_D<<\"t_gpm", "", "cR}f", "", (-946));
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.addPendingRental(rental0);
      ArrayList<Rental> arrayList0 = owner0.getPending();
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner("x_@~c5", "x_@~c5", "x_@~c5", (-340), "");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-340), 0.1, (-2032.0), 0, point0, "");
      owner0.addCar(car0);
      List<Car> list0 = owner0.getCars();
      assertTrue(list0.contains(car0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Owner owner0 = new Owner("90C[=,l.ie{j", "", "", 0, "5rz");
      owner0.rate(0);
      Owner owner1 = owner0.clone();
      assertNotSame(owner0, owner1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Owner owner0 = new Owner("{*-5 A13U8c", ";Oa>/HBz=W)7Ej", "{*-5 A13U8c", 0, "N,QbrLhQ%+U?9Ek");
      owner0.rate((-963));
      Owner owner1 = owner0.clone();
      assertEquals((-963), owner1.getRates());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Owner owner0 = new Owner("gas", "h^HwtlnP+R|05XDf", "{*-5 A13U8c", 0, "~:Hre.4(:-Z");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("gas", owner0, car_CarType0, 0, 0.0, (-3740.0), 0, point0, "gas");
      Client client0 = new Client(point0, "h^HwtlnP+R|05XDf", "Spring", (String) null, "%.2f", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.addPendingRental(rental0);
      // Undeclared exception!
      try { 
        owner0.accept((Rental) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Owner", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Owner owner0 = new Owner("x_@~c5", "x_@~c5", "x_@~c5", (-340), "");
      List<Car> list0 = owner0.getCars();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Owner owner0 = new Owner("p;<M", "p;<M", "p;<M", 10, "p;<M");
      Owner owner1 = owner0.clone();
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(10);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("p;<M", owner0, car_CarType0, 10, 10, 10, 10, point0, "p;<M");
      Client client0 = new Client(point0, "p;<M", "p;<M", "p;<M", "p;<M", 10);
      Rental rental0 = new Rental(car0, client0, point0);
      assertTrue(owner0.equals((Object)owner1));
      
      owner1.accept(rental0);
      boolean boolean0 = owner0.equals(owner1);
      assertFalse(owner1.equals((Object)owner0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Owner owner0 = new Owner("\n\n", "\n\n", (String) null, 25, "\n\n");
      Owner owner1 = owner0.clone();
      boolean boolean0 = owner1.equals(owner0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 978, "");
      boolean boolean0 = owner0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Owner owner0 = new Owner("\n\n", "\n\n", (String) null, 25, "\n\n");
      boolean boolean0 = owner0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Owner owner0 = new Owner("p;<KMZ", " 21-]Z.+", "ML6n<2.6<L WP3$(CS", 0, " 21-]Z.+");
      boolean boolean0 = owner0.equals(owner0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Owner owner0 = new Owner("Carro:          ", "Client:        ", "Carro:          ", 0, "{hoa-GN$e");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(3);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Carro:          ", owner0, car_CarType0, 0.0, 1051.8896979969, 2149.0114, 3, point0, "Client:        ");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        owner0.rate(rental0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 978, "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(978);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 978, 978, 978, 978, point0, "");
      owner0.addCar(car0);
      Owner owner1 = new Owner("", "", "", 978, "");
      boolean boolean0 = owner0.equals(owner1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Owner owner0 = new Owner("p;<KMZ", " 21-]Z.+", "ML6n<2.6<L WP3$(CS", 0, " 21-]Z.+");
      Owner owner1 = owner0.clone();
      Double double0 = new Double(0);
      Car.CarType car_CarType0 = Car.CarType.any;
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("{*-5 A13U8c", owner0, car_CarType0, 0.0, (-227.63195), 0.0, 0, point0, "p;<KMZ");
      Client client0 = new Client(point0, "", " 21-]Z.+", "", "ML6n<2.6<L WP3$(CS", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      assertTrue(owner0.equals((Object)owner1));
      
      owner1.addPendingRental(rental0);
      boolean boolean0 = owner0.equals(owner1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Owner owner0 = new Owner("gas", "h^HwtlnP+R|05XDf", "{*-5 A13U8c", 0, "~:Hre.4(:-Z");
      ArrayList<Rental> arrayList0 = owner0.getPending();
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 647, "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(647);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 647, 647, 647, 647, point0, "");
      Client client0 = new Client(point0, "", "", "", "", 647);
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.rate(rental0, 647);
      assertEquals(647, client0.getRates());
  }
}
