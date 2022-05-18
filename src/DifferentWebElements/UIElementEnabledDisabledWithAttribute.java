package DifferentWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIElementEnabledDisabledWithAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style"));
		driver.findElement(By.xpath("//div[text()=\"round trip\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style"));
		
	}

}
