package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoRegisterationPage {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver Demo= new ChromeDriver();
			
			Demo.get("https://demo.automationtesting.in/Register.html");
			
			Thread.sleep(10000);
			
			Demo.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Santhosh");
			
			Demo.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Vadivel");
			
			Demo.findElement(By.tagName("textarea")).sendKeys("11/17/3A,Durga Nagar,Peraiyur");
			
			Demo.findElement(By.xpath("//input[@type='email']")).sendKeys("Santhoshmohan452@gmail.com");
			
			Demo.findElement(By.xpath("//input[@type='tel']")).sendKeys("9025239872");
			
			//Demo.findElement(By.xpath("//input[@value='FeMale']")).click();
			Demo.findElement(By.xpath("//input[@value='Male']")).click();	
			
			Demo.findElement(By.id("checkbox1")).click();
			Demo.findElement(By.id("checkbox2")).click();
			Demo.findElement(By.id("checkbox3")).click();
			
			Demo.findElement(By.xpath("//div[@id='msdd']")).click();
			Demo.findElement(By.xpath("//a[contains(text(),\"Hindi\")]")).click();
			
			
			Select s = new Select(Demo.findElement(By.id("Skills")));
			s.selectByVisibleText("Certifications");
			
			Select s1 = new Select(Demo.findElement(By.id("country")));
			s1.selectByVisibleText("Australia");
			
			Select s2 = new Select(Demo.findElement(By.id("yearbox")));
			s2.selectByValue("1927");
			
			Select s3 = new Select(Demo.findElement(By.xpath("//select[@placeholder='Month']")));
			s3.selectByVisibleText("March");
			
			Select s4 = new Select(Demo.findElement(By.xpath("//select[@placeholder='Day']")));
			s4.selectByValue("13");
			
			
			Demo.findElement(By.id("firstpassword")).sendKeys("Santhosh@123");
			Demo.findElement(By.id("secondpassword")).sendKeys("Santhosh@123");
			
			Demo.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\santhosh.v\\Desktop\\Training\\JAVASCRIPT\\vada.jpg");
			
			
			

}
}