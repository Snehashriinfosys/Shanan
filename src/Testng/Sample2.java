package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
@Test
public void TC1() {
	Reporter.log("Pass the message to the consol",true);
}

@Test 
public void TC2() {
	Reporter.log("Hello world ",true);
}

@Test
public void TC3() {
	Reporter.log("Show the TC is fail",true);
	Assert.fail();
}
}
