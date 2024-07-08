package MethodsinAutomtion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsinAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		//manage
		driver.manage().window().maximize();
		
		//geturl
		String str=	driver.getTitle();
		System.out.println("First URL :  "+str);
		
		//navigateTo
		driver.navigate().to("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//getcurrentUrl
		String url=driver.getCurrentUrl();
		System.out.println("Second URL :  "+url);
		
		//getpagesource
		/*String source= driver.getPageSource();
		System.out.print(source);*/
		
		//findelement
		driver.findElement(By.id("holiday_category_id")).sendKeys("Chennai");
		driver.close();

		driver.get("google.com");
		
		//getwindowhandle
		String s =driver.getWindowHandle();		
		System.out.print(s);
		
		//switchTo
		//driver.switchTo().window();
		//driver.switchTo().alert();
		
		//close quit
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
