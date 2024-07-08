package LinksPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinksfromHeader {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement header=driver.findElement(By.id("h1"));
		System.out.println(header.getText());
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("No.Of Links from Header: "+Links.size());
		for(int i=0;i<=Links.size();i++) {
			System.out.println(Links.get(i).getText());
		}
		driver.close();
		
	}

}
