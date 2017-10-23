package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Video_SistemaDeBits extends SistemaDeBits{
@Test(priority=8)
	public void VideoInBitsSystem() {

  	try {
  		String ButtonVideo = "//IMG[@src='img/play-video.png']";
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ButtonVideo)));
		//Click en el video
		driver.findElement(By.xpath(ButtonVideo)).click();
		Thread.sleep(2000);
		//Refresh
		driver.navigate().refresh();
	} catch (Exception e) {
		e.printStackTrace();
        Assert.fail("VideoInBitsSystem method failed in Video_SistemaDeBits " + e.getMessage());
	}

	}

}
