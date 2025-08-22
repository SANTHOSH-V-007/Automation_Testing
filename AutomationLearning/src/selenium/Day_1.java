package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd= new ChromeDriver();//to open the any browser
		//WebDriver wd1= new FirefoxDriver();
		String s = "https://www.changepond.com/";
		wd.get(s);// open we page
		
		//maximize and minimize web page:
//		wd.manage().window().minimize();
//		wd.manage().window().maximize();
		
		//to sleep the website for second
			//Thread.sleep(10000);
		
		//to close the webpage
			//wd.close();
		
		System.out.println(wd.getTitle());//to get a title of the webpage
		System.out.println(wd.getCurrentUrl());//to get webpage url
		System.out.println(wd.getPageSource()); //To get a webpage source code
		
		
		
	}

}
