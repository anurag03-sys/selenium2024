package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClose 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://tinder.com/");
	driver.close();
	
	
	String title= driver.getTitle();
	System.out.println(title); // Exception will be there because the session is end at the time of close,so close() should be given at the end.
}
}
