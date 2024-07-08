package LinksPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatrBack {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		
		driver.findElement(By.linkText("Luxury Rails")).click();
		Thread.sleep(2000);
		System.out.println("Current URL :"+driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Current URL :"+driver.getCurrentUrl());
		driver.close();
	}

}
