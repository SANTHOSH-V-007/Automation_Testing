package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd= new ChromeDriver();
		Thread.sleep(10000);
		wd.get("https://www.google.com");
		wd.navigate().to("https://www.changepond.com/");
		Thread.sleep(10000);
		wd.navigate().back();
		Thread.sleep(10000);
		wd.navigate().forward();
		Thread.sleep(10000);
		wd.navigate().refresh();
		
		
		//How to capture current window size:
		System.out.println(wd.manage().window().getSize());
		Thread.sleep(10000);
		wd.manage().window().maximize();
		System.out.println(wd.manage().window().getSize());
		
	}

}
