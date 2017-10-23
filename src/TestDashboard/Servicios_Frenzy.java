package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Servicios_Frenzy extends Test_Navbar {
	
	@Test(testName="Servicios",description="Register new user", priority=4)
	public void VerMas () throws InterruptedException{
		try {
			driver.get(FrenzyDash);
			WebDriverWait wait = new WebDriverWait(driver,10);
           
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bitsServices']/p"))).click();
            Thread.sleep(3000);            
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Services']/div/div[1]"))).click();
            Thread.sleep(3000);            
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Services\"]/div/div[3]"))).click();
            Thread.sleep(3000);            
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Services\"]/div/div[5]"))).click();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("hoverServices method failed in ServicesFrenzy " + e.getMessage());
                                                                                                                                                
        }
    }
}
