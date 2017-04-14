package MyProject.MyProject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	@FindBy(xpath="//input[@name='userName']")
	private WebElement UserNametext;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Passwordtext;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement SignInButton;
	
	public loginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String UserName, String Password)
	{
		UserNametext.sendKeys(UserName);
		Passwordtext.sendKeys(Password);
		SignInButton.click();
	}
	
}
