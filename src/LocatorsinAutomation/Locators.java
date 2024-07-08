package LocatorsinAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		//Lunch ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
		//Navigate URL
		driver.get("https://github.com/login");
		
		//Find Webelements using Locators
		driver.findElement(By.id("login_field")).sendKeys("Ravali");
		driver.findElement(By.name("password")).sendKeys("Ravali123");
 		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Create an")).click();
		driver.close();
		

		/*highlight(driver, (driver.findElement(By.id("login_field"))));
		highlight(driver, driver.findElement(By.name("password")));
		highlight(driver, driver.findElement(By.className("header-logo")));
		highlight(driver, driver.findElement(By.partialLinkText("Forgot password")));
		highlight(driver, driver.findElement(By.partialLinkText("Create an ")));
		highlight(driver, driver.findElement(By.tagName("h1")));
		highlight(driver, driver.findElement(By.cssSelector("//input[@type='submit']")));
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		}
		
		public static void highlight(WebDriver driver, WebElement element) {
			
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("argument[0].setAttribute('style','border:2x solid red;background:'yellow')");
		}*/
		
		
		
	}

}
