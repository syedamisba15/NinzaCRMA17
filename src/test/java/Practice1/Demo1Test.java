package Practice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1Test {

	@Test(groups = "smoke")
	public void AppleTest() {
		Reporter.log("Apple",true);
	}
}
