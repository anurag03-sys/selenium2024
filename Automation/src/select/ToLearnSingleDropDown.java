package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleDropDown 
{
public static void main(String[] args) 
{
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

WebElement dayDropDown = driver.findElement(By.id("day"));
Select daySelection = new Select(dayDropDown);
daySelection.selectByIndex(2);

WebElement monthDropDown = driver.findElement(By.id("month")); //<select> address
Select monthSelection = new Select(monthDropDown);
//monthSelection.selectByIndex(11);
//monthSelection.selectByValue("3");
monthSelection.selectByVisibleText("Aug");

WebElement yearDropDown= driver.findElement(By.id("year"));
Select yearSelection= new Select(yearDropDown);
yearSelection.selectByVisibleText("1998");

}
}
