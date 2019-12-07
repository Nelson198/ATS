/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 16:42:44 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComparadorNAluguer_ESTest extends ComparadorNAluguer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      Cliente cliente0 = new Cliente();
      Cliente cliente1 = new Cliente();
      cliente0.setNAlugueres((-1));
      int int0 = comparadorNAluguer0.compare(cliente1, cliente0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      // Undeclared exception!
      try { 
        comparadorNAluguer0.compare((Cliente) null, (Cliente) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ComparadorNAluguer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      Cliente cliente0 = new Cliente();
      Cliente cliente1 = new Cliente();
      cliente0.setNAlugueres((-1));
      int int0 = comparadorNAluguer0.compare(cliente0, cliente1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      Cliente cliente0 = new Cliente();
      int int0 = comparadorNAluguer0.compare(cliente0, cliente0);
      assertEquals((-1), int0);
  }
}
