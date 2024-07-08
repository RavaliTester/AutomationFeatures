package LinksPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingUrlLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https:bing.com");
		
		//Visible & hidden Links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		/*int count=0;
		for(int i=0;i<=links.size();i++) {
			if(links.get(i).isDisplayed()) {
				count++;
			}
		}
		
		System.out.println("Total Links : "+links.size());
		System.out.println("Visible Links : "+count);
		System.out.println("Hidden Links : "+(links.size()-count));*/
		
		for(int i=0;i<links.size();i++) {
			String lname=links.get(i).getText();
			links.get(i).click();
			
			String url=driver.getCurrentUrl();
			System.out.println(lname+""+url);
			
			driver.navigate().back();
			links=  driver.findElements(By.tagName("a"));
			
		}
	}
}
