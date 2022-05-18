package DifferentWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//to get link on total page
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	//to get link on footer
	   WebElement childdriver= driver.findElement(By.id("gf-BIG"));  //limiting webdriver scope to footer
	   System.out.println(childdriver.findElements(By.tagName("a")).size());
	   
	}

}
