package Testng_Paramterized_returntype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//here create pom class using excel sheet parameterized 
@FindBy(xpath="//input[@id='username']")private WebElement UN;
@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;

//initialization
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}

//now we used constructor 
public void enterUN(String username) {
	UN.sendKeys(username);
}
public void enterPWD(String password) {
	PWD.sendKeys(password);	
}
public void clickLoginBtn() {
	loginBtn.click();
}

}
