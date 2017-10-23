package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reporter.JyperionListener;
@Listeners(JyperionListener.class)
public class Editar_Premio extends Editar_Tarjeta {
  @Test(testName="Editar Premio",description="Editar Premio Creado",priority=22)
  public void Premio_Test() {
try {
	Thread.sleep(1000);
	//Modificar a Descuento
	WebDriverWait wait = new WebDriverWait(driver,30);
	driver.navigate().to("http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/support");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='whiteButton']")));
	driver.findElement(By.xpath("//DIV[@class='whiteButton']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(InstantAward)));
	driver.findElement(By.xpath(InstantAward)).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ModalInstantAward)));
	driver.findElement(By.xpath(ButtonModificar)).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(InputDescripcionPromo)));
	driver.findElement(By.xpath(InputDescripcionPromo)).clear();
	driver.findElement(By.xpath(InputDescripcionPromo)).sendKeys("Nueva Promoción");
	driver.findElement(By.xpath(ButtonSiguiente)).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(ButtonSI)).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PromocionCreada)));
		  
	}catch (Exception e) {
		e.printStackTrace();
		Assert.fail("Method failed in Editar Premio " + e.getMessage());
	}
  }
}
