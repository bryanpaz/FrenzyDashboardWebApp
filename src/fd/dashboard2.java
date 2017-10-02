package fd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dashboard2 {
	static WebDriver driver;
	//Variables
	public String FrenzyDash = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/menu/home";
	public String IniciarSesion = "(//DIV[@class='boxButtonMenu col-xs-2 col-sm-2 col-md-2 col-lg-2'])[3]";
	public String ModalSesion = "//DIV[@class='modal-content']";
	public String Usuario = "(//INPUT[@type='text'])[1]";
	public String Contraseña = "//INPUT[@type='password']";
	public String ButtonEntrar = "//DIV[@class='redButtonStyle']";
	public String ButtonEmpresa = "//DIV[@class='col-xs-6 col-sm-6 col-md-3 col-lg-3 ng-scope']";
	public String ModalQuestion = "(//DIV[@role='dialog'])[2]";
	public String ButtonDashboard = "//BUTTON[@type='button'][text()='Dashboard']";
	public String ButtonPlus = "//DIV[@class='glyphicon glyphicon-plus frenzyTitleColorText frenzyCircleButton clickCursor ng-scope']";
	public String ButtonNuevoCupon = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[2]";
	public String InputTitulodelCupon = "(//INPUT[@type='text'])[1]";
	public String InputDescripcion = "(//TEXTAREA[@type='text'])[1]";
	public String InputCodigoCupon = "(//INPUT[@type='text'])[2]";
	public String InputDate = "(//INPUT[@type='date'])[1]";
	public String InputDateFinish = "(//INPUT[@type='date'])[2]";
	public String InputTime = "(//INPUT[@type='time'])[1]";
	public String InputTimeFinish = "(//INPUT[@type='time'])[2]";
	public String CheckTime = "(//DIV[@class='clickCursor'])[1]";
	public String CheckEspecial = "(//DIV[@class='clickCursor'])[3]";
	public String InputTerminosyCondiciones = "(//TEXTAREA[@type='text'])[2]";
	public String ButtonCrear = "//DIV[@class='frenzyButton']";
	public String ButtonPremiosalInstante = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[4]";
	public String InputNOcodigos = "//SELECT[@class='form-control CategoryApp styleSelectOrInput widthSelectOrInput PackageValue ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']";
	public String InputPremios = "(//INPUT[@type='number'])[1]";
	public String InputRedencion = "(//INPUT[@type='number'])[3]";
	public String ButtonSiguiente = "//SPAN[@class='glyphicon glyphicon-chevron-right']";
	public String InputNombrePremio = "//INPUT[@type='text']";
	public String InputDescripcionPromo = "(//TEXTAREA[@type='text'])[1]";
	public String InputPolitica = "(//TEXTAREA[@type='text'])[2]";
	public String InputTerminos = "(//TEXTAREA[@type='text'])[3]";
	public String InputNombre = "//INPUT[@id='awardName']";
	public String InputDescripcion2 = "//INPUT[@id='descriptionAward']";
	public String InputCantidad = "//INPUT[@id='quantityAward']";
	public String ButtonGuardar = "//DIV[@id='saveAwardButton']";
	public String ButtonSI = "(//DIV[@class='redButtonStyle'])[1]";
	public String PromocionCreada = "//DIV[@role='dialog']";
	public String ButtonSalir = "//BUTTON[@type='button'][text()='Salir']";
  @Test
  public void NuevoCupon() throws InterruptedException {
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
  }
  @Test
  public void PremiosalInstante() {
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonPlus)));
	  driver.findElement(By.xpath(ButtonPlus)).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonPremiosalInstante)));
	  driver.findElement(By.xpath(ButtonPremiosalInstante)).click();
	  System.out.println("Se Accedio a Premios al Instante");
	  // Primeros Campos
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));
	  driver.findElement(By.className("form-control")).click();
	  driver.findElement(By.className("form-control")).sendKeys("25");
	  WebElement body = driver.findElement(By.className("form-control"));
	  body.sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath(InputPremios)).sendKeys("100");
	  driver.findElement(By.xpath(InputRedencion)).sendKeys("100");
	  driver.findElement(By.xpath(ButtonSiguiente)).click();
	  // Segundos Campos
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
	  // Terceros Campos
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(InputNombre)));
	  driver.findElement(By.xpath(InputNombre)).sendKeys("Producto Gratis");
	  driver.findElement(By.xpath(InputDescripcion2)).sendKeys("Cualquier Producto Seleccionado Gratis");
	  driver.findElement(By.xpath(InputCantidad)).sendKeys("100");
	  driver.findElement(By.xpath(ButtonGuardar)).click();
	  driver.findElement(By.xpath(ButtonSiguiente)).click();
	  //Cuartos Campos
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonSI)));
	  driver.findElement(By.xpath(ButtonSI)).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PromocionCreada)));
	  driver.findElement(By.xpath(ButtonSalir)).click();
	  
  }
}