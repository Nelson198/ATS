/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 07 15:42:24 GMT 2019
 */

package Exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import Exceptions.UserExistsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UserExistsException_ESTest extends UserExistsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserExistsException userExistsException0 = new UserExistsException();
  }
}
