package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Demo= new ChromeDriver();
		
		Demo.get("https://demo.automationtesting.in/Register.html");
		Demo.manage().window().maximize();
		
		WebElement submit = Demo.findElement(By.id("Button1"));
		
		JavascriptExecutor JE = (JavascriptExecutor) Demo;
		JE.executeScript("arguments[0].scrollIntoView();",submit);
		//JE.executeScript("scroll(0,450)");
		Thread.sleep(3000);
		//JE.executeScript("scroll(0,-150)");

	}

}
