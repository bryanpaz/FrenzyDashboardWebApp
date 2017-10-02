package Package_1;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_Frenzy_Firefox {
	static WebDriver driver;
  @Test
  public void AbrirNavegador() throws InterruptedException {
	  	//Links Navbar
		
		String Frenzy = "https://frenzy.com.gt/#/menu/home";
			
		//Chrome Driver
//		System.setProperty("webdriver.chrome.driver", "C:/Testing/webdriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/Testing/webdriver/geckodriver.exe");
		//Abrir el navegador
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		System.out.println("Se Abrio el navegador");
		//Ir a la ruta
		driver.get(Frenzy);
		System.out.println("Abrio la Ruta");
}
  @Test
  public void Login () throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver,45);
	//Varables Datos Usuario
		
			String Nombre = "Bryan Paz";
			String Correo = "correo@bryanpaz.com";
			String Contraseña = "Bryan05112012";
			String Fecha = "05/11/1999";
	//Variables Localización Botones y Campos
		
			String btnCorreoElec = "//DIV[@class='email flexVerticalCenter justifyContentCenter']";
			String btnRegistrate = "//DIV[@class='signUp flexVerticalCenter justifyContentCenter']";
			String InpNombre = "(//INPUT[@type='text'])[1]";
			String InpCorreoElec = "//INPUT[@type='email']";
			String InpContraseña = "//INPUT[@type='password']";
			String InpGenero = "(//DIV[@class='genre flexVerticalCenter justifyContentCenter'])[1]";
			String InpFecha = "//INPUT[@type='date']";
			String btnCrear = "//DIV[@class='accessOrCreate flexVerticalCenter justifyContentCenter']";
			String btnOK = "//BUTTON[@type='button'][text()='OK']";
			String btnLoginCorreo = "//DIV[@class='signUp flexVerticalCenter justifyContentCenter']";
			String btnEntar = "//DIV[@class='accessOrCreate flexVerticalCenter justifyContentCenter']";
	//Esperar que el boton sea clickleable
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnCorreoElec)));
			//Click en Correo Electronico
			driver.findElement(By.xpath(btnCorreoElec)).click();
			//Click en Registrate
			driver.findElement(By.xpath(btnRegistrate)).click();
			//Llenar campo nombre
			driver.findElement(By.xpath(InpNombre)).sendKeys(Nombre);
			//Llenar Campo Correo Electronico
			driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo);
			//Llenar Campo Contraseña
			driver.findElement(By.xpath(InpContraseña)).sendKeys(Contraseña);
			//Click Genero
			driver.findElement(By.xpath(InpGenero)).click();
			//Llenar Campo Fecha
			driver.findElement(By.xpath(InpFecha)).sendKeys(Fecha);
			//Click en Crear
			driver.findElement(By.xpath(btnCrear)).click();
			System.out.println("Se creo el Usuario");
			// Alert informacion de cuenta existente

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@role='dialog'])[2]")));
			driver.findElement(By.xpath(btnOK)).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(btnLoginCorreo)).click();
			//LLenar Campos de Login
			driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo);
			driver.findElement(By.xpath(InpContraseña)).sendKeys(Contraseña);
			driver.findElement(By.xpath(btnEntar)).click();
			System.out.println("Se inicio Sesion");
  }
  
  @Test
  public void Navegacion () throws InterruptedException {

	//Links Navbar	
		String Frenzy = "https://frenzy.com.gt/#/menu/home";
		String QueEsFrenzy = "https://frenzy.com.gt/#/menu/what_is_frenzy";
		String Favoritos = "https://frenzy.com.gt/#/menu/favorites";
		String Bits = "https://frenzy.com.gt/#/menu/points";
		String Premios = "https://frenzy.com.gt/#/menu/awards";
	  
	  //	botones navbar
		Thread.sleep(5000);
		driver.navigate().to(QueEsFrenzy);
		System.out.println("Se Accedio a:'Que es Frenzy'");
		Thread.sleep(2000);
		driver.navigate().to(Favoritos);
		System.out.println("Se Accedio a:'Favoritos'");
		Thread.sleep(1000);
		driver.navigate().to(Bits);
		Thread.sleep(3000);		
		 if(!driver.findElements(By.xpath("//DIV[@class='row flexVerticalCenter justifyContentCenter contentPoints ng-scope']")).isEmpty()){
			    System.out.println("Bits Loaded");
			}else{
				 System.out.println("---------------Bits not Loaded---------------");
			}
		driver.navigate().to(Premios);
		System.out.println("Se Accedio a:'Premios'");
		Thread.sleep(2000);
		driver.navigate().to(Frenzy);
		System.out.println("Los Botones del Navbar Funcionan Correctamente");
  }
  
 
  
	  @Test
	  public void BotonesHome() throws InterruptedException {
	      String btnOK = "//BUTTON[@type='button'][text()='OK']";
	      WebDriverWait wait = new WebDriverWait(driver,30);
	    //Boton Go!
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@class='buttonGO flexVerticalCenter justifyContentCenter']")));
	            driver.findElement(By.xpath("//DIV[@class='buttonGO flexVerticalCenter justifyContentCenter']")).click();
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@role='dialog']")));
	            Thread.sleep(1500);
	            driver.findElement(By.xpath(btnOK)).click();
	            System.out.println("El boton GO! y El Alert Funcionan correctamente");
	            
	            //Codigo de promoción Alert
	            Thread.sleep(1500);
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@class='buttonTutorialCodePromotion flexVerticalCenter justifyContentCenter']")));
	            driver.findElement(By.xpath("//DIV[@class='buttonTutorialCodePromotion flexVerticalCenter justifyContentCenter']")).click();
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='boxModalTutorialCodePromotion']")));
	            Thread.sleep(1500);
	            driver.findElement(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]")).click();
	            System.out.println("El boton donde consigo codigo de promoción y El Alert Funcionan correctamente");
	            
	 }
	  
	  @Test
	  public void Categorias() throws InterruptedException {
		  String Frenzy = "https://frenzy.com.gt/#/menu/home";
			//Categorias
		  WebDriverWait wait = new WebDriverWait(driver,30);
			int c = 1;
			while (c>0) {
				if (!driver.findElements(By.xpath("(//DIV[@class='contentBoxCategory flexHorizontalCenter col-xs-12 col-sm-4 col-md-4 col-lg-4 ng-scope'])[" + c + "]")).isEmpty()) {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@class='contentBoxCategory flexHorizontalCenter col-xs-12 col-sm-4 col-md-4 col-lg-4 ng-scope'])[" + c + "]")));
					driver.findElement(By.xpath("(//DIV[@class='contentBoxCategory flexHorizontalCenter col-xs-12 col-sm-4 col-md-4 col-lg-4 ng-scope'])[" + c + "]" )).click();
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					System.out.println("Se accedio a la Categoria No." + c);
			        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='row padding10Porcent0 flexVerticalCenter justifyContentCenter ng-scope']")));
			        int a = 1;
			        while (a>0) {
			            if(!driver.findElements(By.xpath("(//DIV[@class='boxCustomer'])[" + a + "]")).isEmpty()){
			                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//DIV[@class='boxCustomer'])[" + a + "]")));
			                driver.findElement(By.xpath("(//DIV[@class='boxCustomer'])[" + a + "]")).click();
			                System.out.println("Se accedio al socio NO." + a);
			                jse.executeScript("scroll(0, 0)");
			                wait.until(ExpectedConditions.elementToBeClickable(By.className("contentWeb")));
			                driver.findElement(By.className("contentWeb")).click();
			                System.out.println("Se accedió al sitio web del socio");
			                
//			                Thread.sleep(2000);
			                
			                try {
			                    Set<String> windows = driver.getWindowHandles();
			                    Iterator<String> iter = windows.iterator();
			                    String[] winNames=new String[windows.size()];
			                    int w=0;
			                    while (iter.hasNext()) {
			                        winNames[w]=iter.next();
			                        w++;
			                    }
			                    if(winNames.length > 1) {
			                        for(w = winNames.length; w > 1; w--) {
			                            driver.switchTo().window(winNames[w - 1]);
			                            String actualUrl = driver.getCurrentUrl();
			                            String url = "https://testing-frenzy-web.netlify.com/#/menu/home";
			                            if(actualUrl.equals(url)) {
			                            	System.out.println("---------------Error en Url del socio---------------");
			                            }
			                            driver.close();
			                        }
			                    }
			                    driver.switchTo().window(winNames[0]);
			                }
			                catch(Exception e){         
			                    e.printStackTrace();
			                }
			                
			                
			                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@onclick='goBack()'][text()='\n" + 
			                        "\n" + 
			                        "        ']")));
			                driver.findElement(By.xpath("//DIV[@onclick='goBack()'][text()='\n" + 
			                        "\n" + 
			                        "        ']")).click();
			                ++a;
			              }else{
			                   driver.navigate().to(Frenzy);
			                   System.out.println("---------------No se Encontraron más socios---------------");
			                   break;
			              }
			        }
			        ++c;
				}else {
					driver.navigate().to(Frenzy);
					System.out.println("---------------No se encontraron más categorias---------------");
					break;
				}
				
	        }
	            
	 }
	  
	 @Test
	 public void GanarBits() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,30);
			//Boton tutorial ganar y cambiar Bits
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@class='buttonTutorialHowWinPoints flexVerticalCenter justifyContentCenter']")));
			driver.findElement(By.xpath("//DIV[@class='buttonTutorialHowWinPoints flexVerticalCenter justifyContentCenter']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='buttonTutorialHowWinPoints flexVerticalCenter justifyContentCenter']")));
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[3]")).click();
			System.out.println("El boton como gano y cambio Bits y el Alert funcionan correctamente");
	 }
	 @Test
	 public void QueEsFrenzyVideo() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,30);
			// Ir hacia ¿Qué es Frenzy?
		 String Frenzy = "https://frenzy.com.gt/#/menu/home";
			String QueEsFrenzy = "https://frenzy.com.gt/#/menu/what_is_frenzy";
			Thread.sleep(1500);
			driver.navigate().to(QueEsFrenzy);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//IMG[@class='imgVideoButton']")));
			driver.findElement(By.xpath("//IMG[@class='imgVideoButton']")).click();
			Thread.sleep(1500);
			System.out.println("El Video se Desplego");
			driver.navigate().refresh();
			driver.navigate().to(Frenzy);
	 }
	 @Test
	 public void ComoGanoBits() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,30);
			String Bits = "https://frenzy.com.gt/#/menu/points";
			//Ir hacia Points
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='textCenter col-xs-12 col-sm-12 col-md-10 col-lg-8']")));
			driver.navigate().to(Bits);
			
			//Probar el boton de '¿como gano y cambio Bits?'
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")));
			driver.findElement(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='boxModalTutorialWinPoints']")));
			Thread.sleep(1500);
			driver.findElement(By.xpath("//SPAN[@aria-hidden='true'][text()='T']")).click();
			System.out.println("Elboton de Como gano Bits Funciona Correctamente");
	 }
	 
	 @Test
	 public void Ofertas() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,30);
