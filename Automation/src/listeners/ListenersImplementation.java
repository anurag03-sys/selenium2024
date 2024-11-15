package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation extends BaseClass implements ITestListener
{
	
@Override
	public void onTestFailure(ITestResult result) 
{
	String methodName = result.getName();
	String time = LocalDateTime.now().toString().replace(":", "-");
	
TakesScreenshot ts = (TakesScreenshot) driver;
File temporaryLocation = ts.getScreenshotAs(OutputType.FILE);
File permanentLocation = new File("./screenshots/"+methodName+time+"png");

try 
{
	FileHandler.copy(temporaryLocation, permanentLocation);
} 
catch (IOException e) 
{
	
	e.printStackTrace();
}
}		
}
