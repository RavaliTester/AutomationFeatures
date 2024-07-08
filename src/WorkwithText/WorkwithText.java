package WorkwithText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithText {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://bbc.com");
		
		List<WebElement> ele=driver.findElements(By.tagName("body"));
		String actual=ele.get(0).getText();
		System.out.println(actual);
		int	Count=0;
				
		for(int	i=0;i<ele.size();i++) {
			//String actual=ele.get(i).getText();
			String expect="Watch";		
			
			if(expect.contains(actual)) {
				
			Count++;
			System.out.println("No.of words "+Count);
		}else {
			System.out.println("No word is there");
		}
			}
		}	
	}
