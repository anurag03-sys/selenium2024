package takeScreenshotWebPage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeStampScreenshot
{
public static void main(String[] args) throws IOException 
{
String time = LocalDateTime.now().toString().replace(":", "-");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.myntra.com/");
TakesScreenshot takescreenshot = (TakesScreenshot) driver;
File tempDest = takescreenshot.getScreenshotAs(OutputType.FILE);

File perDest = new File("./screenshots/"+time+".png");
FileHandler.copy(tempDest, perDest);	
}
}
