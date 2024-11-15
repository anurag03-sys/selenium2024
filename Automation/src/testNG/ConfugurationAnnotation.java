package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfugurationAnnotation 
{
	
@BeforeSuite //can't give priority
public void beforeSuite()
{
Reporter.log("@BeforeSuite Executed", true);
}

@BeforeTest
public void beforeTest()
{
	Reporter.log("@BeforeTest Executed", true);
}

@BeforeClass
public void beforeClass()
{
	Reporter.log("@BeforeClass Executed", true);
}

@Test
public void test()
{
	Reporter.log("@Test", true);
}

@AfterClass
public void afterClass()
{
	Reporter.log("@AfterClass Executed", true);
}

@BeforeMethod
public void beforeMethod()
{
	Reporter.log("@BeforeMethod Executed", true);
}

@AfterTest
public void afterTest()
{
	Reporter.log("@AfterTest Executed", true);
}

@AfterMethod
public void AefterMethod()
{
	Reporter.log("@AfterMethod Executed", true);
}

@AfterSuite
public void afterSuite() //can't give priority
{
	Reporter.log("@AfterSuite Executed", true);
}

// if we will change the location also it will execute according to the @BeforeSuite and @AfterSuite
}
