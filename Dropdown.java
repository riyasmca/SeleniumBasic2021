package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Static dropdown --> If select tagname used in dropdown its comes under static dropdwon
		
		/*
		 *     Syntex  -- > Select objSelect = new Select();
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work-Selenium\\Tools\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement StaticDropdown = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		
		
	
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.close();
	}

}
