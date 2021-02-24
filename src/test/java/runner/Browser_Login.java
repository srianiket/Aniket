package runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import demo.RegistrationSteps;
import utility.ExcelUtils;

public class Browser_Login {
	
	public static WebDriver driver = null;
	@Test
	public void runTest() throws InterruptedException, IOException
	{
ExcelUtils excelUtils = new ExcelUtils();
		
		RegistrationSteps register = new RegistrationSteps();
		
		System.out.println("start");
		
		driver = register.ChromeOpens(driver);
		register.Website(driver);
		register.enterFirstName(driver,excelUtils.readCellData(1,0));
		register.enterLastName(driver,excelUtils.readCellData(1,1));
		register.enterEmail(driver,excelUtils.readCellData(1,2));
		register.enterNumber(driver,excelUtils.readCellData(1,3));
		register.enterAddress(driver,excelUtils.readCellData(1,4));
		register.Submit(driver);
		register.Screenshot(driver);
		register.ChromeClose(driver);

	}
}