package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScriptWelcomePage 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://demowebshop.tricentis.com/");

WelcomePage welcomePage= new WelcomePage(driver);

//welcomePage.getRegisterLink().click();
welcomePage.getLoginLink().click();

LogInPage loginpage= new LogInPage(driver);
loginpage.getEmailTextField().sendKeys("anurag@gmail.com");
loginpage.getPasswordTextfield().sendKeys("iaminevitable");
loginpage.getLoginButton().click();
}
}
 