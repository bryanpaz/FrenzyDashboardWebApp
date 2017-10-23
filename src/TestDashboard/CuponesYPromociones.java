package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CuponesYPromociones extends CalcularCosto_SistemaDeBits{
@Test(priority=11)
	public void Cupones_y_Promociones() {
	  	try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Servicios)));
			//Click en Servicios
			driver.findElement(By.xpath(Servicios)).click();
			//Click en Cupones y Promociones
			driver.findElement(By.xpath(CuponesyPromociones)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(FlechaAbajo));
		} catch (Exception e) {
			
		}
  }

}
