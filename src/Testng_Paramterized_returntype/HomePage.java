package Testng_Paramterized_returntype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}
public String verifyText() {
	String actT=text.getText();
	return actT;
}
}
