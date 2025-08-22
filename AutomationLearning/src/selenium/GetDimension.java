package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Dim= new ChromeDriver();
		Dim.get("https://accounts.saucelabs.com/am/XUI/#login/");
		Dimension Dim1 = new Dimension(500, 600);
		Dim.manage().window().setSize(Dim1);
	}

}
