/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Dec 07 15:43:58 GMT 2019
 */


import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Main_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "main.Main";
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "PT"); 
    java.lang.System.setProperty("user.dir", "/home/joseb/Desktop/ats/ATS/Refactorings/AllSmells/demo1"); 
    java.lang.System.setProperty("user.home", "/home/joseb"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "joseb"); 
    java.lang.System.setProperty("user.timezone", "Europe/Lisbon"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Main_ESTest_scaffolding.class.getClassLoader() ,
      "Controller.Controller$1",
      "Model.Cars",
      "Model.Car",
      "View.ViewModel.TimeInterval",
      "View.ViewModel.RentCarSimple",
      "Exceptions.UnknownCompareTypeException",
      "Model.Owner",
      "View.ViewModel.RegisterCar",
      "Exceptions.WrongPasswordExecption",
      "Exceptions.InvalidUserException",
      "Exceptions.InvalidTimeIntervalException",
      "View.ViewModel.RateOwnerCar",
      "Exceptions.UnknownCarTypeException",
      "Exceptions.UserExistsException",
      "Model.UMCarroJa",
      "Exceptions.CarExistsException",
      "Exceptions.InvalidCarException",
      "Utils.Point",
      "Model.Rental",
      "View.ViewModel.NewLogin",
      "View.Menu",
      "View.ViewModel.AutonomyCar",
      "View.Menu$MenuInd",
      "Exceptions.InvalidRatingException",
      "Model.Client",
      "Controller.Controller",
      "View.Menu$1",
      "Model.Parser",
      "View.ViewModel.SpecificCar",
      "Exceptions.NoCarAvaliableException",
      "Model.Users",
      "Exceptions.InvalidNewRentalException",
      "View.ViewModel.RegisterUser",
      "Model.Rentals",
      "Model.User",
      "Exceptions.InvalidNewRegisterException",
      "Exceptions.InvalidNumberOfArgumentsException",
      "Utils.StringBetter",
      "main.Main",
      "Model.Car$CarType",
      "View.ViewModel.CheapestNearCar"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Main_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "main.Main",
      "Model.UMCarroJa",
      "Model.Cars",
      "Model.Users",
      "Model.Rentals",
      "Model.Parser",
      "Controller.Controller",
      "View.Menu",
      "View.Menu$MenuInd",
      "View.Menu$1",
      "Controller.Controller$1",
      "Utils.StringBetter"
    );
  }
}
