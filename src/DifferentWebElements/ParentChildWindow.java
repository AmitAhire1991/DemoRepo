package DifferentWebElements;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window=driver.getWindowHandles();     //next tab   //parentTab,ChildTab
		Iterator<String> it1 =window.iterator();
		String ParentWindow = it1.next();
		String ChildWindow = it1.next();
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		driver.switchTo().window(ParentWindow);
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
