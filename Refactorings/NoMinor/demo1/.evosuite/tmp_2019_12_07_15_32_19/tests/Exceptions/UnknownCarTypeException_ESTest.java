/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:42:21 GMT 2019
 */

package exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import exceptions.UnknownCarTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnknownCarTypeException_ESTest extends UnknownCarTypeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnknownCarTypeException unknownCarTypeException0 = new UnknownCarTypeException();
  }
}
