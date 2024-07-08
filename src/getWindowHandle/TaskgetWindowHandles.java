package getWindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskgetWindowHandles {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement textbox=driver.findElement(By.id("name"));
		textbox.sendKeys("Automation");
			
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		  executor.executeScript("arguments[0].click();", driver.findElement(By.id("newTabBtn")));
			  
			      
		Set<String> id=driver.getWindowHandles();
		
		Iterator<String> values= id.iterator();
		
		String Parent=values.next();
		String Child=values.next();
		
		System.out.println("ParentWindow Id: "+Parent);
		System.out.println("ChildWindow Id: "+Child);
		
		driver.switchTo().window(Child);
		driver.findElement(By.id("alertBox")).click();
		driver.quit();
		


	}

}
