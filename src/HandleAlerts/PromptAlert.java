package HandleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		  executor.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.id("promptBox")).click();
		
			
		Alert al=driver.switchTo().alert();
		
		al.sendKeys("Hiiiiiiiii");
		//al.accept();
		al.dismiss();
		
	}

}
