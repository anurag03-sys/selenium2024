package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectedOptions 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://demoapp.skillrary.com/");
WebElement priceListBox = driver.findElement(By.id("cars"));
Select priceSelection= new Select(priceListBox);

priceSelection.selectByIndex(0);
priceSelection.selectByIndex(1);
priceSelection.selectByIndex(2);

WebElement selectedOption = priceSelection.getFirstSelectedOption();
System.out.println(selectedOption.getText());

List<WebElement> allSelectedOptions = priceSelection.getAllSelectedOptions();
System.out.println(allSelectedOptions.size());

for(WebElement element : allSelectedOptions)
{
	System.out.println(element.getText());
}
}
}
