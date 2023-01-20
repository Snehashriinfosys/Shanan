package Assert_equals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_notEquals {
@Test
public void TC() {
	String expT="Hi";
	String actT="Hello";
	Reporter.log("Running TC",true);
	//ussing assertnot equals or asser class method
	Assert.assertNotEquals(expT, actT);
	
}
}
