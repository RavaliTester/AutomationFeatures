package ScreenShotPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        
	        
	       File source= driver.getScreenshotAs(OutputType.FILE);
	       File destination= new File("C:\\eclipse workspacenew\\ITVidHya Practice\\Screenshots/img1.png");
	     
	       FileUtils.copyDirectory(source, destination); 
	       System.out.println("Screenshort saved successfully");

	}

}
