/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:37:51 GMT 2019
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import model.Car;
import model.Client;
import model.Owner;
import model.Rental;
import utils.Point;
import java.time.LocalDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rental_ESTest extends Rental_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Owner owner0 = new Owner("", "Electrico", "", 1334, "");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1334);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Electrico", owner0, car_CarType0, (-1.3187834049540834), (-1.3187834049540834), (-1.3187834049540834), 0, point0, "");
      Client client0 = new Client(point0, "", "", "Electrico", "Electrico", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      Double double1 = new Double(0.6);
      Point point1 = new Point(double1, double0);
      Car car1 = new Car("Tempo Total: -0.00 Horas\nCusto Total: -0.00\n\n\u001B[4m\u001B[0m", owner0, car_CarType0, (-325.487), 1, 0.0, 1, point1, "");
      Rental rental1 = new Rental(car1, client0, point0);
      owner0.rate(rental1, 1);
      assertEquals(1, client0.getRates());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Owner owner0 = new Owner("", "Electrico", "", 1334, "");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1334);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "", "Electrico", "Electrico", 1334);
      Double double1 = Double.valueOf(0.6);
      Point point1 = new Point(double1, double0);
      Car car0 = new Car("Tempo Total: -0.00 Horas\nCusto Total: 0.00\n\n\u001B[4m\u001B[0m", owner0, car_CarType0, (-325.487), 1, 0.0, 1, point1, "");
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toString();
      assertEquals("Client:        \nCarro:          Tempo Total: -0.00 Horas\nCusto Total: 0.00\n\n\u001B[4m\u001B[0m\nDono:           \nViagem:         (0.60, 1334.00) -> (1334.00, 1334.00)\nTempo a p\u00E9      333.35 Horas\nTempo Estimado: -4.10 Horas\nCusto Estimado: 1333.40", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner("Tempo Estimado: ", "any", "}/;&8q+<", (-837), "any");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Double double1 = Double.valueOf((-481.994));
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double1, double0);
      Car car0 = new Car("Tempo Estimado: ", owner0, car_CarType0, (-481.994), (-1880.611199070536), (-481.994), 0, point1, "");
      Client client0 = new Client(point0, "", "", "", "}/;&8q+<", 0);
      Rental rental0 = new Rental(car0, client0, point1);
      String string0 = rental0.toParsableUserString();
      assertEquals("\nTempo Estimado: \n(-481.99, 0.00)\n(-481.99, 0.00)\n170.41\n-0.00\n-0.00\n100", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Owner owner0 = new Owner("", "Electrico", "Electrico", 1334, "Electrico");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1334);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "", "Electrico", "Electrico", 1334);
      Double double1 = Double.valueOf(0.6);
      Point point1 = new Point(double1, double1);
      Car car0 = new Car("Tempo Total: -0.00 Horas\nCusto Total: -0.00\n\n\u001B[4m\u001B[0m", owner0, car_CarType0, (-325.487), 1, (-1.3187834049540834), 1, point1, "");
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Owner owner0 = new Owner("", "Electrico", "Electrico", 1334, "Electrico");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1334);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Electrico", owner0, car_CarType0, (-1.3187834049540834), (-1.3187834049540834), (-1.3187834049540834), 1334, point0, "");
      Client client0 = new Client(point0, "", "", "Electrico", "Electrico", 1334);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      rental0.rent();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(2052);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("\n", (Owner) null, car_CarType0, 1721.5835316710245, 1721.5835316710245, 1452.0, 2052, point0, "%.2f");
      Client client0 = new Client(point0, "%.2f", "qD.8|JRzqbl&#", "qD.8|JRzqbl&#", "\n", 2052);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate(2924);
      assertEquals(2924, client0.getRates());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "", "", (-912), "%.2f Horas");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(2269.2022430598);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 674.0, 189.5476866, 2269.2022430598, (-912), point0, "");
      Client client0 = new Client(point0, (String) null, "", (String) null, (String) null, (-912));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Owner owner0 = new Owner("", "", "b_=]4p+!h+~PhD0&LVc", 0, (String) null);
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(976);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0, 0, 540.625, 976, point0, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      String string0 = rental0.getOwnerID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Owner owner0 = new Owner("", "Electrico", "Electrico", 1, "Electrico");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "", "Electrico", "Electrico", 1);
      Double double1 = Double.valueOf(0.6);
      Point point1 = new Point(double1, double0);
      Car car0 = new Car("Tempo Total: -0.00 Horas\nCusto Total: 0.00\n\n\u001B[4m\u001B[0m", owner0, car_CarType0, (-325.487), 1, (-1.3187834049540834), 1, point1, "");
      Rental rental0 = new Rental(car0, client0, point0);
      double double2 = rental0.getDistance();
      assertEquals(0.4, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner("##S7I", "7+@1Ox}N'A{", "eo)dXxyBtiDvgL.AJ", (-1719), "Custo Estimado: ");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-62.5726), 0.0, 0.4, (-1719), point0, "Custo Estimado: ");
      Client client0 = new Client(point0, (String) null, "Custo Estimado: ", "HuYcK>_MlS", "HuYcK>_MlS", (-1719));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Owner owner0 = new Owner("", "Electrico", "", 1334, "");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1334);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Electrico", owner0, car_CarType0, (-1.3187834049540834), (-1.3187834049540834), (-1.3187834049540834), 0, point0, "");
      Client client0 = new Client(point0, "", "", "Electrico", "Electrico", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "", (String) null, 0, "e+GeLH+h");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, (-1919.76487933), 0.4, 0, (-1541), point0, "|6Pq&`hw 1'vpI");
      Client client0 = new Client(point0, "", (String) null, "", "", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 2260, "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(2260);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 2260, 2260, 2260, 2260, point0, "");
      Client client0 = new Client(point0, ")mawf8a1o0)4{l%q ", "lj)BRbx", "Hibrido", "Hibrido", 2260);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(2052);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("\n", (Owner) null, car_CarType0, 1721.5835316710245, 1721.5835316710245, 1452.0, 2052, point0, "%.2f");
      Client client0 = new Client(point0, "%.2f", "qD.8|JRzqbl&#", "qD.8|JRzqbl&#", "\n", 2052);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Owner owner0 = new Owner("hybrid", "", (String) null, (-1), "");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("hybrid", owner0, car_CarType0, (-1), 0.2, (-560.58624546208), (-1), point0, "v2au");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("9lxmrI0", (Owner) null, car_CarType0, 1053.0, 1053.0, 1053.0, 0, point0, "");
      Client client0 = new Client(point0, "gdhTgse|&Q-", "4K5wsYeK#{kiR*Fl<", "9lxmrI0", "wu`xwcy5MZ?_lkIXf*", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Owner owner0 = new Owner("$VALUES", "p%X}EnP", "(O=59L-{9OHJs", 80982221, "Model.Owner");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("{8785dY/Tp@", owner0, car_CarType0, 0.0, 80982221, 80982221, 0, point0, "(O=59L-{9OHJs");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableOwnerRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-1522788922));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 698.6972554185012, 0.5, 0.5, (-1522788922), point0, "");
      Client client0 = new Client(point0, "=IXIA#-]x8(XgW{g", "", "hVt@T ", "", 3);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      System.setCurrentTimeMillis((-156));
      Owner owner0 = new Owner("'", (String) null, "%U{", (-156), "Y'3[F)g6");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("%U{", owner0, car_CarType0, (-1863.90561), (-893.0), 0.15, (-156), point0, " $ZIC8yix%TfB&kz");
      Client client0 = new Client(point0, "%U{", "Y'3[F)g6", "", (String) null, (-156));
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("Model.Weather", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, (-410.5158197), (-410.5158197), (-4194.081), (-870), point0, "M+zJ5O6YV7 S");
      Client client0 = new Client(point0, "", "", "", "M+zJ5O6YV7 S", (-870));
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rate(1469, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "O carro necessita de ser abastecido\n");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-1), (-3036.7405), (-1), (-1), point0, "|_lRwSj]>49U'vBFi");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.rate((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-1540.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, (Owner) null, car_CarType0, 206.9581481993, 206.9581481993, 2.0, 0, point0, (String) null);
      Client client0 = new Client(point0, "s|`DJd6@c", (String) null, "", "m4a4!J\"HwrVi2:T_", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.getOwnerID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Owner owner0 = new Owner("", "@@1)ZJU`VxMh", "@@1)ZJU`VxMh", 1, "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(2387.777);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 1, 2387.777, 1, point0, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.getClientID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, (String) null, 8, "A");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(8);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 8, -0.0, 0.0, 8, point0, "A");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      Client client0 = new Client(point0, (String) null, (String) null, "", "A", 0);
      Rental rental1 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.equals(rental1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Client client0 = new Client((Point) null, "", "", "", "M0t", 0);
      Rental rental0 = null;
      try {
        rental0 = new Rental((Car) null, client0, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Owner owner0 = new Owner("CzA1:EMzCZ_uO=8X", "CzA1:EMzCZ_uO=8X", "CzA1:EMzCZ_uO=8X", (-2107), (String) null);
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-2107));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("CzA1:EMzCZ_uO=8X", owner0, car_CarType0, (-2107), (-2107), (-2107), (-2107), point0, "CzA1:EMzCZ_uO=8X");
      Client client0 = new Client(point0, (String) null, "CzA1:EMzCZ_uO=8X", (String) null, (String) null, (-2107));
      Rental rental0 = new Rental(car0, client0, point0);
      Car car1 = car0.clone();
      Rental rental1 = new Rental(car1, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(4.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, (Owner) null, car_CarType0, 4503.9099551677145, 4503.9099551677145, (-444.8912), 11, point0, (String) null);
      Client client0 = new Client(point0, (String) null, "", "", "_v'_|hz(", (-1522788922));
      Rental rental0 = new Rental(car0, client0, point0);
      Double double1 = new Double(563.53864611);
      Point point1 = new Point(double0, double1);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 80982221, "BfL4[i1");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(3805.6);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 2422.9183, 2886, 80982221, 80982221, point0, (String) null);
      Client client0 = new Client(point0, "", "BfL4[i1", "", "Model.Rental", 2162);
      Rental rental0 = new Rental(car0, client0, point0);
      System.setCurrentTimeMillis((-1L));
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Point point1 = point0.clone();
      Rental rental0 = new Rental(car0, client0, point1);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Client client1 = client0.clone();
      Rental rental0 = new Rental(car0, client1, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, (String) null, 0, (String) null);
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, 0, 0, 0, point0, (String) null);
      Client client0 = new Client(point0, (String) null, (String) null, (String) null, (String) null, 0);
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(owner0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-270), (String) null);
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-270));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, (-270), (-270), (-270), (-270), point0, "");
      Client client0 = new Client(point0, " Vk+t+RjuI<b I*Wt", "", "", "", (-270));
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Owner owner0 = new Owner("Elecrico", "Elecrico", "Elecrico", (-642), "Elecrico");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-642));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Elecrico", owner0, car_CarType0, (-642), (-642), (-642), (-642), point0, "Elecrico");
      Client client0 = new Client(point0, "Elecrico", "Elecrico", "Elecrico", "Elecrico", (-642));
      Rental rental0 = new Rental(car0, client0, point0);
      LocalDateTime localDateTime0 = rental0.getDate();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate(0, 2115);
      assertEquals(2115, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Owner owner0 = new Owner("Elecrico", "Elecrico", "Elecrico", (-642), "Elecrico");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-642));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Elecrico", owner0, car_CarType0, (-642), (-642), (-642), (-642), point0, "Elecrico");
      Client client0 = new Client(point0, "Elecrico", "Elecrico", "Elecrico", "Elecrico", (-642));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertEquals("Elecrico", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Owner owner0 = new Owner("Elecrico", "Elecrico", "Elecrico", (-642), "Elecrico");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-642));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Elecrico", owner0, car_CarType0, (-642), (-642), (-642), (-642), point0, "Elecrico");
      Client client0 = new Client(point0, "Elecrico", "Elecrico", "Elecrico", "Elecrico", (-642));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("Elecrico", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableOwnerRentalString();
      assertEquals("2014-02-14 20:21\nrxY?r[TW/d^=cuH\n\n(0.00, 0.00)\n(0.00, 0.00)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Owner owner0 = new Owner("*8)M^DgZU>@Jm9", "FQ>!3>JIX}8Wx!", "", (-3403), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("rxY?r[TW/d^=cuH", owner0, car_CarType0, 3315.2, 3315.2, -0.0, 0, point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, "", "*8)M^DgZU>@Jm9", "rxY?r[TW/d^=cuH", ".I/+5E'T 9S,yl", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getPrice();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 80982221, "BfL4[i1");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(3805.6);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 2422.9183, 2886, 80982221, 80982221, point0, (String) null);
      Client client0 = new Client(point0, "", "BfL4[i1", "", "Model.Rental", 2162);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toFinalString();
      assertEquals("Tempo Total: 0.00 Horas\nCusto Total: 0.00\n\n\u001B[4m\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Owner owner0 = new Owner("yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm", (-2147479965), "yyyy-MM-dd HH:mm");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-2147479965));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("yyyy-MM-dd HH:mm", owner0, car_CarType0, (-2147479965), (-2147479965), (-2147479965), (-2147479965), point0, "yyyy-MM-dd HH:mm");
      Client client0 = new Client(point0, "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm", (-2147479965));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("yyyy-MM-dd HH:mm", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Owner owner0 = new Owner("BfL4[i1", "BfL4[i1", "BfL4[i1", 80982217, "BfL4[i1");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(80982217);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("BfL4[i1", owner0, car_CarType0, 982L, 80982217, 80982217, 80982217, point0, "BfL4[i1");
      Client client0 = new Client(point0, "BfL4[i1", "BfL4[i1", "BfL4[i1", "BfL4[i1", 80982217);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableUserRentalString();
      assertEquals("2014-02-14 20:21\nBfL4[i1\nBfL4[i1\n(80982217.00, 80982217.00)\n(80982217.00, 80982217.00)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Owner owner0 = new Owner("BfL4[i1", "BfL4[i1", "BfL4[i1", 80982217, "BfL4[i1");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(80982217);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("BfL4[i1", owner0, car_CarType0, 982L, 80982217, 80982217, 80982217, point0, "BfL4[i1");
      Client client0 = new Client(point0, "BfL4[i1", "BfL4[i1", "BfL4[i1", "BfL4[i1", 80982217);
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getDistance();
      assertEquals(0.0, double1, 0.01);
  }
}