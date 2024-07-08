package LinksPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinks {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("No.of Links in a page: "+link.size());
		driver.close();
		
		}

}
