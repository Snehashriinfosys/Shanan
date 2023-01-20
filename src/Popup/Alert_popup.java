package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver reena = new ChromeDriver();
	reena.get("https://demo.guru99.com/test/delete_customer.php");
	
	//entercustomer id
	reena.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	
	//click on submit button
	reena.findElement(By.xpath("//input[@name='submit']")).click();
	
	//first of all we need to switch the control of selenim from webpage to popup
	
	Alert abc = reena.switchTo().alert();
	//abc.accept();
	//abc.dismiss();
	String text = abc.getText();
	System.out.println(text);
}
}
