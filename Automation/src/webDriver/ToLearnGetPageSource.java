package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.instagram.com/");
	
		
		String sourceCode= driver.getPageSource();
		System.out.println(sourceCode);
	}
	

}
 