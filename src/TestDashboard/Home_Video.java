package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_Video extends Servicios_Frenzy {
	@Test(description="Test Video in Home", priority=5)
	public void Video()throws InterruptedException{
		try {
			String video1 = "//*[@id=\"Benefits\"]/div[2]/div[2]/p/img";
			driver.findElement(By.xpath("//*[@id=\"fatherAllViews\"]/div[1]/div/div/div[2]/div[2]/p"));
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(video1)));
	        driver.findElement(By.xpath(video1)).click();
		    driver.navigate().refresh();
		    Thread.sleep(1000);
		}catch(Exception e) {
            e.printStackTrace();
            Assert.fail("Video method failed in Home_Video " + e.getMessage());
            
		}
	}

}