package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass
{
@Test
public void clickOnBooks()
{
	driver.findElement(By.partialLinkText("Books")).click();
	String actualTitle = driver.getTitle();
	String expectedTitle = "Demo Web Shop. Books";
	if(actualTitle.equals(expectedTitle))
	{
		Reporter.log("Books page is displayed successfully", true);
	}
	
	else
	{
		Reporter.log("Books page is not displayed successfully", true);
	}
}
}
