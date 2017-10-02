package fd;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashboard {
	
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
	static WebDriver driver;
	@Test(testName="Inicio de Chrome",description="Apertura del navegador configurado")
  public void AbrirNavegador() throws InterruptedException {

		
		//Link home
		String Dashboard = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/menu/home";
			
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/test/FrenzyDashboard/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Apertura del navegador");
		//Ir a la ruta
		driver.get(Dashboard);
		System.out.println("Apertura del Landpage");
		}
	@Test(testName="Inicio de Chrome",description="Apertura del navegador configurado")
	  public void IniciarSesion() throws InterruptedException {

		Thread.sleep(4000);
			//Click en iniciar sesion
		driver.findElement(By.xpath("(//P[@class='buttonMenu'][text()='INICIAR SESIÓN'][text()='INICIAR SESIÓN'])[1]")).click();
		System.out.println("nav btn login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//INPUT[@type='text'])[1]")).click();
		driver.findElement(By.xpath("(//INPUT[@type='text'])[1]")).sendKeys("frenzydashboard@bryanpaz.com");
		driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys("Bryan05112012");
		driver.findElement(By.xpath("//DIV[@class='redButtonStyle']")).click();
		System.out.println("btn login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//BUTTON[@type='button'][text()='Salir']")).click();
		System.out.println("btn out");
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//P[@class='buttonMenu'][text()='INICIAR SESIÓN'][text()='INICIAR SESIÓN'])[1]")).click();		
		System.out.println("nav btn login");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//DIV[@class='col-xs-6 col-sm-6 col-md-3 col-lg-3 ng-scope']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//BUTTON[@type='button'][text()='Dashboard']")).click();
		
	}
	@Test(testName="Inicio de Chrome",description="Apertura del navegador configurado")
	  public void Select() throws InterruptedException {
		
		String tienda = "//DIV[@class='col-xs-6 col-sm-6 col-md-3 col-lg-3 ng-scope']";
		String btndash = "//BUTTON[@type='button'][text()='Dashboard']";

		driver.findElement(By.xpath(tienda)).click();
		driver.findElement(By.xpath(btndash)).click();
		System.out.println("Se ha seleccionado la tienda");
			}

	@Test(testName="Inicio de Chrome",description="Apertura del navegador configurado")
	  public void Promo() throws InterruptedException {	
		String btn = "//DIV[@class='glyphicon glyphicon-plus frenzyTitleColorText frenzyCircleButton clickCursor ng-scope']";
		String btnpromo = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[1]";

		// Dentro de promo
		String tpromo = "(//INPUT[@type='text'])[1]";
		String dpromo = "(//TEXTAREA[@type='text'])[1]";
		String url = "(//INPUT[@type='text'])[2]";
		String fpub = "(//INPUT[@type='date'])[1]";
		String ff = "(//INPUT[@type='date'])[2]";
		String hpub = "(//INPUT[@type='time'])[1]";
		String hf = "(//INPUT[@type='time'])[2]";
		String tyc = "(//TEXTAREA[@type='text'])[2]";
		String crear = "//DIV[@class='frenzyButton']";

		WebDriverWait wait = new WebDriverWait(driver,30);
		
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn)));
		  driver.findElement(By.xpath(btn)).click();
		  
		Thread.sleep(1000);
		driver.findElement(By.xpath(btnpromo)).click();
		
		//Promo
		Thread.sleep(2000);
		driver.findElement(By.xpath(tpromo)).click();
		driver.findElement(By.xpath(tpromo)).sendKeys("TestPromo1");
		
		driver.findElement(By.xpath(dpromo)).click();
		driver.findElement(By.xpath(dpromo)).sendKeys("Descripción de la promoción de prueba");
		
		driver.findElement(By.xpath(url)).click();
		driver.findElement(By.xpath(url)).sendKeys("https://www.bryanpaz.com");
		
		driver.findElement(By.xpath(fpub)).click();
		driver.findElement(By.xpath(fpub)).sendKeys("28092017");
		
		driver.findElement(By.xpath(ff)).click();
		driver.findElement(By.xpath(ff)).sendKeys("28102017");
		
		driver.findElement(By.xpath(hpub)).click();
		driver.findElement(By.xpath(hpub)).sendKeys("1000");
		
		driver.findElement(By.xpath(hf)).click();
		driver.findElement(By.xpath(hf)).sendKeys("1000");
		
		driver.findElement(By.xpath(tyc)).click();
		driver.findElement(By.xpath(tyc)).sendKeys("Descripción del test correspondiente.");
		
		driver.findElement(By.xpath(crear)).click();
		System.out.println("Promoción creada exitosamente");
		}
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
		  System.out.println("Cupón creado exitosamente");
	  }
	
	
	@Test(testName="Inicio de Chrome",description="Apertura del navegador configurado")
	  public void TLealtad() throws InterruptedException {	
		String btn = "//DIV[@class='glyphicon glyphicon-plus frenzyTitleColorText frenzyCircleButton clickCursor ng-scope']";
		String btnlealtad = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[3]";

		// Dentro de promo
		String namet = "//INPUT[@type='text']";
		String dpromo = "(//TEXTAREA[@type='text'])[1]";
		String pol = "(//TEXTAREA[@type='text'])[2]";
		String fpub = "(//INPUT[@type='date'])[1]";
		String ff = "(//INPUT[@type='date'])[2]";
		String hpub = "(//INPUT[@type='time'])[1]";
		String hf = "(//INPUT[@type='time'])[2]";
		String next = "//DIV[@class='clickCursor']";

		WebDriverWait wait = new WebDriverWait(driver,30);
		
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn)));
		  driver.findElement(By.xpath(btn)).click();
		  
		Thread.sleep(1000);
		driver.findElement(By.xpath(btnlealtad)).click();
		
		// Alerta de límite de tarjeta
		driver.findElement(By.xpath("//BUTTON[@type='button'][text()='Salir']")).click();
		
		
		// Crear tarjeta por medio de URL
		String urlnew = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/loyaltyCard";
		driver.navigate().to(urlnew);
		
		
		
		//Promo
		Thread.sleep(2000);
		driver.findElement(By.xpath(namet)).click();
		driver.findElement(By.xpath(namet)).sendKeys("Test Tarjeta");
		
		driver.findElement(By.xpath(dpromo)).click();
		driver.findElement(By.xpath(dpromo)).sendKeys("Descripción de la promoción de prueba");
		
		driver.findElement(By.xpath(pol)).click();
		driver.findElement(By.xpath(pol)).sendKeys("Politica de canjeo - TEST");
		
		driver.findElement(By.xpath(fpub)).click();
		driver.findElement(By.xpath(fpub)).sendKeys("28092017");
		
		driver.findElement(By.xpath(ff)).click();
		driver.findElement(By.xpath(ff)).sendKeys("28102017");
		
		driver.findElement(By.xpath(hpub)).click();
		driver.findElement(By.xpath(hpub)).sendKeys("1000");
		
		driver.findElement(By.xpath(hf)).click();
		driver.findElement(By.xpath(hf)).sendKeys("1000");
		
		driver.findElement(By.xpath(next)).click();
		
		// Next
		String maxbits = "//INPUT[@id='maxPoints']";
		String awardN = "//INPUT[@id='awardName']";
		String awardD = "//INPUT[@id='descriptionAward']";
		String awardP = "//INPUT[@id='awardPoints']";
		String Qbits = "(//DIV[@class='redButtonStyle'])[3]";
		String vcf = "//INPUT[@ng-if='viewModal == 2']";
		String ok = "(//DIV[@class='redButtonStyle'])[4]";
		String save = "//DIV[@id='saveAwardButton']";
		String next2 = "(//DIV[@class='clickCursor'])[2]";
		
		driver.findElement(By.xpath(maxbits)).click();
		driver.findElement(By.xpath(maxbits)).sendKeys("512");

		driver.findElement(By.xpath(awardN)).click();
		driver.findElement(By.xpath(awardN)).sendKeys("512");
		
		driver.findElement(By.xpath(awardD)).click();
		driver.findElement(By.xpath(awardD)).sendKeys("512");
		
		driver.findElement(By.xpath(awardP)).click();
		driver.findElement(By.xpath(awardP)).sendKeys("512");
		
		driver.findElement(By.xpath(Qbits)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(vcf)).click();
		driver.findElement(By.xpath(vcf)).sendKeys("512");
		Thread.sleep(500);
		driver.findElement(By.xpath(ok)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(save)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(next2)).click();
		
		//Next
		String si = "//BUTTON[@class='buttonYesNo'][text()='Si']";
		String help = "(//DIV[@class='redButtonStyle'])[1]";
		String Qv = "//INPUT[@ng-if='viewModal == 1']";
		String Qok = "(//DIV[@class='redButtonStyle'])[2]";
		String confirm = "(//DIV[@class='redButtonStyle'])[1]";
		String lconfirm = "swal2-confirm";
		
		
		
		driver.findElement(By.xpath(si)).click();
		Thread.sleep(500);

		
		driver.findElement(By.className("form-control")).click();
		  driver.findElement(By.className("form-control")).sendKeys("1");
		  WebElement body = driver.findElement(By.className("form-control"));
		  body.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(help)).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath(Qv)).click();
		driver.findElement(By.xpath(Qv)).sendKeys("80");
		driver.findElement(By.xpath(Qok)).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath(next2)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(confirm)).click();
		Thread.sleep(500);
		
		driver.findElement(By.className(lconfirm)).click();
		
		
		//http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/newPromotion
		//http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/loyaltyCard
		//http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/newCoupon
		//http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/instantAward
		System.out.println("Tarjeta de lealtad creada exitosamente");

		}
	@Test
	  public void PremiosalInstante() {
		  
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonPlus)));
		  driver.findElement(By.xpath(ButtonPlus)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonPremiosalInstante)));
		  driver.findElement(By.xpath(ButtonPremiosalInstante)).click();
		  
		// Alerta de límite de tarjeta
			driver.findElement(By.xpath("//BUTTON[@type='button'][text()='Salir']")).click();
			
			
			// Crear tarjeta por medio de URL
			String urlnew = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/instantAward";
			driver.navigate().to(urlnew);
		  
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
		  System.out.println("Promoción al instante creada exitosamente");
		  
	  }
			
	
}
