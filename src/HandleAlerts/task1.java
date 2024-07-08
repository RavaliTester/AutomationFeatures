package HandleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("alert1")).click();
		driver.switchTo().alert().accept();
		
		System.out.println("Normal Alert Button Clicked");
		
		driver.findElement(By.id("prompt")).click();
		Alert al=driver.switchTo().alert();
		
		al.sendKeys("hiiiii");
		al.accept();
		System.out.println("Promt Alert Button Clicked");
		//al.dismiss();
		
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();
		System.out.println("Confirm Alert Button Clicked");
		
		
	}

}
