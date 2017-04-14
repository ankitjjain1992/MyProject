package MyProject.MyProject.com;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	@FindBy(xpath=".//*[@id='gs_htif0']")
	private WebElement textbox;
	
	public homePage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Entertext(String value) throws InterruptedException
	{
		textbox.sendKeys(value);
		Thread.sleep(2000);
		textbox.sendKeys(Keys.ENTER);
	}
}
