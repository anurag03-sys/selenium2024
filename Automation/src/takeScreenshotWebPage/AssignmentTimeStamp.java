package takeScreenshotWebPage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentTimeStamp 
{
public static void main(String[] args) throws IOException  
{
String time = LocalDateTime.now().toString().replace(":", "-");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.flipkart.com/");
WebElement enter = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]"));
enter.sendKeys("Mobiles");
enter.sendKeys(Keys.ENTER);

TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
File temporaryDestinition = takesscreenshot.getScreenshotAs(OutputType.FILE);

File permanentDestinition = new File("./screenshots/"+time+".png");
FileHandler.copy(temporaryDestinition, permanentDestinition);

}

}
