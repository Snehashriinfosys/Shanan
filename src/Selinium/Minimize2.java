package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver swara = new ChromeDriver();
		swara.get("https://www.google.com/");
		//maximize
		swara.manage().window().maximize();
		
		//java wait 
		Thread.sleep(3000);
		
		//minimze
		swara.manage().window().minimize();
		
	}

}
