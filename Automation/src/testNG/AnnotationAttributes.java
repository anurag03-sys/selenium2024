package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class AnnotationAttributes 
{
	@Test(priority = 2)
	public void login() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login is successfully done.", true);
	}

	@Test(priority = 1)
	public void register() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Registeration is successfully done.", true);
	}
	
	@Test(priority = 3, invocationCount = 3, threadPoolSize = 3)
	public void wishlist()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/wishlist");
		Reporter.log("wishlist page has opened 3 times successfully.", true);
		
	}
	
	@Test(priority = 4, enabled = false)
	public void addtocart()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/cart");
		Reporter.log("Shopping cart", true);
	}
}
