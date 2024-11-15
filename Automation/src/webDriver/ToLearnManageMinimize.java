package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMinimize 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().minimize();

driver.get("https://www.agoda.com/en-in/");
}
}
