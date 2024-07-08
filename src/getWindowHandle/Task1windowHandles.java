package getWindowHandle;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1windowHandles {

	public static void main(String[] args) {
	

			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/browser-windows");
			driver.findElement(By.id("windowButton")).click();
			Set<String> id=driver.getWindowHandles();
			
			Iterator<String> values= id.iterator();
			
			String Parent=values.next();
			String Child=values.next();
			
			System.out.println("ParentWindow Id: "+Parent);
			System.out.println("ChildWindow Id: "+Child);
			
			driver.switchTo().window(Child);
			WebElement s=driver.findElement(By.id("sampleHeading"));
			System.out.println("Child Page Text is: "+s.getText());
			driver.quit();
			
		
				

	}

}
