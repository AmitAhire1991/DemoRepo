package DifferentWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Amit");
		driver.findElement(By.name("email")).sendKeys("amitahire1@gmil.com");	
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("A@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select options = new Select(staticdropdown);
		options.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		//System.out.println(options.getFirstSelec.tedOption().getText());
		driver.findElement(By.name("bday")).sendKeys("12/12/2022");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
	}
	
}


