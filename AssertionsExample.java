package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsExample {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Work-Selenium\\Tools\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@name,'StudentDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@name,'StudentDiscount')]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@name,'StudentDiscount')]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[contains(@name,'StudentDiscount')]")).isSelected());
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000L);
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		driver.close();
		
	}
}
