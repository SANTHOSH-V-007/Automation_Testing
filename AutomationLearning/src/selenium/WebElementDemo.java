package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demoqa.com/automation-practice-form");
		wd.manage().window().maximize();
		WebElement we = wd.findElement(By.id("firstName"));
		we.click();
		we.sendKeys("Fahim");
		//we.clear();
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		
		WebElement gender = wd.findElement(By.xpath("//input[@value=\"Male\"]"));
		System.out.println(gender.isEnabled());
		System.out.println(gender.isSelected());
		
		WebElement sumbit = wd.findElement(By.xpath("//button[@id=\"submit\"]"));
		System.out.println(sumbit.isEnabled());
		System.out.println(sumbit.isSelected());
		System.out.println(sumbit.getTagName());
		System.out.println(sumbit.getSize());
		System.out.println(sumbit.getLocation());
		
		
		WebElement city = wd.findElement(By.id("city"));
		System.out.println(city.getText());
		


	}

}
