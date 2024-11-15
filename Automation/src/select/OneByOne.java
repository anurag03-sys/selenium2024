package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OneByOne 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	WebElement dayDropDown = driver.findElement(By.id("day"));
	Select daySelection = new Select(dayDropDown);
	List<WebElement> allDay = daySelection.getOptions();
	System.out.println(allDay.size());
	
	for(int element=0; element<31; element++)
	{
		Thread.sleep(5000);
		daySelection.selectByIndex(element);
		System.out.println(allDay.get(element).getText());
	}

	WebElement monthDropDown = driver.findElement(By.id("month")); //<select> address
	Select monthSelection = new Select(monthDropDown);	
	List<WebElement> allMonth = monthSelection.getOptions();
	System.out.println(allMonth.size());
	
	for(int element=0; element<12; element++)
	{
		Thread.sleep(5000);
		monthSelection.selectByIndex(element);
		System.out.println(allMonth.get(element).getText());
    }
}
}
