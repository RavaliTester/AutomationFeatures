package WordCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordCount {

	public static void main(String[] args) {

		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the webpage
		        driver.get("https://bbc.com");

		        // Get the text content of the webpage
		        WebElement bodyElement = driver.findElement(By.tagName("body"));
		        String text = bodyElement.getText();

		        // Specify the word you want to count
		        String targetWord = "Watch";

		        // Count occurrences of the specific word
		        int count = countWordOccurrences(text, targetWord);

		        // Print the count
		        System.out.println("Occurrences of \"" + targetWord + "\": " + count);

		        // Close the browser
		        driver.quit();
		    }

		    // Function to count occurrences of a word in a text
		    private static int countWordOccurrences(String text, String targetWord) {
		        String[] words = text.split("\\s+"); // Split by whitespace

		        int count = 0;
		        for (String word : words) {
		            if (word.equalsIgnoreCase(targetWord)) {
		                count++;
		            }
		        }

		        return count;
		   	}

}
