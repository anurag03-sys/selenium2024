package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
@Test
public void register()
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	Assert.fail();
	
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("Successfully registered", true);
	
}

@Test(dependsOnMethods = "register")
public void login()
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("Successfully logged in", true);
	
}
@Test(dependsOnMethods = {"register","login"})
public void addToCart()
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("product is added to cart successfully.", true);
}
}
