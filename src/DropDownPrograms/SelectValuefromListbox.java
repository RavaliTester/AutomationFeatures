package DropDownPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValuefromListbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement dropdown =driver.findElement(By.id("themes"));
		//dropdown.sendKeys("Rail");
		
		Select sc=new Select(dropdown);
		sc.selectByIndex(3);
		
		sc.selectByVisibleText("Spa");

		
	}

}
