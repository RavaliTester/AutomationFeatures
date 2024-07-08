package HandleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBox")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println("Confirmation Alert Working Properly");
		driver.close();
	}

}
