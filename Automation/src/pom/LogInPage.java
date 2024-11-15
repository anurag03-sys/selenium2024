package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
//Declaration
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	//Initialization
	public LogInPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	//Getters
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
