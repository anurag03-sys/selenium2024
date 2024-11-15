package javascriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollIntoView 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	driver.get("https://en.wikipedia.org/wiki/Elections_in_the_United_States");
	
	WebElement scrollUpto = driver.findElement(By.xpath("//h2[text()='Criticisms and concerns']"));
	Thread.sleep(3000);
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	
	executor.executeScript("arguments[0].scrollIntoView(true)",scrollUpto);
	
	/*We are using true to keep the element above till which we are scrolling, 
	if we will use false instead of true then the element will 
	be in the bottom till which we want to scroll the window. */
	
	
}
}
