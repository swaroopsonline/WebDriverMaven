package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest1 {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "G:/Software/chromedriver.exe");
			
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void doLogin() {
		
		//System.setProperty("webdriver.chrome.driver", "G:/Software/chromedriver.exe");
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.id("password")).sendKeys("qerear");
		
	}

	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
	
}
