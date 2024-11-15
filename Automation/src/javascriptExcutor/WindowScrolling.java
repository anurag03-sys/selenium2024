package javascriptExcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowScrolling 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://en.wikipedia.org/wiki/Elections_in_the_United_States");

JavascriptExecutor executor = (JavascriptExecutor) driver;

/*executor.executeScript("window.scrollBy(0,777)");
Thread.sleep(5000);
System.out.println("Scrolling by using window.scrollBy method....");
executor.executeScript("window.scrollBy(0,777)");*/

System.out.println("Scrolling by using window.scrollTo method....");
executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");

Thread.sleep(2000);
System.out.println("Refreshing the webpage without using refresh() method");
executor.executeScript("history.go()");
}
}
 