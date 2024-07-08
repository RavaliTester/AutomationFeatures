package ImagePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskforImages {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(5000);	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		WebElement image=driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/01/goldbox/images/faceout/Electronics_white._CB468586680_.png']"));
		image.click();
		System.out.println("Electronics Link clicked");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//https://m.media-amazon.com/images/G/01/goldbox/images/faceout/Electronics_white._CB468586680_.png']")).click();
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51SfrdvcpQL._AC_UF226,226_FMjpg_.jpg'")).click();
		driver.quit();
		}

}