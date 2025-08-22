package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPUpHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//To find the AlertPopUp
		WebDriver Demo= new ChromeDriver();
		
		Demo.get("https://demo.automationtesting.in/Alerts.html");
		Demo.manage().window().maximize();
		
		Thread.sleep(10000);
		WebElement button = Demo.findElement(By.xpath("//button[@onclick='alertbox()']"));
		button.click();
		
		Alert alert = Demo.switchTo().alert();
		Thread.sleep(10000);
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(10000);
		WebElement alert2 = Demo.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alert2.click();
		Thread.sleep(10000);
		WebElement ok = Demo.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		ok.click();
		
		Alert alert1 = Demo.switchTo().alert();
		Thread.sleep(10000);
		System.out.println(alert1.getText());
		alert1.accept();
		//alert1.dismiss();

	}

}
