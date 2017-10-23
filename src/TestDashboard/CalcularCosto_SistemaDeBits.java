package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcularCosto_SistemaDeBits extends Video_SistemaDeBits {
@Test(priority=10)
	public void Caclular() {
	  	try {
	  		String ButtonCalculaTuCosto = "//BUTTON[@class='buttonInBits'][text()='Calcula tu costo']";
			//Click en Calcula tu Costo
			driver.findElement(By.xpath(ButtonCalculaTuCosto)).click();
			Thread.sleep(1000);
			//Llenar campo clientes al mes
			driver.findElement(By.className("inputCost")).sendKeys("12");
		} catch (Exception e) {
			e.printStackTrace();
	        Assert.fail("Buy Botton method failed in Bits System " + e.getMessage());
		}
	}

}
