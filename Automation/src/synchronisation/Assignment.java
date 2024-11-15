package synchronisation;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment 
{
public static void main(String[] args) 
{
String time = LocalDateTime.now().toString().replace(":", "-");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//a[contains(text(),'14.1-inch Laptop')]/../..//input[@value='Add to cart']")).click();

 WebElement successMessage = driver.findElement(By.xpath("The product has been added to your "));
 String message = successMessage.getText();
 System.out.println("The success Message : "+ message);

 TakesScreenshot screenshot= (TakesScreenshot) driver;
 File temporaryDestinition = screenshot.getScreenshotAs(OutputType.FILE);
 File permanentDestinition = new File("/.screenshots/"+time+".png");
 
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 wait.until(ExpectedConditions.invisibilityOf(successMessage));
 driver.findElement(By.linkText("Log in")).click();
 driver.quit();
 
}
}
