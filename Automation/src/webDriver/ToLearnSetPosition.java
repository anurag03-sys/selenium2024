package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetPosition 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().setPosition(new Point(100, 250));

}
}
