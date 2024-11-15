package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageGetSize 
{
public static void main(String[] args) 
{
WebDriver driver= new ChromeDriver();
driver.manage().window().getSize();

driver.get("https://demowebshop.tricentis.com/");
Dimension size = driver.manage().window().getSize();
System.out.println(size);

int height= size.getHeight();
int width= size.getWidth();

System.out.println("Height :"+ height);
System.out.println("Width :"+ width);
}
}
