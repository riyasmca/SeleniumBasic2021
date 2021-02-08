package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxWithSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work-Selenium\\Tools\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.xpath("//input[contains(@name,'StudentDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@name,'StudentDiscount')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@name,'StudentDiscount')]")).isSelected());
		
		
		//Code for checking how many checkbox exist on page
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		
		driver.quit();
		
		
		
		
		

	}

}
