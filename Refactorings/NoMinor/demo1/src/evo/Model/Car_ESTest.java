/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:35:37 GMT 2019
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Car_ESTest extends Car_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Owner owner0 = new Owner("electric", "", "electric", 534, (String) null);
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("electric", owner0, car_CarType0, 534, 534, 534, 0, point0, "electric");
      Client client0 = new Client(point0, "gP~l1nk", "gas", "gas", "Utils.Point", 80982221);
      Rental rental0 = new Rental(car0, client0, point0);
      car0.pendingRental(rental0);
      Car car1 = car0.clone();
      Rental rental1 = new Rental(car1, client0, point0);
      car0.approvePendingRental(rental1);
      assertNotSame(car0, car1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Owner owner0 = new Owner("jI55<epsk", (String) null, "!d(./6", (-2375), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2375));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), (-2375), (-2375), (-2883), point0, "\n");
      car0.setBasePrice(0.1);
      Car car1 = new Car("!d(./6", owner0, car_CarType0, (-2375), 0.1, (-2883), (-2375), point0, "jI55<epsk");
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner("%.2f", "%.2f", "%.2f", 2235, "%.2f");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-2578.02));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 932.2648, 1438.7276738087046, 0.0, 2541, point0, "%.2f");
      Car car1 = car0.clone();
      car0.setBasePrice(1473122002);
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Owner owner0 = new Owner("'kjD'(hzk^>", (String) null, "", (-175), "bp?lXpD39T");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("hybrid", owner0, car_CarType0, 21.69, 21.69, (-314.0), (-175), point0, "bp?lXpD39T");
      Car car1 = new Car("/W:]]S/0IX.h%M:7", owner0, car_CarType0, 3195.0, 0.2, 0.4, 0, point0, "hybrid\n-175.00\n-1652.00\ntrue\n100");
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Owner owner0 = new Owner("%.2f", "Todos", "Todos", 2413, "%.2f");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0.4);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("%.2f", owner0, car_CarType0, 2413, 2413, 0.0, 1, point0, "electric");
      boolean boolean0 = car0.hasRange(point0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 1.0, 0.0, 0.0, (-2033), point0, "");
      Double double1 = new Double(0.4);
      Point point1 = new Point(double1, double0);
      boolean boolean0 = car0.hasRange(point1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 1.0, 0.0, 0.0, (-2033), point0, "");
      car0.rate((-2033));
      car0.rate((-2033));
      String string0 = car0.toString();
      assertEquals("\n-2033.00\n0.00\ntrue\n-2033", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 1.0, 0.0, 0.0, (-2033), point0, "");
      boolean boolean0 = car0.isAvailable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Owner owner0 = new Owner("O carro necessita de ser abastecido\n", "!B39k", "!B39k", (-1910), "Utils.Point");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-1910));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("!B39k", owner0, car_CarType0, (-1910), (-1910), (-1910), 2100, point0, "V\"?`^1bes/}*6zwjcd ");
      car0.swapState();
      boolean boolean0 = car0.isAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner("%.2f", "%.2f", "%.2f", 2235, "%.2f");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(932.2648);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("UWj\"x", owner0, car_CarType0, 932.2648, 2235, 2235, (-1239112303), point0, "UWj\"x");
      Car.CarType car_CarType1 = car0.getType();
      assertEquals(Car.CarType.hybrid, car_CarType1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Owner owner0 = new Owner("", "", "Model.Owner", 1473122002, "");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 1473122002, 1473122002, 1473122002, 0, point0, "");
      double double1 = car0.getRange();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Owner owner0 = new Owner("RS", "n{m*PM]iALWgq[W", "t($@ }V/o*_(p+", 2183, "t($@ }V/o*_(p+");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("n{m*PM]iALWgq[W", owner0, car_CarType0, (-2794.16184665177), 2183, (-2794.16184665177), 2183, point0, "t($@ }V/o*_(p+");
      double double1 = car0.getRange();
      assertEquals(2183.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 234.0, 234.0, 234.0, (-1), point0, "hybrid");
      double double1 = car0.getRange();
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Owner owner0 = new Owner("}6HU>pV_", "}6HU>pV_", "}6HU>pV_", (-316), "}6HU>pV_");
      Car.CarType car_CarType0 = Car.CarType.any;
      Car car0 = new Car("}6HU>pV_", owner0, car_CarType0, (-316), (-316), (-316), 0, (Point) null, "}6HU>pV_");
      Point point0 = car0.getPosition();
      assertNull(point0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Owner owner0 = new Owner("$o'", "$o'", "$o'", 0, "Dono:           ");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(2.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$o'", owner0, car_CarType0, 0.0, 2.0, 0, 0, point0, "$o'");
      Point point1 = car0.getPosition();
      assertSame(point0, point1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "", (String) null, 100, "");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0.15, 0.15, 100, 100, point0, (String) null);
      String string0 = car0.getOwnerID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.electric;
      Owner owner0 = new Owner("", "%|'@8'POd", "%|'@8'POd", (-533), "hybrid");
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("hybrid", owner0, car_CarType0, (-533), (-3221.761207), (-533), 0, point0, "");
      String string0 = car0.getOwnerID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, ",Sz", 100, ",Sz");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 2074.457371273778, 225.286364, 100, 0, point0, (String) null);
      String string0 = car0.getNumberPlate();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Owner owner0 = new Owner("BhrHl!F!T", "BhrHl!F!T", "BhrHl!F!T", (-1), (String) null);
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-1));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("]-v[eu$:RFst#)n11;%", owner0, car_CarType0, (-1), (-1), (-1), (-1), point0, "");
      String string0 = car0.getNumberPlate();
      assertEquals("]-v[eu$:RFst#)n11;%", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Owner owner0 = new Owner("", "", (String) null, (-1), "bw *%m['!P");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-790.459562));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-2880.7823), (-1), 4883.7, (-2343), point0, "!q^|Hp");
      String string0 = car0.getNumberPlate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Car car0 = new Car("", (Owner) null, car_CarType0, 0.0, 0.0, 0.0, 100, (Point) null, "wS|03)[");
      double double0 = car0.getBasePrice();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(654.62813596315);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 654.62813596315, 654.62813596315, 654.62813596315, 1357, point0, "");
      double double1 = car0.getBasePrice();
      assertEquals(654.62813596315, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Owner owner0 = new Owner("BhrHl!F!T", "BhrHl!F!T", "BhrHl!F!T", (-1), (String) null);
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-1));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("]-v[eu$:RFst#)n11;%", owner0, car_CarType0, (-1), (-1), (-1), (-1), point0, "");
      double double1 = car0.getBasePrice();
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Owner owner0 = new Owner("Utils.Point", "f^.+d?i8$)T}WXMF=d/", "", (-1723), "");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Utils.Point", owner0, car_CarType0, 0.0, 0.0, 1.0, 0, point0, "Utils.Point");
      double double1 = car0.getAvgSpeed();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Owner owner0 = new Owner("", "", (String) null, 1117, "[.j#,z#Hk[zw");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Model.Car$CarType", owner0, car_CarType0, 1117, 1117, (-1309.32537956873), 1117, point0, "[.j#,z#Hk[zw");
      double double1 = car0.getAvgSpeed();
      assertEquals(1117.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Owner owner0 = new Owner("BhrHl!F!T", "BhrHl!F!T", "BhrHl!F!T", (-1), (String) null);
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-1));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("]-v[eu$:RFst#)n11;%", owner0, car_CarType0, (-1), (-1), (-1), (-1), point0, "");
      double double1 = car0.getAvgSpeed();
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Owner owner0 = new Owner("G", "ez[`#Qx-'=&oP", "ez[`#Qx-'=&oP", 3067, "7ta&w=KD}7R{-6W|%uE");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Car car0 = new Car((String) null, owner0, car_CarType0, 0.0, 3067, 0.0, 3067, (Point) null, (String) null);
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      // Undeclared exception!
      try { 
        car0.setPosition(point0, 2217.967700035327);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.4);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("V$S)AGG[G", (Owner) null, car_CarType0, 0.0, 0.0, 0.0, 1512, point0, "");
      // Undeclared exception!
      try { 
        car0.rate(199, 199);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-1));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 98.0, (-2858.46622603345), (-2858.46622603345), (-1), point0, "");
      // Undeclared exception!
      try { 
        car0.pendingRental((Rental) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Owner owner0 = new Owner("yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm", 0, "m^rDbHNIQ7!m0J_VEA");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Car car0 = new Car("yyyy-MM-dd HH:mm", owner0, car_CarType0, (-364.473838399709), 0, 1640.78645, 0, (Point) null, "");
      // Undeclared exception!
      try { 
        car0.hasRange((Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(944);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Cp0L", (Owner) null, car_CarType0, 4.0, 4.0, 4.0, 944, point0, (String) null);
      // Undeclared exception!
      try { 
        car0.getOwnerID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "<f9Qn=e[)Tf*R}Os", "B%Ht]<%+|ZNshq", 1, (String) null);
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 1, 1054.0, (-1.0), 1, point0, "T_lM+.*s7AezO&[4w");
      Car car1 = car0.clone();
      Car car2 = car1.clone();
      // Undeclared exception!
      try { 
        car1.equals(car2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(157.30418102718718);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", (Owner) null, car_CarType0, (-2321.5737995914124), 764.64186580911, 0.0, (-683), point0, "Model.User");
      // Undeclared exception!
      try { 
        car0.approvePendingRental((Rental) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(654.62813596315);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 654.62813596315, 654.62813596315, 654.62813596315, 1357, point0, "");
      Car car1 = new Car("", (Owner) null, car_CarType0, 0.0, 0.4, 0.0, 1434, point0, "9[/lKqE&`J6Q");
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Owner owner0 = new Owner("", "", "=L", 3135, "&B\"Rrw1");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("&B\"Rrw1", owner0, car_CarType0, 3135, 1.0, 1.0, 3135, point0, "electric");
      String string0 = car0.warnings();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Owner owner0 = new Owner("jI55<epsk", (String) null, "!d(./6", (-2375), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2375));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), (-2375), (-2375), (-2883), point0, "\n");
      Car car1 = car0.clone();
      Car car2 = car0.clone();
      Client client0 = new Client(point0, "Todos", (String) null, "", "hfHybrid", (-2883));
      Rental rental0 = new Rental(car1, client0, point0);
      assertTrue(car1.equals((Object)car2));
      
      car2.approvePendingRental(rental0);
      boolean boolean0 = car1.equals(car2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Owner owner0 = new Owner("jI55<epsk", (String) null, "!d(./6", (-2375), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2375));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), (-2375), (-2375), (-2883), point0, "\n");
      Car car1 = car0.clone();
      Car car2 = car0.clone();
      boolean boolean0 = car1.equals(car2);
      assertTrue(boolean0);
      assertFalse(car2.equals((Object)car0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Owner owner0 = new Owner("jI55<epsk", (String) null, (String) null, (-2375), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2375));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), (-2375), (-2375), (-2375), point0, "\n");
      car0.setBasePrice(0.1);
      Car car1 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), 0.1, (-2375), (-2375), point0, "jI55<epsk");
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Owner owner0 = new Owner("jI55<epsk", (String) null, "!d(./6", (-2375), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2375));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), (-2375), (-2375), (-2883), point0, "\n");
      Car car1 = car0.clone();
      boolean boolean0 = car0.equals(car1);
      assertFalse(car1.equals((Object)car0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Owner owner0 = new Owner("jI55<eps", (String) null, "!d(./6", (-2357), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2357));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<eps", owner0, car_CarType0, (-2357), (-2357), (-2357), (-2357), point0, "\n");
      car0.setBasePrice(0.1);
      Car car1 = new Car((String) null, owner0, car_CarType0, (-2357), 0.1, 0.1, (-2357), point0, "!d(./6");
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Owner owner0 = new Owner("jI55<epsk", (String) null, "!d(./6", (-2375), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2375));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), (-2375), (-2375), (-2375), point0, "\n");
      car0.setBasePrice(0.1);
      Car car1 = new Car("!d(./6", owner0, car_CarType0, (-2375), 0.1, (-2375), (-2375), point0, "jI55<epsk");
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Owner owner0 = new Owner("jI55<epsk", (String) null, "!d(./6", (-2375), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2375));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<epsk", owner0, car_CarType0, (-2375), (-2375), (-2375), (-2375), point0, "\n");
      Car car1 = new Car("!d(./6", owner0, car_CarType0, (-2375), 0.1, (-2375), (-2375), point0, "jI55<epsk");
      boolean boolean0 = car0.equals(car1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Owner owner0 = new Owner("jI55<eps", (String) null, "!d(./6", (-2357), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2357));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("jI55<eps", owner0, car_CarType0, (-2357), (-2357), (-2357), (-2357), point0, "\n");
      boolean boolean0 = car0.equals("!d(./6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Owner owner0 = new Owner("", "", "", 2401, "");
      Double double0 = new Double((-2886.3922));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-2886.3922), 2401, 2618.14, (-3622), point0, "");
      boolean boolean0 = car0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Owner owner0 = new Owner("'kjD'(hzk^>", (String) null, "", (-175), "bp?lXpD39T");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, (-153.31), (-175), (-314.0), (-175), point0, "LSqo#qmF3_-@jA<$6$v");
      boolean boolean0 = car0.equals(car0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Owner owner0 = new Owner("Model.Car$CarType", "Model.Car$CarType", "Model.Car$CarType", 2047, "Model.Car$CarType");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(2047);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Model.Car$CarType", owner0, car_CarType0, 2047, 2047, 2047, 2047, point0, "8Q,[m>_{71H1DQNlJ0");
      Double double1 = new Double(1.2);
      Point point1 = new Point(double1, double1);
      car0.setPosition(point1, 2047);
      String string0 = car0.warnings();
      assertEquals("O carro necessita de ser abastecido\n", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Owner owner0 = new Owner("electrSf", "electrSf", "electrSf", 544, (String) null);
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("electrSf", owner0, car_CarType0, 544, 544, 544, 0, point0, "electrSf");
      boolean boolean0 = car0.hasRange(point0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Owner owner0 = new Owner("Model.Car$CarType", "Model.Car$CarType", "Model.Car$CarType", 2047, "Model.Car$CarType");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(2047);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Model.Car$CarType", owner0, car_CarType0, 2047, 2047, 2047, 2047, point0, "8Q,[m>_{71H1DQNlJ0");
      Double double1 = new Double(1.2);
      Point point1 = new Point(double1, double1);
      car0.setPosition(point1, 2047);
      boolean boolean0 = car0.hasRange(point0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Owner owner0 = new Owner(">sgy/k", "", ">sgy/k", (-2142845974), ">sgy/k");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1679.66705607839);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(">sgy/k", owner0, car_CarType0, (-3314.8796241328), (-2142845974), (-2142845974), (-2142845974), point0, ">sgy/k");
      car0.swapState();
      car0.swapState();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.fromString("Electrico");
      assertEquals(Car.CarType.electric, car_CarType0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.fromString("Todos");
      assertEquals(Car.CarType.any, car_CarType0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.fromString("Gasolina");
      assertEquals(Car.CarType.gas, car_CarType0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      try { 
        Car.CarType.fromString(">sgy/k");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car$CarType", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.fromString("Hibrido");
      assertEquals(Car.CarType.hybrid, car_CarType0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Car.CarType car_CarType1 = Car.CarType.any;
      boolean boolean0 = car_CarType0.equals(car_CarType1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.electric;
      Car.CarType car_CarType1 = Car.CarType.hybrid;
      boolean boolean0 = car_CarType0.equals(car_CarType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.electric;
      boolean boolean0 = car_CarType0.equals(car_CarType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Owner owner0 = new Owner("UWj\"x", "UWj\"x", "%.2f", 2235, "UWj\"x");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-2578.02));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("UWj\"x", owner0, car_CarType0, 932.2648, 1438.7276738087046, 0.0, 2541, point0, "%.2f");
      String string0 = car0.getOwnerID();
      assertEquals("UWj\"x", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Owner owner0 = new Owner("electrSf", "electrSf", "electrSf", 544, (String) null);
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("electrSf", owner0, car_CarType0, 544, 544, 544, 0, point0, "electrSf");
      car0.refil();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Owner owner0 = new Owner("%.2f", "%.2f", "%.2f", 2235, "%.2f");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-2578.02));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("UWj\"x", owner0, car_CarType0, 932.2648, 1438.7276738087046, 0.0, 2541, point0, "%.2f");
      car0.rate(1, 1473122002);
      assertEquals(1473122002, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Owner owner0 = new Owner("%.2f", "%.2f", "%.2f", 2235, "%.2f");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-2578.02));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("UWj\"x", owner0, car_CarType0, 932.2648, 1438.7276738087046, 0.0, 2541, point0, "%.2f");
      Car car1 = car0.clone();
      car1.swapState();
      boolean boolean0 = car0.equals(car1);
      assertFalse(car1.equals((Object)car0));
      assertFalse(boolean0);
  }
}
