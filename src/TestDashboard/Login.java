package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends SignUp {
  @Test(testName="Test Login",description="Test Login de usuario",priority=13)
  public void Login_Test() {
	  try {
		  Thread.sleep(500);
		   WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IniciarSesion)));
		  driver.findElement(By.xpath(IniciarSesion)).click();
		  driver.findElement(By.xpath(Usuario)).sendKeys("strickergt128@gmail.com");
		  driver.findElement(By.xpath(Contraseña)).sendKeys("PlayStation4");
		  driver.findElement(By.xpath(ButtonEntrar)).click();
		  System.out.println("Se inicio Sesion");
		  
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method failed in Login " + e.getMessage());
	  }
  }
}
