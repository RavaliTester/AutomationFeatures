package HandleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();
		System.out.println("Normal Alert Working Properly");
		driver.close();
		
	}

}
