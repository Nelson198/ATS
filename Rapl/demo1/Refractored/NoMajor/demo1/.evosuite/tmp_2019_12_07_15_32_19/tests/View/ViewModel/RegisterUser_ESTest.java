/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:43:20 GMT 2019
 */

package View.ViewModel;

import org.junit.Test;
import static org.junit.Assert.*;
import Utils.Point;
import View.ViewModel.RegisterUser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegisterUser_ESTest extends RegisterUser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      RegisterUser registerUser0 = new RegisterUser((String) null, "WN+0I", (String) null, "", 0, point0);
      registerUser0.getPos();
      assertEquals(0, registerUser0.getNif());
      assertEquals("", registerUser0.getAddress());
      assertEquals("WN+0I", registerUser0.getEmail());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("4i~_k<:9BhHt%Fh/9@s", (String) null, (String) null, (String) null, (-1));
      String string0 = registerUser0.getPasswd();
      assertNull(string0);
      assertEquals((-1), registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("`%<`dk", "O2S{bzqtOJD}CW", "", "", 1755, (Point) null);
      String string0 = registerUser0.getPasswd();
      assertEquals("", registerUser0.getAddress());
      assertEquals("`%<`dk", registerUser0.getName());
      assertEquals(1755, registerUser0.getNif());
      assertEquals("O2S{bzqtOJD}CW", registerUser0.getEmail());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double(991.9397746234);
      Point point0 = new Point(double0, double0);
      RegisterUser registerUser0 = new RegisterUser("", "", "", "", 0, point0);
      int int0 = registerUser0.getNif();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("4i~_k<:9BhHt%Fh/9@s", (String) null, (String) null, (String) null, (-1));
      int int0 = registerUser0.getNif();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      RegisterUser registerUser0 = new RegisterUser((String) null, "WN+0I", (String) null, "", 0, point0);
      String string0 = registerUser0.getName();
      assertNull(string0);
      assertEquals("", registerUser0.getAddress());
      assertEquals("WN+0I", registerUser0.getEmail());
      assertEquals(0, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("4i~_k<:9BhHt%Fh/9@s", (String) null, (String) null, (String) null, (-1));
      String string0 = registerUser0.getEmail();
      assertNull(string0);
      assertEquals((-1), registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      RegisterUser registerUser0 = new RegisterUser((String) null, "WN+0I", (String) null, "", 0, point0);
      String string0 = registerUser0.getEmail();
      assertEquals(0, registerUser0.getNif());
      assertEquals("WN+0I", string0);
      assertNotNull(string0);
      assertEquals("", registerUser0.getAddress());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("4i~_k<:9BhHt%Fh/9@s", (String) null, (String) null, (String) null, (-1));
      String string0 = registerUser0.getAddress();
      assertNull(string0);
      assertEquals((-1), registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double double0 = new Double((-585.025));
      Point point0 = new Point(double0, double0);
      RegisterUser registerUser0 = new RegisterUser(".Tw*6!W>\"B,nF*p", "A[y_f4", "M-_F!A^%", ".Tw*6!W>\"B,nF*p", (-1), point0);
      String string0 = registerUser0.getAddress();
      assertEquals((-1), registerUser0.getNif());
      assertEquals(".Tw*6!W>\"B,nF*p", registerUser0.getName());
      assertEquals("M-_F!A^%", registerUser0.getPasswd());
      assertEquals("A[y_f4", registerUser0.getEmail());
      assertEquals(".Tw*6!W>\"B,nF*p", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("/cd,4g=ZA", "", "/cd,4g=ZA", "", 25);
      String string0 = registerUser0.getName();
      assertEquals("", registerUser0.getAddress());
      assertEquals("", registerUser0.getEmail());
      assertEquals("/cd,4g=ZA", string0);
      assertEquals(25, registerUser0.getNif());
      assertEquals("/cd,4g=ZA", registerUser0.getPasswd());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double(991.9397746234);
      Point point0 = new Point(double0, double0);
      RegisterUser registerUser0 = new RegisterUser("", "", "", "", 0, point0);
      registerUser0.getName();
      assertEquals(0, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("/cd,4g=ZA", "", "/cd,4g=ZA", "", 25);
      int int0 = registerUser0.getNif();
      assertEquals("/cd,4g=ZA", registerUser0.getName());
      assertEquals(25, int0);
      assertEquals("/cd,4g=ZA", registerUser0.getPasswd());
      assertEquals("", registerUser0.getEmail());
      assertEquals("", registerUser0.getAddress());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("/cd,4g=ZA", "", "/cd,4g=ZA", "", 25);
      String string0 = registerUser0.getEmail();
      assertEquals(25, registerUser0.getNif());
      assertEquals("", string0);
      assertEquals("/cd,4g=ZA", registerUser0.getName());
      assertEquals("/cd,4g=ZA", registerUser0.getPasswd());
      assertEquals("", registerUser0.getAddress());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("/cd,4g=ZA", "", "/cd,4g=ZA", "", 25);
      String string0 = registerUser0.getPasswd();
      assertEquals("/cd,4g=ZA", registerUser0.getName());
      assertEquals("", registerUser0.getEmail());
      assertEquals("/cd,4g=ZA", string0);
      assertEquals("", registerUser0.getAddress());
      assertEquals(25, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("/cd,4g=ZA", "", "/cd,4g=ZA", "", 25);
      registerUser0.getPos();
      assertEquals("/cd,4g=ZA", registerUser0.getName());
      assertEquals("/cd,4g=ZA", registerUser0.getPasswd());
      assertEquals("", registerUser0.getEmail());
      assertEquals(25, registerUser0.getNif());
      assertEquals("", registerUser0.getAddress());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("/cd,4g=ZA", "", "/cd,4g=ZA", "", 25);
      String string0 = registerUser0.getAddress();
      assertEquals("", registerUser0.getEmail());
      assertEquals("/cd,4g=ZA", registerUser0.getPasswd());
      assertEquals(25, registerUser0.getNif());
      assertEquals("", string0);
      assertEquals("/cd,4g=ZA", registerUser0.getName());
  }
}
