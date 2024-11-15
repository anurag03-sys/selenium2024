package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultipleDropDown 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

driver.get("https://demoapp.skillrary.com/");

WebElement priceListBox = driver.findElement(By.id("cars"));
Select priceSelection = new Select(priceListBox);


priceSelection.selectByIndex(3);
priceSelection.selectByValue("99");
priceSelection.selectByVisibleText("More Than INR 500 ( 55 )");

}
}
