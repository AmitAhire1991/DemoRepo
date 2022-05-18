package DifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> abc =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<abc.size();i++)
		{
			String name = abc.get(i).getText();
			
			if(name.contains("Cauliflower"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
		
		
	}

}
