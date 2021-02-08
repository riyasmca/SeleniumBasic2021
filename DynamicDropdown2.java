package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class DynamicDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work-Selenium\\Tools\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		/*
		 *  Dynamic Dropdown directly will not able select, After Click the parent element then only, 
		 *  Required dropdown element will trigger 
		 * 
		 */
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='TRV'])[2]")).click();
		
		
		driver.close();
		
		

	}

}
