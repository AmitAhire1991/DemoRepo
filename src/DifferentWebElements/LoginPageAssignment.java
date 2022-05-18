package DifferentWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
	    WebElement options =driver.findElement(By.cssSelector("select[class='form-control']"));
	    Select option = new Select(options);
	    option.selectByVisibleText("Consultant");
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.id("signInBtn")).click();
	   	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
	    
	    
	    List<WebElement> items =driver.findElements(By.cssSelector(".card-footer .btn-info"));
	    
	    for(int i=0;i<items.size();i++)
	    {
	    	items.get(i).click();
	    }
	
	    
	    }
	
	

}
