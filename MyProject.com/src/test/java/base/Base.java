package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	 public WebDriver driver;
	@BeforeClass
	public void Precondition()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/ankit.a.jai/Downloads/geckodriver-v0.15.0-win64/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
	}
	@AfterClass
	public void PostCondition()
	{
		driver.quit();
	}
}
