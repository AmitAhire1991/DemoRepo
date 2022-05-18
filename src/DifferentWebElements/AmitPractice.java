package DifferentWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmitPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String ops=driver.findElement(By.id("checkBoxOption2")).getText();
		System.out.println(ops);
				
	//	WebElement staticdropdown=driver.findElement(By.id("dropdown-class-example"));
	//	Select dropdown = new Select(staticdropdown);
		Thread.sleep(2000);
	//	dropdown.selectByVisibleText(ops);
		driver.findElement(By.name("enter-name")).sendKeys(ops);
		
		
		
	}

}
