package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import MvnTest.BaseTest;

public class ScreenShot{
	public void capture(WebDriver driver, String name) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File path = new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
	FileHandler.copy(source, path);
	System.out.println("Screenshot captured sucessfully");
	}
	
}
