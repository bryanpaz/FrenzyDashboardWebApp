package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nueva_Promocion extends Entrar_Empresa {
  @Test(testName="Test Promoción",description="Test de Nueva Promoción",priority=15)
  public void Test_Promocion() {
	  try {
		  WebDriverWait wait = new WebDriverWait(driver,30);
			
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn)));
			  driver.findElement(By.xpath(btn)).click();
			  
			Thread.sleep(1000);
			driver.findElement(By.xpath(btnpromo)).click();
			
			//Promo
			Thread.sleep(2000);
			driver.findElement(By.xpath(tpromo)).click();
			driver.findElement(By.xpath(tpromo)).sendKeys("TestPromo1");
			
			driver.findElement(By.xpath(dpromo)).click();
			driver.findElement(By.xpath(dpromo)).sendKeys("Descripción de la promoción de prueba");
			
			driver.findElement(By.xpath(url)).click();
			driver.findElement(By.xpath(url)).sendKeys("https://www.bryanpaz.com");
			
			driver.findElement(By.xpath(fpub)).click();
			driver.findElement(By.xpath(fpub)).sendKeys("28092017");
			
			driver.findElement(By.xpath(ff)).click();
			driver.findElement(By.xpath(ff)).sendKeys("28102017");
			
			driver.findElement(By.xpath(hpub)).click();
			driver.findElement(By.xpath(hpub)).sendKeys("1000");
			
			driver.findElement(By.xpath(hf)).click();
			driver.findElement(By.xpath(hf)).sendKeys("1000");
			
			driver.findElement(By.xpath(tyc)).click();
			driver.findElement(By.xpath(tyc)).sendKeys("Descripción del test correspondiente.");
			
			driver.findElement(By.xpath(crear)).click();
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method Failde in Nueva Promoción " + e.getMessage());
	  }
  }
}
