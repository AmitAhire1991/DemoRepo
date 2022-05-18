package DifferentWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Armed Forces']")).isSelected());
		
		
		driver.findElement(By.xpath("//div[text()='Armed Forces']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Armed Forces']")).isSelected());
		
		
	
		
		
		
	}

}
