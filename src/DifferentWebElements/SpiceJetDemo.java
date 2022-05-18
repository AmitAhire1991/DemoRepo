package DifferentWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("to-testID-origin")).click();
		
	}

}
