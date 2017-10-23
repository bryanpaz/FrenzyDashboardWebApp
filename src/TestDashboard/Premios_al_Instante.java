package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Premios_al_Instante extends Tarjeta_de_Lealtad {
  @Test(testName="Test Premios al Instante",description="Test Crear nuevo premio al instante",priority=18)
  public void PremiosAlInstante_Test() {
	  try {
		  //Variables
		   Thread.sleep(1000);
		  //Entrar a premios
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ButtonPlus)));
		  driver.findElement(By.xpath(ButtonPlus)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonPremiosalInstante)));
		  driver.findElement(By.xpath(ButtonPremiosalInstante)).click();
		  System.out.println("Se Accedio a Premios al Instante");
		  //Dentro de premios
		  if(!driver.findElements(By.xpath("(//DIV[@role='dialog'])[4]")).isEmpty()){
				driver.findElement(By.xpath(ButtonSalir)).click();
		  }else {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));
				driver.findElement(By.className("form-control")).click();
				driver.findElement(By.className("form-control")).sendKeys("25");
				WebElement body = driver.findElement(By.className("form-control"));
				body.sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(InputPremios)).sendKeys("100");
				driver.findElement(By.xpath(InputRedencion)).sendKeys("100");
				driver.findElement(By.xpath(ButtonSiguiente)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(InputNombrePremio)));
				driver.findElement(By.xpath(InputNombrePremio)).sendKeys("Producto Gratis");
				driver.findElement(By.xpath(InputDescripcionPromo)).sendKeys("Cualquier Producto Seleccionado Gratis");
				driver.findElement(By.xpath(InputPolitica)).sendKeys("Solo en productos seleccionados de nuestra tienda");
				driver.findElement(By.xpath(InputTerminos)).sendKeys("Cualquier Producto que exceda de Q1,000.00 debera pagar Q10.00 adicionales.");
				driver.findElement(By.xpath(InputDate)).sendKeys("28/09/2017");
				driver.findElement(By.xpath(InputDateFinish)).sendKeys("28/09/2018");
				driver.findElement(By.xpath(InputTime)).sendKeys("12:00");
				driver.findElement(By.xpath(InputTimeFinish)).sendKeys("12:00");
				driver.findElement(By.xpath(ButtonSiguiente)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(InputNombre)));
				driver.findElement(By.xpath(InputNombre)).sendKeys("Producto Gratis");
				driver.findElement(By.xpath(InputDescripcion2)).sendKeys("Cualquier Producto Seleccionado Gratis");
				driver.findElement(By.xpath(InputCantidad)).sendKeys("100");
				driver.findElement(By.xpath(ButtonGuardar)).click();
				driver.findElement(By.xpath(ButtonSiguiente)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
				driver.findElement(By.xpath(ButtonSI)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PromocionCreada)));
				driver.findElement(By.xpath(ButtonSalir)).click();
		  }
		  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method failed in Premios al Instante " + e.getMessage());
		  }
  }
}
  
