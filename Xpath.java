package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work-Selenium\\Tools\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		/*
		 * 
		 * XPath Syntex ---> //tagName [@attribute='value']  or //*[attribute='value#]
		 * 
		 */
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		/* getText method not working on 3.59 selenium version 
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText()); 
		
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText()); */
		
		driver.close();
		
		
		
		
	}

}
