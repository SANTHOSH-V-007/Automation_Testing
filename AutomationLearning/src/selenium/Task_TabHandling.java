package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_TabHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Demo= new ChromeDriver();
		Demo.manage().window().maximize();
		
		String pw = Demo.getWindowHandle();
		Demo.get("https://www.changepond.com/");
		Demo.switchTo().newWindow(WindowType.TAB);
		
		String pw1 = Demo.getWindowHandle();
		Demo.get("https://github.com/");
		Demo.switchTo().newWindow(WindowType.TAB);
		
		String pw2 = Demo.getWindowHandle();
		Demo.get("https://leetcode.com/");
		Demo.switchTo().window(pw);
		Thread.sleep(10000);
		
		Demo.switchTo().window(pw1);
		Thread.sleep(10000);
		
		Demo.switchTo().window(pw2);
		Thread.sleep(10000);
		
		Demo.switchTo().window(pw1);
		Thread.sleep(10000);
		
		Demo.switchTo().window(pw);
		Thread.sleep(10000);
		
		Demo.switchTo().window(pw2).close();
		Thread.sleep(10000);
		
		Demo.quit();

	}

}
