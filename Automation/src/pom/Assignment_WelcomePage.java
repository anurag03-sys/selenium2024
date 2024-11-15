package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment_WelcomePage 
{
@FindBy(linkText = "Log in")
private WebElement LoginButton1;
	
@FindBy(id = "Email")
private WebElement emailBox;

@FindBy(id = "Password")
private WebElement passwordBox;

@FindBy(id = "RememberMe")
private WebElement RememberMeButton;

@FindBy(linkText = "Log out")
private WebElement LogoutButton;

@FindBy(xpath = "//input[@value='Log in']")
private WebElement LoginButton;

public Assignment_WelcomePage(WebDriver driver) 
{
PageFactory.initElements(driver, this);
}

public WebElement getLoginButton1() {
	return LoginButton1;
}

public WebElement getEmailBox() {
	return emailBox;
}

public WebElement getPasswordBox() {
	return passwordBox;
}

public WebElement getRememberMeButton() {
	return RememberMeButton;
}

public WebElement getLogoutButton() {
	return LogoutButton;
}

public WebElement getLoginButton() {
	return LoginButton;
}

}
