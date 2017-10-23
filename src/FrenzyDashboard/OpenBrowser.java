package FrenzyDashboard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class OpenBrowser {
	public String FrenzyDash = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/menu/home";
	public String Servicios = "(//P[@href='#Services'][text()='SERVICIOS'][text()='SERVICIOS'])[1]";
	public String SistemaDeBits = "(//A[@href='#menu/bits'][text()='SISTEMA DE BITS'][text()='SISTEMA DE BITS'])[1]";
	public String FlechaAbajo = "//IMG[@src='img/flecha-abajo.png']";
	public String ButtonComprar = "//BUTTON[@class='buttonInBits'][text()='¡Comprar!']";
	public String ButtonCalculaTuCosto = "//BUTTON[@class='buttonInBits'][text()='Calcula tu costo']";
	public String ButtonRegistrate = "//BUTTON[@class='buttonRegister'][text()='¡Regístrate!']";
	public String CuponesyPromociones = "(//A[@href='#/menu/coupons_and_promotions'])[1]";
	public String ButtonRegistrateBits = "(//BUTTON[@class='buttonInBits'][text()='¡Regístrate!'][text()='¡Regístrate!'])[1]";
	public String ButtonRegistrateBits2 = "(//BUTTON[@class='buttonInBits'][text()='¡Regístrate!'][text()='¡Regístrate!'])[2]";
	public String SistemadeGibits = "(//A[@href='#/menu/GiBits'])[1]";
	public String ButtonVideo = "//IMG[@src='img/play-video.png']";
	static WebDriver driver;
	@Test(description="Abre el navegador configurado", priority=1)
  public void AbrirNavegador() {
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//Abrir el navegador
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }
}
