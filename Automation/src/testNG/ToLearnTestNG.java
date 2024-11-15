package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG //Testing class
{
@Test
public void demo() //Test case
{
	//Test Steps
	Reporter.log("Welcome to advance Selenium. Have a nice Day.", true);
}

@Test
public void sample()
{
	Reporter.log("Sample Test", true);
}

@Test
public void name() 
{
	Reporter.log("name test", true);
}

@Test
public void add()
{
	Reporter.log("add test", true);
}

@Test
public void divide() 
{
Reporter.log("divide test", true);	
}
}
