package DropDownPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown1 {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mercurytravels.co.in");
		
		//No of Dropdowns
		/*List<WebElement> values=driver.findElements(By.tagName("select"));
		System.out.println("No of Dropdowns : "+values.size());
		
		
		//for(int i=0;i<=values.size();i++) {
		//	System.out.println(values.get(i).getAttribute("name"));
		}*/
		
		
		WebElement Holiday=driver.findElement(By.id("themes"));
		Holiday.sendKeys("Family");
		
		Select value =new Select(Holiday);
		value.selectByIndex(4);
		value.selectByVisibleText("Shopping");
		driver.close();
	}
	

}
