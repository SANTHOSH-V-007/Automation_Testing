package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSignInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver= new ChromeDriver();
		
		Driver.get("https://accounts.saucelabs.com/am/XUI/#login/");
		
		Thread.sleep(10000);
		Driver.findElement(By.id("idToken1")).sendKeys("Santhosh");
		
		Driver.findElement(By.id("idToken2")).sendKeys("Santhosh@123");
		
		Driver.findElement(By.className("checkmark")).click();
		
		Driver.findElement(By.linkText("I forgot my password")).click();
		//Driver.findElement(By.partialLinkText("I forgot my ")).click();
		
		Thread.sleep(10000);
		Driver.navigate().back();
	}

}
