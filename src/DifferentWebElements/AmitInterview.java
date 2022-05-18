package DifferentWebElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmitInterview {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://example.com/cert.html");
		driver.findElement(By.id("settings-link")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it1 = window.iterator();
		String ParentWindow = it1.next();
		String ChildWindow = it1.next();
		driver.switchTo().window(ChildWindow);
		driver.findElement(By.id("allow")).click();
		String tt = driver.findElement(By.id("allow")).getAttribute("value");
		double d = Double.parseDouble(tt);

		if (d < 550) {
			driver.switchTo().window(ParentWindow);
			driver.findElement(By.id("certpdf")).click();
		} else {
			driver.switchTo().window(ParentWindow);
			driver.findElement(By.id("certpdf")).click();

		}

	}

}
