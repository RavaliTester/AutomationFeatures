package LinksPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mercurytravels.co.in");
		String url1=driver.getCurrentUrl();
		System.out.println("Home Page Url: "+url1);
		
	/*//Count No.of Links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links: "+links.size());
		
		//Get Names of links
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}*/
		
		
		driver.findElement(By.linkText("Indian Holidays")).click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println("Next Page Url:" +url);
		driver.navigate().back();
		driver.close();
		
	}

}
