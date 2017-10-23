package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_ContactForm extends Home_Video{
	
	@Test(description="Test Contact Form in Home", priority=6)
	public void ContactForm() throws InterruptedException{
		try {
			// Variables de automatización de botones generales
			String telefono = "//IMG[@src='img/icon-numero.png']";
			String ubicacion = "//IMG[@src='img/icon-ubi.png']";
			String registrate = "//BUTTON[@class='buttonRegister'][text()='¡Regístrate!']";
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(telefono)));
			driver.findElement(By.xpath(telefono)).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ubicacion)));
			driver.findElement(By.xpath(ubicacion)).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(registrate)));
			driver.findElement(By.xpath(registrate)).click();
			driver.navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//INPUT[@id='inputContactUs']")));
			// Formulario
			String InpNombre = "//INPUT[@id='inputContactUs']";
			String InpCorreo = "//INPUT[@id='inputContactUs2']";
			String InpAsunto = "//INPUT[@id='inputContactUs3']";
			String InpMensaje = "//*[@id=\"inputContactUs4\"]";
			String BotonEnviar = "//BUTTON[@class='buttonSend'][text()='Enviar']";
			driver.findElement(By.xpath(InpNombre)).click();
			driver.findElement(By.xpath(InpNombre)).sendKeys("Bryan Paz");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(InpCorreo)));
			driver.findElement(By.xpath(InpCorreo)).click();
			driver.findElement(By.xpath(InpCorreo)).sendKeys("test@bryanpaz.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(InpAsunto)));
			driver.findElement(By.xpath(InpAsunto)).click();
			driver.findElement(By.xpath(InpAsunto)).sendKeys("test");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(InpMensaje)));
			driver.findElement(By.xpath(InpMensaje)).click();
			driver.findElement(By.xpath(InpMensaje)).sendKeys("TESTING");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BotonEnviar)));
			driver.findElement(By.xpath(BotonEnviar)).click();
			///html/body/div[3]/div/div[10]/button[1]
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[10]/button[1]")));
			driver.findElement(By.xpath("/html/body/div[3]/div/div[10]/button[1]")).click();
		} catch (Exception e) {
			 e.printStackTrace();
	            Assert.fail("hoverServices method failed in ServicesFrenzy " + e.getMessage());
		}
	}

}