//			Probar Las Ofertas
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='col-xs-12 col-sm-12 col-md-11 col-lg-10']")));
			int d = 1;
			while (d>0) {
				if (!driver.findElements(By.xpath("(//DIV[@class='boxPoints'])["+ d + "]")).isEmpty()) {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@class='boxPoints'])["+ d + "]")));
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//DIV[@class='boxPoints'])["+ d + "]")).click();
					System.out.println("Se accedio a la Categoria No." + d);
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("scroll(0, 0)");
			        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='col-xs-12 col-sm-11 col-md-9 col-lg-7']")));
			        int e = 1;
			        while (e>0) {
			            if(!driver.findElements(By.xpath("(//DIV[@class='buttonExchangePointsAbsolute marginRight20px'])[" + e + "]" )).isEmpty()){
			                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//DIV[@class='buttonExchangePointsAbsolute marginRight20px'])[" + e + "]")));
			                Thread.sleep(1000);
			                driver.findElement(By.xpath("(//DIV[@class='buttonExchangePointsAbsolute marginRight20px'])["+ e + "]")).click();
			                							
			                System.out.println("Se accedio a la promoción NO." + e);
			                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]")));
			                Thread.sleep(1000);
			                driver.findElement(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]")).click();
			                System.out.println("Se cerro el Alert");
			                ++e;
			              }else{
			                   driver.navigate().back();
			                   System.out.println("---------------No se Encontraron más Promociones---------------");
			                   break;
			              }
			        }
			        ++d;
				}else {
					driver.navigate().back();
					System.out.println("---------------No se encontraron más Puntos---------------");
					break;
				}
				
	        }
			
			
	 }
	 @Test
	 public void Premios() throws InterruptedException {
		 String Premios = "https://frenzy.com.gt/#/menu/awards";
		 String Frenzy = "https://frenzy.com.gt/#/menu/home";
		 WebDriverWait wait = new WebDriverWait(driver,30);
			//Ir hacia Premios
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='textCenter col-xs-12 col-sm-12 col-md-10 col-lg-8']")));
			driver.navigate().to(Premios);
			//Probar el boton de '¿como canjeo mis premios?'
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")));
			driver.findElement(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='boxModalTutorialExchangeAwards']")));
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]")).click();
			System.out.println("El boton de: '¿Como canjeo mis premios'");
			//Boton Play Store
			driver.navigate().to(Frenzy);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//IMG[@class='PlayStore']")));
			driver.findElement(By.xpath("//IMG[@class='PlayStore']")).click();
			try {
	            Set<String> windows = driver.getWindowHandles();
	            Iterator<String> iter = windows.iterator();
	            String[] winNames=new String[windows.size()];
	            int w=0;
	            while (iter.hasNext()) {
	                winNames[w]=iter.next();
	                w++;
	            }
	            if(winNames.length > 1) {
	                for(w = winNames.length; w > 1; w--) {
	                    driver.switchTo().window(winNames[w - 1]);
	                    String actualUrl = driver.getCurrentUrl();
	                    String url = "https://play.google.com/store/apps/details?id=app.Frenzy";
	                    if(actualUrl.equals(url)) {
	                    	System.out.println("Se Accedio Correctamente a la Ruta de la Aplicación 'Android'");
	                    }else {
	                    	System.out.println("---------------Error URL de la Aplicación---------------");
	                    }
	                    driver.close();
	                }
	            }
	            driver.switchTo().window(winNames[0]);
	        }
	        catch(Exception e){         
	            e.printStackTrace();
	        }
	 }
	 @Test
	 public void BotonesApp() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,30);
			// Boton App Store
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//IMG[@class='AppStore']")));
			driver.findElement(By.xpath("//IMG[@class='AppStore']")).click();
			try {
	            Set<String> windows = driver.getWindowHandles();
	            Iterator<String> iter = windows.iterator();
	            String[] winNames=new String[windows.size()];
	            int w=0;
	            while (iter.hasNext()) {
	                winNames[w]=iter.next();
	                w++;
	            }
	            if(winNames.length > 1) {
	                for(w = winNames.length; w > 1; w--) {
	                    driver.switchTo().window(winNames[w - 1]);
	                    String actualUrl = driver.getCurrentUrl();
	                    String url = "https://itunes.apple.com/us/app/frenzy/id1035756457?l=es&ls=1&mt=8";
	                    if(actualUrl.equals(url)) {
	                    	System.out.println("Se Accedio Correctamente a la Ruta de la Aplicación 'IOs'");
	                    }else {
	                    	System.out.println("---------------Error URL de la Aplicación---------------");
	                    }
	                    driver.close();
	                }
	            }
	            driver.switchTo().window(winNames[0]);
	        }
	        catch(Exception e){         
	            e.printStackTrace();
	        }
	 }
	 
	 
	  
  
}