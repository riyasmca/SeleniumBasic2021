package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work-Selenium\\Tools\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//*[@id=\'divpaxinfo\']")).click();
		
		Thread.sleep(2000L);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'divpaxinfo\']")).getText());
		
		for(int i=1 ; i<5 ; i++) {
			driver.findElement(By.xpath("//*[@id=\'hrefIncAdt\']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//*[@id=\'divpaxinfo\']")).getText());
		
		driver.findElement(By.xpath("//*[@id=\'btnclosepaxoption\']")).click();
		
		driver.close();
	}

}
