package javascriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenElements 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://www.facebook.com/r.php");

JavascriptExecutor executor = (JavascriptExecutor) driver;

WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
executor.executeScript("arguments[0].value='Anurag'", firstName);

WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
executor.executeScript("arguments[0].value='Das'", lastName);

System.out.println("First Name and Last name text field successfully filled.");

Thread.sleep(3000);

WebElement genderText = driver.findElement(By.id("custom_gender"));
executor.executeScript("arguments[0].value='HE/HIM'", genderText);

System.out.println("Gender(optional) text field successfully filled.");
}
}
