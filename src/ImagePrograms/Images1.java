package ImagePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images1 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com");
		
		//Get No.of Links
		List<WebElement> nimages=driver.findElements(By.tagName("img"));
		System.out.println(nimages.size());
		
		//Get src of links
		for(int i=0;i<nimages.size();i++) {
			System.out.println(nimages.get(i).getAttribute("src"));
		}

	}

}
