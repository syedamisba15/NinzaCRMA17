package Practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1Test {

	@Test(groups = "regression")
	public void OrangeTest() {
		Reporter.log("Orange",true);
		Reporter.log("banana", true);
	}
}
