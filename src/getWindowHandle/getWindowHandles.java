package getWindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement textbox=driver.findElement(By.id("name"));
		textbox.sendKeys("Automation");
			
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parent);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> id=driver.getWindowHandles();
		
		Iterator<String> values= id.iterator();
		
		String Parent=values.next();
		String Child=values.next();
		
		System.out.println(Parent);
		System.out.println(Child);
		
		driver.switchTo().window(Child);
		driver.findElement(By.id("firstName")).sendKeys("ChildWindow");
		driver.switchTo().window(Parent);
		textbox.clear();
		textbox.sendKeys("Manual");
		driver.quit();
		

	}

}
