package TestNG_flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {


@Test(invocationCount= 5)
public void TC() {
	Reporter.log("running TC",true);
}
}
