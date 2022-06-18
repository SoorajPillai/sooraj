package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import MvnTest.BaseTest;

public class Listnerss extends BaseTest implements ITestListener {
	ScreenShot ss;

	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		ss=new ScreenShot();
		try {
		ss.capture(driver, name);
		}catch(IOException e) {
		e.printStackTrace();
		}
	}

}
