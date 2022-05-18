import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AmitAhire/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver","C:/Users/AmitAhire/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.close();
		

	}

}
