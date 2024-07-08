package DropDownPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mercurytravels.co.in");
		
		WebElement Holidays=driver.findElement(By.id("themes"));
		//System.out.println("Holiday List : "+Holidays.getText());
		List<WebElement> values=Holidays.findElements(By.tagName("options"));
		System.out.println("Options List : "+values.get(0));
		System.out.println("Dropdown List :"+values.size());
		
					Thread.sleep(2000);
			for(int i=0;i<=values.size();i++) {
			String vname=values.get(i).getText();
			values.get(i).click();
					
				if(values.get(i).isDisplayed()) {
				System.out.println(vname+" Active");
				}else {
					System.out.println(vname+" InActive");
				}
				driver.close();
		}
		
	}

}
