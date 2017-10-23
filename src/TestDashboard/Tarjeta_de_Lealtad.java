package Test_Frenzy_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tarjeta_de_Lealtad extends Nuevo_Cupon {
  @Test(testName="Test Tarjeta de Lealtad",description="Test Crear nueva tarjeta de lealtad",priority=17)
  public void TarjetaLealtad_Test() {
	  try {
		  
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn)));
			  driver.findElement(By.xpath(btn)).click();
			  
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(btnlealtad)).click();
			  if(!driver.findElements(By.xpath("(//DIV[@role='dialog'])[4]")).isEmpty()){
				  driver.findElement(By.xpath(ButtonSalir)).click();
			  }else {
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
				  String volumen = "//SELECT[@class='form-control CategoryApp styleSelectOrInput widthSelectOrInput floatRightHigher767px ng-pristine ng-untouched ng-valid ng-not-empty']";
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
				
			}
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method failed in Tarjeta de Lealtad " + e.getMessage());
	  }
  }
}
