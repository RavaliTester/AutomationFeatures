package getWindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWIndowHandle {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement textbox=driver.findElement(By.id("name"));
		textbox.sendKeys("Automation");
			
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parent);
		
			}

}
