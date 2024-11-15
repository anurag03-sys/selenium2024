package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearn_iFrame
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

driver.get("https://www.dream11.com/");

//driver.switchTo().frame(0); //according to index number

driver.switchTo().frame("send-sms-iframe"); // id or name of <iframe> tag

/*WebElement iframeSwitch = driver.findElement(By.xpath("//iframe[@title='Iframe Example']")); // webElement
driver.switchTo().frame(iframeSwitch);*/

driver.findElement(By.id("regEmail")).sendKeys("9080706039");
driver.findElement(By.id("regUser")).click();

driver.findElement(By.id("hamburger")).click();
}
}
