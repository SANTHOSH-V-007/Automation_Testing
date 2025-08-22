package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		String s = "https://mail.google.com/mail/u/0/#inbox";
		wd.get(s);
		wd.manage().window().minimize();
		System.out.println(wd.getTitle());
		if(s.equals("Welcome")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		System.out.println(wd.getCurrentUrl());
		Thread.sleep(20000);
		wd.close();
		

	}

}
