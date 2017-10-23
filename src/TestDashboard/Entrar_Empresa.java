package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Entrar_Empresa extends Login {
  @Test(testName="Entrar en Empresa",description="Entrar en Empresa selecciondad",priority=14)
  public void f() {
	  try {
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonEmpresa)));
		  driver.findElement(By.xpath(ButtonEmpresa)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ModalQuestion)));
		  driver.findElement(By.xpath(ButtonDashboard)).click();
		  System.out.println("Se Ingreso a la empresa");
		  
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method Failed in Entrar en Empresa " + e.getMessage());
	  }
  }
}
