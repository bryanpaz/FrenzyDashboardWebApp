package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Modificar_Promocion extends Premios_al_Instante {
  @Test(testName="Modificar Promoción",description="Modificar Promoción Creada",priority=19)
  public void ModificarPromoción_Test() {
	  try {
		  //Modificar a Descuento
		  Thread.sleep(1000);
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowPromocion)));
		  driver.findElement(By.xpath(RowPromocion)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
		  driver.findElement(By.xpath(ButtonSI)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Check1)));
		  driver.findElement(By.xpath(Check1)).click();
		  driver.findElement(By.xpath(InputPremios)).clear();;
		  driver.findElement(By.xpath(InputPremios)).sendKeys("100");
		  driver.findElement(By.xpath(InputPrecioBase)).clear();
		  driver.findElement(By.xpath(InputPrecioBase)).sendKeys("50");
		  driver.findElement(By.xpath(InputPolitica)).clear();
		  driver.findElement(By.xpath(InputPolitica)).sendKeys("Solo En Productos Seleccionados");
		  driver.findElement(By.xpath(ButtonCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSalir)));
		  driver.findElement(By.xpath(ButtonSalir)).click();
		  //Modificar a Porcentaje
		  Thread.sleep(1500);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowPromocion)));
		  driver.findElement(By.xpath(RowPromocion)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
		  driver.findElement(By.xpath(ButtonSI)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Check2)));
		  driver.findElement(By.xpath(Check2)).click();
		  driver.findElement(By.xpath(PorcentDesc)).clear();
		  driver.findElement(By.xpath(PorcentDesc)).sendKeys("100");
		  driver.findElement(By.xpath(InputPolitica)).clear();
		  driver.findElement(By.xpath(InputPolitica)).sendKeys("Solo En Productos Seleccionados");
		  driver.findElement(By.xpath(ButtonCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSalir)));
		  driver.findElement(By.xpath(ButtonSalir)).click();
		  //Modificar a Especial
		  Thread.sleep(1500);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowPromocion)));
		  driver.findElement(By.xpath(RowPromocion)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
		  driver.findElement(By.xpath(ButtonSI)).click();
		  driver.findElement(By.xpath("(//DIV[@class='clickCursor'])[1]")).click();
		  driver.findElement(By.xpath(ButtonCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSalir)));
		  driver.findElement(By.xpath(ButtonSalir)).click();
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method failed in Modificar Promoción " + e.getMessage());
	  }
  }
}
