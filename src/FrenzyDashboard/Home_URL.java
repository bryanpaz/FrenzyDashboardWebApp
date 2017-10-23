package FrenzyDashboard;

import org.testng.annotations.Test;

public class Home_URL extends OpenBrowser {

	@Test(testName="URL Home",description="URL Base",priority=2)
	public void URL() {
		driver.get(FrenzyDash);
	}

}
