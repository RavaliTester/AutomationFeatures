package LinksPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOfofLinksDashboardPageinKareclouds {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://hms.kareclouds.com/site/login");
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("No.of Links in a page: "+link.size());
		for (int i =0; i<=link.size();i++) {
			link.get(i).click();
			System.out.println(driver.getCurrentUrl());
		}
		System.out.println("Total Links: "+link.size());
		driver.close();

	}
}