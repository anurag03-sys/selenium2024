package actions;

import java.time.Duration;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnScrollToElement 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://www.myntra.com/");
WebElement scrollUpto = driver.findElement(By.linkText("Blog"));

Actions action = new Actions(driver);
//action.scrollToElement(scrollUpto).perform();
action.scrollByAmount(0, 610).perform();
Thread.sleep(2000);
action.scrollByAmount(0, 610).perform();
}
}
