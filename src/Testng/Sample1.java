package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void TC1(){
		
		Reporter.log("Welcome to Testng ",true);
		
	}

}
