package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To perform Drag and Drop
		WebDriver Demo= new ChromeDriver();
		
		Demo.get("https://demo.automationtesting.in/Static.html");
		Demo.manage().window().maximize();
		
		Actions action = new Actions(Demo);
		
		WebElement drag = Demo.findElement(By.id("angular"));
		WebElement drop = Demo.findElement(By.id("droparea"));
		action.dragAndDrop(drag, drop).build().perform();
		
		
		WebElement drag1 = Demo.findElement(By.id("mongo"));
		WebElement drop1 = Demo.findElement(By.id("droparea"));
		action.dragAndDrop(drag1, drop1).build().perform();
		
		WebElement drag2 = Demo.findElement(By.id("node"));
		WebElement drop2 = Demo.findElement(By.id("droparea"));
		action.dragAndDrop(drag2, drop2).build().perform();
		
		
	}

}
