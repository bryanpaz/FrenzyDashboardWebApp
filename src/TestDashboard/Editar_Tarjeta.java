package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Editar_Tarjeta extends Editar_Cupon {
  @Test(testName="Editar Tarjeta",description="Editar Tarjeta Creada",priority=21)
  public void Tarjeta_Test() {
	  try {
		  Thread.sleep(1000);
		  //Modificar a Descuento
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowTarjeta)));
		  driver.findElement(By.xpath(RowTarjeta)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ModalTarjeta)));
		  driver.findElement(By.xpath(ButtonModificar)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NombreTarjeta)));
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(NombreTarjeta)).clear();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(NombreTarjeta)).sendKeys("Prueba Tarjeta");
		  driver.findElement(By.xpath(InputDateFinish)).sendKeys("29/10/2017");
		  driver.findElement(By.xpath(ButtonSiguiente)).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(ButtonSiguiente)).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(ButtonSI)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PromocionCreada)));
		  
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method failed in Editar Tarjeta " + e.getMessage());
	  }
  }
}
