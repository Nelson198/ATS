/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:42:28 GMT 2019
 */

package Exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import Exceptions.CarExistsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CarExistsException_ESTest extends CarExistsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CarExistsException carExistsException0 = new CarExistsException();
  }
}
