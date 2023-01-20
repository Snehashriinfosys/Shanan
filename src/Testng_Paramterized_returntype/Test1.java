package Testng_Paramterized_returntype;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	Sheet sh;
	LoginPage l;
	HomePage h;

	@BeforeClass
	public void openBrowser() throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\sky\\Documents\\TestExcelParamter.xlsx");
		sh = WorkbookFactory.create(fis).getSheet("Sheet1");

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open application
		driver.get("https://demo.actitime.com/user/submit_tt.do");

		// all objects we need
		l = new LoginPage(driver);
		h = new HomePage(driver);

	}

	@BeforeMethod
	public void openApp() {
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN(username);

		String password = sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPWD(password);
		l.clickLoginBtn();

	}// complete beforemethod@

	@Test
	public void verifyText() {
		Reporter.log("Running verify text", true);
		String expT = sh.getRow(0).getCell(2).getStringCellValue();
		String actT = h.verifyText();
		// here we use assertequals keyword

		Assert.assertEquals(expT, actT);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Running logout from app", true);
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Running close Browser", true);
	}
}
