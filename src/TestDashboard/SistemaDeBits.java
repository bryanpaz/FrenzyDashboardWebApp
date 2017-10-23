package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SistemaDeBits extends Home_ContactForm	{
	
	public String Servicios = "(//P[@href='#Services'][text()='SERVICIOS'][text()='SERVICIOS'])[1]";
	public String SistemaDeBits = "(//A[@href='#menu/bits'][text()='SISTEMA DE BITS'][text()='SISTEMA DE BITS'])[1]";
	
	@Test(description="Test Byts System Page", priority=7)
	public void PaginaSistemaDeBits() {
		try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			driver.navigate().refresh();
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Servicios)));
			//Click en Servicios
			driver.findElement(By.xpath(Servicios)).click();
			//Click en Sitema de Bits
			driver.findElement(By.xpath(SistemaDeBits)).click();
			Thread.sleep(2000);
			//Scroll up
			jse.executeScript("scroll(0, -250)");
		} catch (Exception e) {
			e.printStackTrace();
            Assert.fail("Bits System Page method failed in Bits System " + e.getMessage());
		}
	}
}