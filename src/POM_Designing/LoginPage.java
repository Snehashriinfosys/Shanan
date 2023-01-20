package POM_Designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='username']")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginbtn;
	
	//use constructor
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//getters and setters
	public void enterUn() {
		un.sendKeys("admin");
	}
	public void enterPWD() {
		pwd.sendKeys("manager");
	}
	public void enterLoginBtn() {
		loginbtn.click();
	}
}
