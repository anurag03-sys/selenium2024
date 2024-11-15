package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	
String time = LocalDateTime.now().toString().replace(":", "-");
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://demo.vtiger.com/vtigercrm/");

TakesScreenshot screenshot = (TakesScreenshot) driver;
File temporaryLOC = screenshot.getScreenshotAs(OutputType.FILE);

File permanentLOC = new File("./screenshots/"+time+".png");
FileHandler.copy(temporaryLOC, permanentLOC);	



driver.findElement(By.partialLinkText("Vtiger")).click();
String win = driver.getWindowHandle();


WebElement companyLink = driver.findElement(By.partialLinkText("Company"));

Actions action = new Actions(driver);
action.moveToElement(companyLink).perform();

Thread.sleep(2000);

driver.findElement(By.partialLinkText("Contact Us")).click();
WebElement contactBLR = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../..//p[contains(text(),'+91 9243602352')]"));

System.out.println(contactBLR);
}
}
