package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dataDrivenTestingDemo 
{
public static void main(String[] args) throws IOException , InterruptedException
{
	FileInputStream fis = new FileInputStream("./testData/commondata.properties");
	Properties property = new Properties();
	
	property.load(fis);
	String url = property.getProperty("url");
	String email = property.getProperty("email");
	String password = property.getProperty("password");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	driver.get(url);
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
}
}
