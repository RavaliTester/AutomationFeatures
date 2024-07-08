package LinksPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenlinksandall {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int count=0;
		
		for(int i=0;i<link.size();i++) {
			if(link.get(i).isDisplayed()){
				count++;
			}
		}
		
		System.out.println("Total Links: "+link.size());
		System.out.println("Visible Links: "+count);
		System.out.println("Total Links: "+(link.size()-count));
		driver.close();
	}
}
