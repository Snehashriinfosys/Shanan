package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div {
	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sky\\Downloads\\chromedriver_win3\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("_2KpZ6l _2doB4z")).click();







		}
}
