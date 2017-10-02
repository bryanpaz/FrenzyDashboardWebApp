package fd;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test {
	static WebDriver driver;
	@Test(testName="Inicio de Chrome",description="Apertura del navegador configurado")
  public void AbrirNavegador1() throws InterruptedException {

		
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
	
	@Test(testName="Botones de Navegación",description="Prueba de botones de navegación")
	  public void Navegacion() throws InterruptedException {
		// Variables de automatización de navegación
		String Servicios = "(//P[@href='#Services'][text()='SERVICIOS'][text()='SERVICIOS'])[1]";
		String Beneficios = "(//P[@href='#Benefits'][text()='BENEFICIOS'][text()='BENEFICIOS'])[1]";
		String Contacto = "(//P[@href='#contactUs'][text()='CONTACTO'][text()='CONTACTO'])[1]";
		String Login = "(//P[@class='buttonMenu'][text()='INICIAR SESIÓN'][text()='INICIAR SESIÓN'])[1]";
		String Registro = "(//DIV[@class='selectTabLogin'])[2]";
		Thread.sleep(4000);
		driver.findElement(By.xpath(Servicios)).click();
		System.out.println("Click en Servicios");
		driver.findElement(By.xpath(Beneficios)).click();
		System.out.println("Click en Beneficios");
		driver.findElement(By.xpath(Contacto)).click();
		System.out.println("Click en Contacto");
		driver.findElement(By.xpath(Login)).click();
		System.out.println("Click en Login");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Registro)).click();
		Thread.sleep(2500);
		System.out.println("Click en Registro");
		driver.navigate().refresh();
		System.out.println("Vista principal");
		}
	@Test(testName="Servicios Principal",description="Prueba de Servicios en home")
	  public void HomeServicios() throws InterruptedException {
		// Variables de automatización de botones generales
		String home = "//IMG[@class='imgLogo']";
		String vermas1 = "(//BUTTON[@class='buttonSeeMore'][text()='VER MÁS'][text()='VER MÁS'])[1]";
		String vermas2 = "(//BUTTON[@class='buttonSeeMore'][text()='VER MÁS'][text()='VER MÁS'])[2]";
		String vermas3 = "(//BUTTON[@class='buttonSeeMore'][text()='VER MÁS'][text()='VER MÁS'])[3]";
		String clickdown1  = "(//IMG[@src='img/flecha-abajo.png'])[1]";
		String clickdown2  = "(//IMG[@src='img/flecha-abajo.png'])[2]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(vermas1)).click();
		System.out.println("Sistema de bits");
		driver.findElement(By.xpath(home)).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(vermas2)).click();
		System.out.println("Cupones y Promociones");
		driver.findElement(By.xpath(home)).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(vermas3)).click();
		System.out.println("GiBits");
		driver.findElement(By.xpath(home)).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(clickdown2)).click();

			}
	
	@Test(testName="Video Principal",description="Prueba de Video en home")
	  public void VideoHome() throws InterruptedException {
		// Variables de automatización de botones generales
		String video1 = "//IMG[@src='img/play-video.png']";
//		String telefono = "//IMG[@src='img/icon-numero.png']";
//		String ubicacion = "//IMG[@src='img/icon-ubi.png']";
//		String registrate = "//BUTTON[@class='buttonRegister'][text()='¡Regístrate!']";
		Thread.sleep(2000);
		driver.findElement(By.xpath(video1)).click();
		System.out.println("Video desplegado");
		driver.navigate().refresh();
		Thread.sleep(2500);
			}
	
	@Test(testName="Formulario",description="Prueba de Formulario")
	  public void Formulario() throws InterruptedException {

		// Variables de automatización de botones generales
		String telefono = "//IMG[@src='img/icon-numero.png']";
		String ubicacion = "//IMG[@src='img/icon-ubi.png']";
		String registrate = "//BUTTON[@class='buttonRegister'][text()='¡Regístrate!']";
		Thread.sleep(2000);
		driver.findElement(By.xpath(telefono)).click();
		System.out.println("Click en telefono");
		Thread.sleep(2000);
		driver.findElement(By.xpath(ubicacion)).click();
		System.out.println("Click en ubicacion");
		Thread.sleep(2000);
		driver.findElement(By.xpath(registrate)).click();
		System.out.println("Click en registrate");
		driver.navigate().refresh();
		Thread.sleep(2000);
		// Formulario
		String InpNombre = "//INPUT[@id='inputContactUs']";
		String InpCorreo = "//INPUT[@id='inputContactUs2']";
		String InpAsunto = "//INPUT[@id='inputContactUs3']";
		String InpMensaje = "inputContactUs4";
		String BotonEnviar = "//BUTTON[@class='buttonSend'][text()='Enviar']";
		driver.findElement(By.xpath(InpNombre)).click();
		driver.findElement(By.xpath(InpNombre)).sendKeys("Bryan Paz");
		Thread.sleep(500);
		driver.findElement(By.xpath(InpCorreo)).click();
		driver.findElement(By.xpath(InpCorreo)).sendKeys("test@bryanpaz.com");
		Thread.sleep(500);
		driver.findElement(By.xpath(InpAsunto)).click();
		driver.findElement(By.xpath(InpAsunto)).sendKeys("test");
		Thread.sleep(500);
		driver.findElement(By.id(InpMensaje)).click();
		driver.findElement(By.id(InpMensaje)).sendKeys("TESTING");
		Thread.sleep(500);
		driver.findElement(By.xpath(BotonEnviar)).click();
	}
	//Variables
	public String FrenzyDash = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/menu/home";
	public String Servicios = "(//P[@href='#Services'][text()='SERVICIOS'][text()='SERVICIOS'])[1]";
	public String SistemaDeBits = "(//A[@href='#menu/bits'][text()='SISTEMA DE BITS'][text()='SISTEMA DE BITS'])[1]";
	public String ButtonVideo = "//IMG[@src='img/play-video.png']";
	public String FlechaAbajo = "//IMG[@src='img/flecha-abajo.png']";
	public String ButtonComprar = "//BUTTON[@class='buttonInBits'][text()='¡Comprar!']";
	public String ButtonCalculaTuCosto = "//BUTTON[@class='buttonInBits'][text()='Calcula tu costo']";
	public String ButtonRegistrate = "//BUTTON[@class='buttonRegister'][text()='¡Regístrate!']";
	public String CuponesyPromociones = "(//A[@href='#/menu/coupons_and_promotions'])[1]";
	public String ButtonRegistrateBits = "(//BUTTON[@class='buttonInBits'][text()='¡Regístrate!'][text()='¡Regístrate!'])[1]";
	public String ButtonRegistrateBits2 = "(//BUTTON[@class='buttonInBits'][text()='¡Regístrate!'][text()='¡Regístrate!'])[2]";
	public String SistemadeGibits = "(//A[@href='#/menu/GiBits'])[1]";
	
	  @Test
	  public void SeccionSistemaDeBits() throws InterruptedException {
		  	WebDriverWait wait = new WebDriverWait(driver,30);
		  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Servicios)));
		  	//Click en Servicios
			driver.findElement(By.xpath(Servicios)).click();
			//Click en Sitema de Bits
			driver.findElement(By.xpath(SistemaDeBits)).click();
			Thread.sleep(2000);
			//Scroll up
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, -250)");
		  
	  }
	  @Test
	  public void VideoSistemadeBits() throws InterruptedException{
		  	WebDriverWait wait = new WebDriverWait(driver,30);
		  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ButtonVideo)));
		  	//Click en el video
			driver.findElement(By.xpath(ButtonVideo)).click();
			Thread.sleep(2000);
			//Refresh
			driver.navigate().refresh();
	  }
	  @Test
	  public void BotonComprar() throws InterruptedException{
		  	Thread.sleep(1000);
		  	//Click Flecha Abajo
			driver.findElement(By.xpath(FlechaAbajo)).click();
			Thread.sleep(1000);
			//Click Boton Comprar
			driver.findElement(By.xpath(ButtonComprar)).click();
			Thread.sleep(1000);
			WebElement body = driver.findElement(By.tagName("body"));
			body.sendKeys(Keys.ESCAPE);
		  
	  }
	  @Test
	  public void CalculaTuCosto() throws InterruptedException{
		  	//Click en Calcula tu Costo
		  	driver.findElement(By.xpath(ButtonCalculaTuCosto)).click();
			Thread.sleep(1000);
			//Llenar campo clientes al mes
			driver.findElement(By.className("inputCost")).sendKeys("12");
	  }
	  @Test
	  public void Registrate() throws InterruptedException{
		  	Thread.sleep(1000);
		  	//Click En Registrate
			driver.findElement(By.xpath(ButtonRegistrate)).click();
			Thread.sleep(1000);
			WebElement body = driver.findElement(By.tagName("body"));
			body.sendKeys(Keys.ESCAPE);
	  }
	  @Test
	  public void SeccionCuponesyPromociones() throws InterruptedException {
		  	WebDriverWait wait = new WebDriverWait(driver,30);
		  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Servicios)));
		  	//Click en Servicios
			driver.findElement(By.xpath(Servicios)).click();
			//Click en Cupones y Promociones
			driver.findElement(By.xpath(CuponesyPromociones)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(FlechaAbajo));
	  }
	  @Test
	  public void ButtonsRegistrate() throws InterruptedException {
		  	//Click en Botones de Registrarse
		  	driver.findElement(By.xpath(ButtonRegistrateBits)).click();
		  	Thread.sleep(1000);
			WebElement body = driver.findElement(By.tagName("body"));
			body.sendKeys(Keys.ESCAPE);
			driver.findElement(By.xpath(ButtonRegistrateBits2)).click();;
			Thread.sleep(1000);
			body.sendKeys(Keys.ESCAPE);
			driver.findElement(By.xpath(ButtonRegistrate)).click();
			Thread.sleep(1000);
			body.sendKeys(Keys.ESCAPE);
	  }
	  @Test
	  public void SeccionSistemadeGibits() throws InterruptedException {
		  	WebDriverWait wait = new WebDriverWait(driver,30);
		  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Servicios)));
		  	//Click en Servicios
			driver.findElement(By.xpath(Servicios)).click();
			//Click en Sistema de Gibits
			driver.findElement(By.xpath(SistemadeGibits)).click();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 0)");
			
	  }
	  @Test
	  public void SistemadeGibitsVideo() throws InterruptedException {
		  	WebDriverWait wait = new WebDriverWait(driver,30);
		  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ButtonVideo)));
		  	//Click en el video
			driver.findElement(By.xpath(ButtonVideo)).click();
			Thread.sleep(2000);
			//Refresh
			driver.navigate().refresh();
	  }
	  @Test
	  public void ButtonsCompraryRegistrate() throws InterruptedException {
		  	Thread.sleep(2000);
		  	//Click en Flecha Abajo
			driver.findElement(By.xpath(FlechaAbajo)).click();;
			Thread.sleep(1000);
			//Click en Comprar
			driver.findElement(By.xpath(ButtonComprar)).click();;
			Thread.sleep(1000);
			WebElement body = driver.findElement(By.tagName("body"));
			body.sendKeys(Keys.ESCAPE);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 250)");
			//Click en Registrarse
			driver.findElement(By.xpath(ButtonRegistrate)).click();
			Thread.sleep(1000);
			body.sendKeys(Keys.ESCAPE);
	  }
	
}

