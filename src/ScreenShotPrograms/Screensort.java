package ScreenShotPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensort {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		List<WebElement> nlinks=driver.findElements(By.tagName("a"));
		System.out.println("No of Links : "+nlinks.size());
	
		
		for(int i=0;i<=nlinks.size();i++) {
				nlinks.get(i).click();
				
			//	File firstlink = ((TakesScreenshot) driver).getScreensortAs(OutputType.FILE);
			//	String titlecap1 = driver.getTitle();
			//	FileUtils.copyDirectory(firstlink, new ("C:\\Users\\Hp\\OneDrive\\Desktop\\ManualTestcases\\"+titlecap1+".png"));
				driver.navigate().back();
				nlinks=driver.findElements(By.tagName("a"));
			
		}
		
		
		/*driver.findElement(By.linkText("Gmail")).click();
		String titlecap = driver.getTitle();
		
		File firstlink=((Takesscreensort)driver).getScreensortAs(OutputType.FILE);
		FileUtils.copyDirectory(firstlink, new ("C:\Users\Hp\OneDrive\Desktop\ManualTestcases\titlecap.png"));
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Images")).click();
		String titlecap1 = driver.getTitle();
		System.out.println("Title of Page: "+titlecap1);
		
		File firstlink=((Takesscreensort)driver).getScreensortAs(OutputType.FILE);
		FileUtils.copyDirectory(firstlink, new ("C:\Users\Hp\OneDrive\Desktop\ManualTestcases\titlecap1.png"));*/
		
		
		
		
	}

}
