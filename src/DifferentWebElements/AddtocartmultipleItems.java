package DifferentWebElements;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtocartmultipleItems {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, SECONDS);
		
		//WebDriverWait w = new WebDriverWait(driver, 5);
		//w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(""));
		
		
		int j = 0;
		String[] vegie = { "Brocolli", "Cucumber", "Tomato" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		
		// we need to get all product into one arraylist
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < items.size(); i++) // here we are looping for number of items
		{
			// vegie name is in this format Cauliflower - 1 Kg. so we have to split
			// Cauliflower
			String[] name = items.get(i).getText().split("-");
			// after spilting Cauliflower goes to left index[0] and 1 kg. goes to right
			// index[1]
			// here we also need to space that came after r leter. so we use trim function
			// to remove left/right blank space
			String finalname = name[0].trim();

			List finalvegie = Arrays.asList(vegie); // to covert array to arraylist (we are storing more than one value
													// in vegie line 20

			if (finalvegie.contains(finalname)) /// we are comparing actual vegie that we want with the items that we
												/// have received
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == 4) {
					break;
				}
			}

		}

	}

}
