package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		Thread.sleep(10000);
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//How to fetch an error message
		WebElement sumbit = wd.findElement(By.xpath("//button[@type='submit']"));
		sumbit.click();
		WebElement error = wd.findElement(By.xpath("//Span[text()='Required]"));
		System.out.println(error.getText());
		
		

	}

}
