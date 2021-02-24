package demo;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import locators.Locators;

public class RegistrationSteps {
	
	public WebDriver driver = null;
	Locators locators = new Locators(driver);
	
	Logger logger = Logger.getLogger("Get Logger");

	public WebDriver ChromeOpens(WebDriver driver)
	{
		
		String driverpath = System.getProperty("user.dir" )+ "\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public void Website(WebDriver driver) throws InterruptedException 
	{
		driver.navigate().to("https://www.toolsqa.com/");
		Thread.sleep(5000);
		locators.demo_site(driver).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		locators.forms(driver).click();
		Thread.sleep(3000);
		locators.practice_form(driver).click();
	}
	
	public void enterFirstName(WebDriver driver , String Firstname)
	{
	
		locators.firstname(driver).sendKeys(Firstname);
	}
	
	public void enterLastName(WebDriver driver,String Lastname)
	{
		locators.lastname(driver).sendKeys(Lastname);
	}
	
	public void enterEmail(WebDriver driver,String Email)
	{
		locators.email(driver).sendKeys(Email);
		locators.gender(driver).click();
	}
	
	public void enterNumber(WebDriver driver,String Phone)
	{
		locators.number(driver).sendKeys(Phone);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		locators.hobby(driver).click();
	}
	
	public void enterAddress(WebDriver driver,String Address)
	{
		locators.address(driver).sendKeys(Address);
	}
	
	public void Submit(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		locators.submit(driver).click();
	}
	
	public void Screenshot(WebDriver driver) throws IOException, InterruptedException
	{
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//System.out.println("FILE ___ "+System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\pic.png");
		FileHandler.copy(source, new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\pic.png"));
		Thread.sleep(3000);
		
	
	}
	public void ChromeClose(WebDriver driver)
	{
	
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
		String title = driver.getTitle();
		System.out.println(title);
		locators.close(driver).click();
		driver.quit();
		logger.info("All task completed");
		logger.info("Browser closed");
	}
}
