/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:35:37 GMT 2019
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import model.Parser;
import model.UMCarroJa;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Parser parser0 = new Parser("", (UMCarroJa) null);
      Parser parser1 = new Parser("", (UMCarroJa) null);
      // Undeclared exception!
      try { 
        parser0.equals(parser1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Parser parser0 = null;
      try {
        parser0 = new Parser((String) null, uMCarroJa0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Parser parser0 = new Parser();
      Parser parser1 = new Parser();
      boolean boolean0 = parser0.equals(parser1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Parser parser0 = new Parser();
      boolean boolean0 = parser0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Parser parser0 = new Parser("=", (UMCarroJa) null);
      boolean boolean0 = parser0.equals("=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Parser parser0 = new Parser();
      boolean boolean0 = parser0.equals(parser0);
      assertTrue(boolean0);
  }
}