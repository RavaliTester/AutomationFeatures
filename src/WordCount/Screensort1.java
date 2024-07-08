package WordCount;

//import java.io.File;
import java.io.IOException;
import java.util.List;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensort1 {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");


		List<WebElement> nlinks=driver.findElements(By.tagName("a"));
		System.out.println("Noof Links : "+nlinks.size());

	/*	for(int i=0;i<nlinks.size();i++) {
		        nlinks.get(i).click();
		       String titletext=nlinks.get(i).getText();
		        File source= driver.getScreenshotAs(OutputType.FILE);
			   File s= new File("C:\\eclipse workspacenew\\ITVidHya Practice\\Screenshots\\"+i+"+.png");
		        driver.navigate().back();*/


		/* driver.findElement(By.linkText("Gmail")).click();
		        File source= driver.getScreenshotAs(OutputType.FILE);
			    File destination= new File("C:\\eclipse workspacenew\\ITVidHya Practice\\Screenshots\\image123.png");
		        FileUtils.copyFileToDirectory(source, destination);*/


		System.out.println("Screenshort saved successfully");

	}
	}