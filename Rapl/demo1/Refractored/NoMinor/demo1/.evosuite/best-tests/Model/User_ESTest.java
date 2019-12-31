/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:38:22 GMT 2019
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import model.Car;
import model.Client;
import model.Owner;
import model.Rental;
import model.User;
import utils.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(1045.095206462);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "kVg+y~h", "kVg+y~h", "", 0);
      Owner owner0 = new Owner("kVg+y~h", (String) null, "", 0, "kVg+y~h");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Car car0 = new Car("kVg+y~h", owner0, car_CarType0, 0, 1045.095206462, 480.625038134, 0, point0, (String) null);
      Rental rental0 = new Rental(car0, client0, point0);
      client0.rate(rental0, 0, 466);
      client0.rate(rental0, (-1), 466);
      int int0 = owner0.getRates();
      assertEquals(466, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double(306.76087833604);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "QRGi%,stWNq}*/", "QRGi%,stWNq}*/", "QRGi%,stWNq}*/", "ZYk(", 0);
      assertEquals(100, client0.getRates());
      
      client0.rate(0);
      int int0 = client0.getRates();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, (String) null, (-541), (String) null);
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, (-541), (-541), (-541), (-541), point0, (String) null);
      Client client0 = new Client(point0, (String) null, (String) null, "Model.User", "$VALUES", (-541));
      Rental rental0 = new Rental(car0, client0, point0);
      client0.rate(rental0, (-1719145501), (-2022));
      int int0 = owner0.getRates();
      assertEquals((-2022), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double(1418.07);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, (String) null, (String) null, (String) null, "/rn", 752);
      String string0 = client0.getPasswd();
      assertEquals(100, client0.getRates());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double((-3533.1554258486));
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "n?m>I9@D", "#jhh|3'=Si^$\"", "#jhh|3'=Si^$\"", "y$9av{pbYp?1", (-1929));
      String string0 = client0.getPasswd();
      assertEquals(100, client0.getRates());
      assertEquals("#jhh|3'=Si^$\"", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Owner owner0 = new Owner("T,]\"(D}&n", "", "T,]\"(D}&n", 1601, "");
      String string0 = owner0.getPasswd();
      assertEquals(100, owner0.getRates());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Double double0 = new Double(310.52);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, (String) null, "fZN+vb", "fZN+vb", "fZN+vb", 5429);
      String string0 = client0.getEmail();
      assertEquals(100, client0.getRates());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Owner owner0 = new Owner("Model.User", "Model.User", "Model.User", (-483), "Model.User");
      owner0.getEmail();
      assertEquals(100, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double double0 = new Double(1045.095206462);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "kVg+y~h", "kVg+y~h", "", 0);
      String string0 = client0.getEmail();
      assertEquals(100, client0.getRates());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner("(ua;29Q0#@/KcXp", "(ua;29Q0#@/KcXp", "", (-3578), "(ua;29Q0#@/KcXp");
      owner0.equals(owner0);
      assertEquals(100, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double double0 = Double.valueOf(0.0);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "", "", "", 0);
      Owner owner0 = new Owner("", "", "", 0, "");
      owner0.equals(client0);
      assertEquals(100, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double((-2944.6906050162625));
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "Model.User", "Model.User", "Model.User", "Model.User", (-483));
      assertEquals(100, client0.getRates());
      
      client0.rate(0);
      client0.clone();
      assertEquals(0, client0.getRates());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = Double.valueOf(0.0);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "", "", "", "", 0);
      User user0 = client0.clone();
      assertEquals(100, user0.getRates());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, (String) null, (-1), "Client:        ");
      owner0.rate((-1));
      owner0.clone();
      assertEquals((-1), owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Client client0 = new Client((Point) null, "Ftn", "Ftn", "9yY+ndl3+G7^?ef+h", "5,KQSc9\"eR_L", 2697);
      Client client1 = new Client((Point) null, "5,KQSc9\"eR_L", "5,KQSc9\"eR_L", "Ftn", "Ftn", 2697);
      // Undeclared exception!
      try { 
        client0.equals(client1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Client", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double(1765.969893631778);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "ModelUser", "ModelUser", "ModelUser", "ModelUser", 2);
      int int0 = client0.getRates();
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Client client0 = new Client((Point) null, "Ftn", "Ftn", "9yY+ndl3+G7^?ef+h", "", 2697);
      // Undeclared exception!
      try { 
        client0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Client", e);
      }
  }
}
