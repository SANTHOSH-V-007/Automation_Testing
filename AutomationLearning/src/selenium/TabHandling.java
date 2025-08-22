package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Demo= new ChromeDriver();
		String pw = Demo.getWindowHandle();
		Demo.get("https://www.changepond.com/");
		Demo.manage().window().maximize();
		String pw1 = Demo.getWindowHandle();
		Demo.switchTo().newWindow(WindowType.TAB);
		Demo.get("https://github.com/");
		Demo.switchTo().window(pw);
		
		

	}

}
