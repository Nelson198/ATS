/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 16:39:27 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utilizador_ESTest extends Utilizador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Utilizador utilizador0 = new Utilizador("$`R", "", "", (String) null, (String) null, mockGregorianCalendar0);
      String string0 = utilizador0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setPassword("_2i.t+ecK'Y vxn#");
      String string0 = utilizador0.getPassword();
      assertEquals("_2i.t+ecK'Y vxn#", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNome((String) null);
      String string0 = utilizador0.getNome();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNome("Zco}AE\u0005Un[pbsW}&VT");
      String string0 = utilizador0.getNome();
      assertEquals("Zco}AE\u0005Un[pbsW}&VT", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = new Locale("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Utilizador utilizador0 = new Utilizador("gO5&I", (String) null, "gO5&I", "", (String) null, mockGregorianCalendar0);
      String string0 = utilizador0.getNIF();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNIF("_2i.t+ecK'Y vxn#");
      String string0 = utilizador0.getNIF();
      assertEquals("_2i.t+ecK'Y vxn#", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setMorada((String) null);
      String string0 = utilizador0.getMorada();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setMorada("Nome: ");
      String string0 = utilizador0.getMorada();
      assertEquals("Nome: ", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setEmail((String) null);
      String string0 = utilizador0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1610, 508);
      Utilizador utilizador0 = new Utilizador("{#f_}c2yy.", "p5tV@??9,]G7W", "p5tV@??9,]G7W", "{#f_}c2yy.", "{#f_}c2yy.", mockGregorianCalendar0);
      String string0 = utilizador0.getEmail();
      assertEquals("p5tV@??9,]G7W", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("V3_", "", "", "", "V3_", (GregorianCalendar) null);
      GregorianCalendar gregorianCalendar0 = utilizador0.getDataNasc();
      assertNull(gregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      utilizador0.setDataNasc(mockGregorianCalendar0);
      GregorianCalendar gregorianCalendar0 = utilizador0.getDataNasc();
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      utilizador0.setDataNasc(mockGregorianCalendar0);
      GregorianCalendar gregorianCalendar0 = utilizador0.getDataNasc();
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, (-1413), (-1413), (-4286), (-2128646069));
      Utilizador utilizador0 = new Utilizador("aWcCn:3NY-D?73-j<", "aWcCn:3NY-D?73-j<", "", "", "", mockGregorianCalendar0);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-2128646069));
      GregorianCalendar gregorianCalendar0 = utilizador0.getDataNasc();
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 5, 0);
      mockGregorianCalendar0.setFirstDayOfWeek((-634));
      utilizador0.setDataNasc(mockGregorianCalendar0);
      GregorianCalendar gregorianCalendar0 = utilizador0.getDataNasc();
      assertEquals((-634), gregorianCalendar0.getFirstDayOfWeek());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("V3_", "", "", "", "V3_", (GregorianCalendar) null);
      // Undeclared exception!
      try { 
        utilizador0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Utilizador utilizador0 = new Utilizador("", "*****    UTILIZADOR    *****\n", "*****    UTILIZADOR    *****\n", "*****    UTILIZADOR    *****\n", "", mockGregorianCalendar0);
      mockGregorianCalendar0.set(0, (-1141));
      // Undeclared exception!
      try { 
        utilizador0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Utilizador utilizador0 = null;
      try {
        utilizador0 = new Utilizador((Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getNIF();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getMorada();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getNome();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      System.setCurrentTimeMillis((-1612L));
      Utilizador utilizador1 = new Utilizador();
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
      
      utilizador1.setMorada("z\"](xq/PSpy0");
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
      
      utilizador1.setEmail("#");
      boolean boolean0 = utilizador1.equals(utilizador0);
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Utilizador utilizador0 = new Utilizador("", "", "", ")", ")", mockGregorianCalendar0);
      utilizador0.setNIF(")");
      Utilizador utilizador1 = new Utilizador();
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = new Utilizador("2", "+", "*****    UTILIZADOR    *****\nNome: \nNIF: \nEmail: \nPassword: \nMorada: \nData de Nascimento: 14/2/2014\n", "*****    UTILIZADOR    *****\nNome: \nNIF: \nEmail: \nPassword: \nMorada: \nData de Nascimento: 14/2/2014\n", "+", (GregorianCalendar) null);
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      boolean boolean0 = utilizador0.equals("*****    UTILIZADOR    *****\nNome: \nNIF: \nEmail: \nPassword: \nMorada: \nData de Nascimento: 14/2/2014\n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = utilizador0.clone();
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      boolean boolean0 = utilizador0.equals(utilizador0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      boolean boolean0 = utilizador0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.toString();
      assertEquals("*****    UTILIZADOR    *****\nNome: \nNIF: \nEmail: \nPassword: \nMorada: \nData de Nascimento: 14/2/2014\n", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setPassword("o,r%UW4^J[R>");
      Utilizador utilizador1 = new Utilizador();
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, (-3470));
      Utilizador utilizador0 = new Utilizador("", "", "", "?[m)", "", mockGregorianCalendar0);
      Utilizador utilizador1 = utilizador0.clone();
      utilizador1.setEmail((String) null);
      // Undeclared exception!
      try { 
        utilizador1.equals(utilizador0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}