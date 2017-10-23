package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nuevo_Cupon extends Nueva_Promocion {
  @Test(testName="Test Nueva Promoción",description="Test de nueva promocion",priority=16)
  public void NuevaPromocion_Test() {
	  try {
		   WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonPlus)));
		  driver.findElement(By.xpath(ButtonPlus)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonNuevoCupon)));
		  driver.findElement(By.xpath(ButtonNuevoCupon)).click();
		  System.out.println("Se Accedion a nuevo Cupon");
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(InputTitulodelCupon)));
		  driver.findElement(By.xpath(InputTitulodelCupon)).sendKeys("Compra Cualquier Producto Seleccionado");
		  driver.findElement(By.xpath(InputDescripcion)).sendKeys("Puede Canjear Este Cupon en cualquiera de nuestros productos seleccionados");
		  driver.findElement(By.xpath(InputCodigoCupon)).sendKeys("FxdWgd15df54E");
		  driver.findElement(By.xpath(InputDate)).sendKeys("28/09/2017");
		  driver.findElement(By.xpath(InputDateFinish)).sendKeys("28/09/2018");
		  driver.findElement(By.xpath(InputTime)).sendKeys("12:00");
		  driver.findElement(By.xpath(InputTimeFinish)).sendKeys("12:00");
		  driver.findElement(By.xpath(CheckTime)).click();
		  driver.findElement(By.xpath(CheckEspecial)).click();
		  driver.findElement(By.xpath(InputTerminosyCondiciones)).sendKeys("Solo Aplica en nuestras tiendas seleccionadas. (No Aplica en el Salvador)");
		  driver.findElement(By.xpath(ButtonCrear)).click();
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method Failed in Nuevo Cupon " + e.getMessage());
	  }
  }
}
