package LinksPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNamesfromLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		
	List<WebElement> linknames=	driver.findElements(By.tagName("a"));
	System.out.println("No.Of.LinksNo.Of.Links:"+linknames.size());
	
	for(int i=0;i<=linknames.size();i++ ) {
		System.out.println(linknames.get(i).getText());
	}
	driver.close();
	
}

}
