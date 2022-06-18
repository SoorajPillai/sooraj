package MvnTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MvnPages.OrangeClass;

public class OrangeTest extends BaseTest{
OrangeClass ohc;
	
	@BeforeClass
	public void init() {
		ohc=new OrangeClass(driver);
	}
	@Test
	public void login() {
		ohc.id("Admin");
		ohc.pass("admin123");
		ohc.loginClick();
	}


}
