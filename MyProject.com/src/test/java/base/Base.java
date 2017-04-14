package base;

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
		//driver= new RemoteWebDriver(DesiredCapabilities.firefox());
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
	}
	@AfterClass
	public void PostCondition()
	{
		driver.quit();
	}
}
