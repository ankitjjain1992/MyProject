package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	WebDriver driver;
	@BeforeClass
	public void Precondition()
	{
		System.setProperty("", "C:/Users/ankit.a.jai/Downloads/geckodriver-v0.15.0-win64/geckodriver.exe");
		driver= new RemoteWebDriver(DesiredCapabilities.firefox());
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
	}
	@AfterClass
	public void PostCondition()
	{
		driver.quit();
	}
}
