package Testng_Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tstng {

@BeforeClass
public void OpenBrowser() {
	Reporter.log("Open the Browser",true);
}

	@BeforeMethod
	public void LoginToApp() {
		Reporter.log("LoginToapp",true);
	}
	@Test
	public void verifyuserID() {
		Reporter.log("Running verify userID",true);
		
	}
	@AfterMethod
	public void LOgoutApp() {
		Reporter.log("LOgout from App",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the Browser",true);
	}
}
