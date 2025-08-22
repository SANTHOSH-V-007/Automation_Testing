package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_forDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Demo= new ChromeDriver();
		
		Demo.get("https://demo.guru99.com/test/drag_drop.html");
		Demo.manage().window().maximize();
		
		Actions action = new Actions(Demo);
		
		WebElement bankdrag = Demo.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankdrop = Demo.findElement(By.id("bank"));
		action.dragAndDrop(bankdrag, bankdrop).build().perform();
		
		WebElement amountdrag = Demo.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement amountdrop = Demo.findElement(By.id("amt8"));
		action.dragAndDrop(amountdrag, amountdrop).build().perform();

	}

}
