package WindowActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTraverse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bango.com/");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();

	}

}
