package ImportedCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Practice Exercise 1: Simple Alert
1. Launch the browser
2. Open the Url : http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/
3. Click on Simple Alert button
4. Switch to the alert window
5. Capture the Text of Alert 
6. Accept the alert*/


public class SimpleAlert {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver();					

		String baseUrl = "http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/";	
		driver.get(baseUrl);	


		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();

		String alertText=driver.switchTo().alert().getText();

		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
