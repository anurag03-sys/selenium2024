package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageIG 
{
@FindBy(xpath = "//span[contains(text(),'Mobile Number or Email')]")
private WebElement emailTF;

@FindBy(xpath = "//input[@aria-label='Password']")
private WebElement passwordTF;

@FindBy(xpath = "//input[@aria-label='Full Name']")
private WebElement FullNameTF;

@FindBy(xpath = "//input[@aria-label='Username']")
private WebElement UserNameTF;

@FindBy(xpath = "//button[contains(text(),'Sign up')]")
private WebElement SignUpTF;

public RegisterPageIG(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public WebElement getEmailTF() {
	return emailTF;
}

public WebElement getPasswordTF() {
	return passwordTF;
}

public WebElement getFullNameTF() {
	return FullNameTF;
}

public WebElement getUserNameTF() {
	return UserNameTF;
}

public WebElement getSignUpTF() {
	return SignUpTF;
}

}
