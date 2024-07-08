package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(2);
		
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.quit();
	

	}

}
