package DifferentWebElements;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(@href,'/windows')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/windows/new')]")).click();
		Set<String> newwindow = driver.getWindowHandles();
		Iterator<String> abc = newwindow.iterator();
		String parentwindow = abc.next();
		String childwindow = abc.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.findElement(By.cssSelector("div[class=\"example\"]")).getText());
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		
	}

}
