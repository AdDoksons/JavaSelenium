package ImportedCodes;

import org.openqa.selenium.By;

/*Practice Exercise 3: Prompt Alert
1. Launch the browser
2. Open the Url : http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/
3. Click on Prompt Alert button
4. Switch to Prompt alert window
5. Capture the text of Alert
6. Add the text in the Prompt alert text box
7. Accept the alert.*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrompAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver();					

		String baseUrl = "http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/";					
		driver.get(baseUrl);	
		
		driver.findElement(By.cssSelector("#content > p:nth-child(18) > button"));
		
		String prompText=driver.switchTo().alert().getText();
		System.out.println(prompText);
		
		driver.switchTo().alert().sendKeys(prompText);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();

	}

}
