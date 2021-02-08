package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CSSLocator {

	
	/*
	 *  XPath Syntex ---> //tagName [@attribute='value']  or //*[attribute='value#]
	 * 
	 *  CSS Syntex ---> tagName [attribute='value'] or [attribute='value]
	 *  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work-Selenium\\Tools\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#password")).sendKeys("Password");
		driver.findElement(By.cssSelector("#Login")).click();
		
		driver.close();
	
		
		
		
		
	}

}
