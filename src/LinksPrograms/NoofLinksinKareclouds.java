package LinksPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinksinKareclouds {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://hms.kareclouds.com/site/login");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("No.of Links in a page: "+link.size());
		for(int i=0;i<=link.size();i++) {
			link.get(i).click();
			String geturl=driver.getCurrentUrl();
			System.out.print("Clicked Link URL is: "+geturl);
			Thread.sleep(2000);
			driver.close();


		}

	}

}
