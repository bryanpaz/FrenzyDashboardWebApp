package FrenzyDashboard;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CloseBrowser extends CalcularCosto_SistemaDeBits{
@Test(priority=0)
	public void Close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
	        Assert.fail("Close method failed in Close Browser " + e.getMessage());
		}
	}

}
