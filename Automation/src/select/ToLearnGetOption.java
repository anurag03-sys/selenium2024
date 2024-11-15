package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOption 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://demoapp.skillrary.com/");
WebElement priceBox = driver.findElement(By.id("cars"));
Select priceSelection = new Select(priceBox);

List<WebElement> allOptions = priceSelection.getOptions();
System.out.println(allOptions.size());

System.out.println("Printing all the list.");
for(WebElement element: allOptions)
{
	System.out.println(element.getText());
}
System.out.println("Checking whether the selection box is multiple or single.");
boolean result = priceSelection.isMultiple();
System.out.println(result);

}
}
