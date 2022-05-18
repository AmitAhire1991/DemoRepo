package DifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> Dates   =driver.findElements(By.className("day"));
		int totaldates=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<totaldates;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("28"))
			{
				Thread.sleep(2000);
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
				
		}
	}

}
