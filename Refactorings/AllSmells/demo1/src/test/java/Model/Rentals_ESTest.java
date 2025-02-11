/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:41:32 GMT 2019
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Car;
import Model.Client;
import Model.Owner;
import Model.Rental;
import Model.Rentals;
import Utils.Point;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Rentals_ESTest extends Rentals_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("\u001B[0m", "\u001B[0m", "d}8uQ$R?G,P", (-147), "d}8uQ$R?G,P");
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Period period0 = Period.ofWeeks((-953));
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      LocalTime localTime0 = MockLocalTime.now(clock0);
      LocalDateTime localDateTime1 = MockLocalDateTime.of(localDate0, localTime0);
      List<Rental> list0 = rentals0.getRentalListOwner(owner0, localDateTime0, localDateTime1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "", "", "", 149);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      List<Rental> list0 = rentals0.getRentalListClient(client0, localDateTime0, (LocalDateTime) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("fuWU1#:V4_", "fuWU1#:V4_", "M;k]e_'EvTvxW6y", 0, "M;k]e_'EvTvxW6y");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("M;k]e_'EvTvxW6y", owner0, car_CarType0, (-3367.6971364), 1559.662434327567, 1559.662434327567, 0, point0, "M;k]e_'EvTvxW6y");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      double double1 = rentals0.getTotalBilledCar(car0, (LocalDateTime) null, localDateTime0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      rentals0.addRental((Rental) null);
      rentals0.addRental((Rental) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("Model.Rentals", "q8g^ERG\"b#7~w1", "q8g^ERG\"b#7~w1", 0, "q8g^ERG\"b#7~w1");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-2867.2098559191));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Model.Rentals", owner0, car_CarType0, 0, 0.2, (-2867.2098559191), 0, point0, "Model.Rentals");
      Client client0 = new Client(point0, "FI,e0$", "Model.Rentals", "q8g^ERG\"b#7~w1", "Model.Rentals", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rentals0.addRental(rental0);
      List<Rental> list0 = rentals0.getRentalListOwner(owner0);
      assertTrue(list0.contains(rental0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("Model.Rentals", "Model.Rentals", "Model.Rentals", 0, "Model.Rentals");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Model.Rentals", owner0, car_CarType0, 0, 0, 0, 0, point0, "Model.Rentals");
      Client client0 = new Client(point0, "Model.Rentals", "Model.Rentals", "Model.Rentals", "Model.Rentals", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rentals0.addRental(rental0);
      List<Rental> list0 = rentals0.getRentalListClient("Model.Rentals");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("Model.Rentals", "q8g^ERG\"b#7~w1", "q8g^ERG\"b#7~w1", 0, "q8g^ERG\"b#7~w1");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-2867.2098559191));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Model.Rentals", owner0, car_CarType0, 0, 0.2, (-2867.2098559191), 0, point0, "Model.Rentals");
      Client client0 = new Client(point0, "FI,e0$", "Model.Rentals", "q8g^ERG\"b#7~w1", "Model.Rentals", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rentals0.addRental(rental0);
      List<Rental> list0 = rentals0.getRentalListClient(client0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      // Undeclared exception!
      try { 
        rentals0.getTotalBilledCar((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1);
      // Undeclared exception!
      try { 
        rentals0.getRentalListOwner((Owner) null, localDateTime0, localDateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("J/9P]", (String) null, "Model.Rentals", 0, "");
      rentals0.addRental((Rental) null);
      // Undeclared exception!
      try { 
        rentals0.getRentalListOwner(owner0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      rentals0.addRental((Rental) null);
      // Undeclared exception!
      try { 
        rentals0.getRentalListClient("$]zUha/eP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      // Undeclared exception!
      try { 
        rentals0.getRentalListClient((Client) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Rentals rentals1 = new Rentals();
      boolean boolean0 = rentals0.equals(rentals1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      boolean boolean0 = rentals0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      boolean boolean0 = rentals0.equals(rentals0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Double double0 = new Double((-3710.07218));
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "Model.Rentals", "3L+sV'f!aVO-VM&*N]7", "", "Model.Client", 2432);
      boolean boolean0 = rentals0.equals(client0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "8pk~TTA", "x,7MeQQu", "8pk~TTA", "8pk~TTA", 0);
      List<Rental> list0 = rentals0.getRentalListClient(client0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      // Undeclared exception!
      try { 
        rentals0.getRentalListClient((Client) null, (LocalDateTime) null, (LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      List<Rental> list0 = rentals0.getRentalListClient("x,7MeQQu");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("J/9P]", (String) null, "Model.Rentals", 0, "");
      List<Rental> list0 = rentals0.getRentalListOwner(owner0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("Model.Client", "", "Model.Client", 2432, "Model.Rentals");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-3710.07218));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 2432, (-293.6042118), (-3710.07218), 1883, point0, "Model.Client");
      double double1 = rentals0.getTotalBilledCar(car0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rentals rentals0 = new Rentals();
      Owner owner0 = new Owner("Model.Client", "", "Model.Client", 2432, "Model.Rentals");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-3710.07218));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 2432, (-293.6042118), (-3710.07218), 1883, point0, "Model.Client");
      Client client0 = new Client(point0, "Model.Rentals", "3L+sV'f!aVO-VM&*N]7", "", "Model.Client", 2432);
      Rental rental0 = new Rental(car0, client0, point0);
      rentals0.addRental(rental0);
      // Undeclared exception!
      try { 
        rentals0.getTotalBilledCar(car0, (LocalDateTime) null, (LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.chrono.ChronoLocalDateTime", e);
      }
  }
}
