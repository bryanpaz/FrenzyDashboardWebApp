package TestDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InitialConfigs {
	static WebDriver driver;
	@Test(testName="Open Browser", description="Abrir el navegador",priority=1)
	public void OpenBrowser() {
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//Abrir el navegador
		driver = new ChromeDriver();
		System.out.println("Se Abrio el navegador");
		driver.manage().window().maximize();
	}
}