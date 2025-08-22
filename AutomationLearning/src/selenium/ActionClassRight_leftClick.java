package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassRight_leftClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Demo= new ChromeDriver();
		
		Demo.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		Demo.manage().window().maximize();
		
		WebElement user = Demo.findElement(By.id("email"));
		Actions act = new Actions(Demo);
		act.moveToElement(user).click().build().perform();
		act.contextClick(user).build().perform();
		user.sendKeys("Santhosh");
//		Demo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		act.doubleClick(user).build().perform();
		
		
		WebDriverWait w = new WebDriverWait(Demo, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(user));
		user.sendKeys("Santhosh");
		

	}

}
