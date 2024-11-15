package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
public WebDriver driver;

@BeforeClass
public void launchBrowser()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");

}
@BeforeMethod
public void login()
{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(" iamanuragdas2024@gmail.com");
	driver.findElement(By.id("Password")).sendKeys(" Iaminevitable");
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

@AfterMethod
public void logout()
{
	driver.findElement(By.linkText("Log out")).click();
}

@AfterClass
public void closeBrowser()
{
	driver.quit();
}
}
