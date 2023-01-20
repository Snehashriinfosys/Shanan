package Assert_equals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_t {
@Test
public void TC1() {
	Reporter.log("Running with TC",true );
	String expT="Hi";
	String actT="Hi";
	//ussing asser class method
	Assert.assertEquals(expT, actT);
}
}
