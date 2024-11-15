package dragAndDrop;

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

public class ToLearnDragAndDrop 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
String time = LocalDateTime.now().toString().replace(":", "-");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
driver.switchTo().frame(photoFrame);

WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

WebElement trash = driver.findElement(By.id("trash"));

Actions action = new Actions(driver);
action.dragAndDrop(image1, trash).perform();
action.dragAndDrop(image2, trash).perform();
action.dragAndDrop(image3, trash).perform();
action.dragAndDrop(image4, trash).perform();

TakesScreenshot takescreenshot = (TakesScreenshot) driver;
File tempDest = takescreenshot.getScreenshotAs(OutputType.FILE);

File perDest = new File("./screenshots/"+time+".png");
FileHandler.copy(tempDest, perDest);
System.out.println("All photos moved to trash from gallery successfully after taking the screenshot.");

Thread.sleep(10000);
WebElement gallery = driver.findElement(By.id("gallery"));
action.pause(5000);

action.dragAndDrop(image1,gallery).perform();
action.dragAndDrop(image2,gallery).perform();
action.dragAndDrop(image3,gallery).perform();
action.dragAndDrop(image4,gallery).perform();

File tempDest2 = takescreenshot.getScreenshotAs(OutputType.FILE);

File perDest2 = new File("./screenshots/"+time+".png");
FileHandler.copy(tempDest2, perDest2);
System.out.println("All photos moved to gallery from trash section successfully after taking the screenshot.");
}
}
