package FrenzyDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Navbar extends Home_URL {
	
	@Test(testName="Botones de Navegaci�n",description="Prueba de botones de navegaci�n",priority=3)
	public void Navegacion() throws InterruptedException {
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver,30);
			
	    	//Ir a la ruta
	    	 // Variables de automatizaci�n de navegaci�n
		    String Servicios = "(//P[@href='#Services'][text()='SERVICIOS'][text()='SERVICIOS'])[1]";
		    String Beneficios = "(//P[@href='#Benefits'][text()='BENEFICIOS'][text()='BENEFICIOS'])[1]";
		    String Contacto = "(//P[@href='#contactUs'][text()='CONTACTO'][text()='CONTACTO'])[1]";
		    String Login = "(//P[@class='buttonMenu'][text()='INICIAR SESI�N'][text()='INICIAR SESI�N'])[1]";
		    String Registro = "(//DIV[@class='selectTabLogin'])[2]";
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Servicios)));
		    driver.findElement(By.xpath(Servicios)).click();
		    driver.findElement(By.xpath(Beneficios)).click();
		    driver.findElement(By.xpath(Contacto)).click();
		    driver.findElement(By.xpath(Login)).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Registro)));
		    driver.findElement(By.xpath(Registro)).click();
		    Thread.sleep(500);
		    driver.navigate().refresh();
	    	
	    }catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Method Failed in Navbar " + e.getMessage());
        }
	}
}
