package ImagePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images2 {

	public static void main(String[] args) throws InterruptedException {

		//1	open browser navigatre tomercury travels
				//Click on specific image 
				//In next page count no.of imgaes and src if images
		
		
		//2 open browser navigatre tomercury travels
				//Capture text
				//Click on specific image 
				//Compare capture text and present title 
				//pass-->that page images & get src
				//fail--->stop program
			
					
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mercurytravels.co.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement firstlink=driver.findElement(By.xpath("//div[contains(text(),'Gorgeous Kerala')]"));
		String firstlinkstr=firstlink.getText();
		
		System.out.println(firstlinkstr);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", firstlink);

		
		List<WebElement> values=driver.findElements(By.tagName("img"));
		System.out.println(values.size());	
		
		for(int i=0;i<values.size();i++) {
			System.out.println("Images SRC :"+values.get(i).getAttribute("src"));
		}
		String Pagetitle=driver.getTitle();
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("First Linked Text:"+firstlinkstr);
		System.out.println("NextPage Title :"+Pagetitle);
		
		if(Pagetitle.contains(firstlinkstr)){
	        System.out.println("Testcase Passed");
	    }
	        else {
	            System.out.println("Testcase Fail");
	        }
		driver.close();
	}


}
