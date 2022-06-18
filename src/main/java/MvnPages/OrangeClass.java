package MvnPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeClass{

	@FindBy (css="input#txtUsername")
	private WebElement username;
	
	@FindBy (css="input#txtPassword")
	private WebElement password;
	
	@FindBy (css="input#btnLogin")
	private WebElement click;
	
	public OrangeClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void id(String un) {
	password.sendKeys(un);
	}
	public void pass(String pw) {
	password.sendKeys(pw);
	}
	public void loginClick() {
		click.click();
	}
	

}