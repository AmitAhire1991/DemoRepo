package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BasicWebElement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a[class=\"theme-btn register-btn\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input#email")).sendKeys("amitahire1991@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Amit@123");
		driver.findElement(By.name("commit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.tagName("ul")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("ul")).getText(), "contact@rahulshettya.com");
		
		
		
		
	
		
	}

}
