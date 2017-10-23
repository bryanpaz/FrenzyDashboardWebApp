package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Editar_Cupon extends Modificar_Promocion {
	
  @Test(testName="Test Editar Cupon",description="Editar Cupon Creado",priority=20)
  public void Cupon_Test() {
	  try {
		  Thread.sleep(1000);
		  //Modificar a Descuento
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowCupon)));
		  driver.findElement(By.xpath(RowCupon)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
		  driver.findElement(By.xpath(ButtonSI)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Check2)));
		  driver.findElement(By.xpath(Check2)).click();
		  driver.findElement(By.xpath(PorcentDesc)).clear();
		  driver.findElement(By.xpath(PorcentDesc)).sendKeys("100");
		  driver.findElement(By.xpath(ButtonCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSalir)));
		  driver.findElement(By.xpath(ButtonSalir)).click();
		  //Modificar a Porcentaje
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowCupon)));
		  driver.findElement(By.xpath(RowCupon)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
		  driver.findElement(By.xpath(ButtonSI)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Ckeck3)));
		  driver.findElement(By.xpath(Ckeck3)).click();
		  driver.findElement(By.xpath(ButtonCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSalir)));
		  driver.findElement(By.xpath(ButtonSalir)).click();
		  //Modificar a FechaLimite
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowCupon)));
		  driver.findElement(By.xpath(RowCupon)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
		  driver.findElement(By.xpath(ButtonSI)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Check1)));
		  driver.findElement(By.xpath(Check1)).click();
		  driver.findElement(By.xpath(ButtonCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSalir)));
		  driver.findElement(By.xpath(ButtonSalir)).click();
		  //Modificar a Descuento y cantidad
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RowCupon)));
		  driver.findElement(By.xpath(RowCupon)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
		  driver.findElement(By.xpath(ButtonSI)).click();
		  driver.findElement(By.xpath("(//DIV[@class='clickCursor'])[1]")).click();
		  driver.findElement(By.xpath("(//DIV[@class='clickCursor'])[3]")).click();
		  driver.findElement(By.xpath(ButtonCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSalir)));
		  driver.findElement(By.xpath(ButtonSalir)).click();
		  
		  
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method failed in Editar Cupon " + e.getMessage());
	  }
  }
}
