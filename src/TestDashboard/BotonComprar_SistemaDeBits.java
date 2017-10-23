package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BotonComprar_SistemaDeBits extends Video_SistemaDeBits {
@Test(testName="Boton Comprar",priority=9)
	public void Boton() {
		
		  	try {
		  		String FlechaAbajo = "//IMG[@src='img/flecha-abajo.png']";
		  		String ButtonComprar = "//BUTTON[@class='buttonInBits'][text()='¡Comprar!']";
				Thread.sleep(1000);
				//Click Flecha Abajo
				driver.findElement(By.xpath(FlechaAbajo)).click();
				Thread.sleep(1000);
				//Click Boton Comprar
				driver.findElement(By.xpath(ButtonComprar)).click();
				Thread.sleep(1000);
				WebElement body = driver.findElement(By.tagName("body"));
				body.sendKeys(Keys.ESCAPE);
			} catch (Exception e) {
				e.printStackTrace();
		        Assert.fail("Buy Botton method failed in Bits System " + e.getMessage());
			}
		  
		
			}

}
