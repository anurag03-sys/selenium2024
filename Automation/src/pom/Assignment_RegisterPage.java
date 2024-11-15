package pom;

import org.checkerframework.checker.initialization.qual.FBCBottom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment_RegisterPage 
{

@FindBy(linkText = "Register")
private WebElement registerLink;

@FindBy(id = "gender-male")
private WebElement genderTF;

@FindBy(id = "FirstName")
private WebElement FirstNameTF;

@FindBy(id = "LastName")
private WebElement LastNameTF;

@FindBy(id = "Email")
private WebElement EmailTF;

@FindBy(id = "Password")
private WebElement PasswordTF;

@FindBy(id = "ConfirmPassword")
private WebElement ConfirmPasswordTF;

@FindBy(id = "register-button")
private WebElement registerbuttonTF;

public Assignment_RegisterPage(WebDriver driver) 
{
PageFactory.initElements(driver, this);
}

public WebElement getRegisterLink() {
	return registerLink;
}

public WebElement getGenderTF() {
	return genderTF;
}

public WebElement getFirstNameTF() {
	return FirstNameTF;
}

public WebElement getLastNameTF() {
	return LastNameTF;
}

public WebElement getEmailTF() {
	return EmailTF;
}

public WebElement getPasswordTF() {
	return PasswordTF;
}

public WebElement getConfirmPasswordTF() {
	return ConfirmPasswordTF;
}

public WebElement getRegisterbuttonTF() {
	return registerbuttonTF;
}

}

