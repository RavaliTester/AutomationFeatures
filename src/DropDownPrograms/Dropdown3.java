package DropDownPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("def");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password_step_input")).sendKeys("selenium123");
		
		
		
		//dropdownfordays
	//	WebElement Day1=driver.findElement(By.id("day");
		//select 
		


		

		
	}

}
