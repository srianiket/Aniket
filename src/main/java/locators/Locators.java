package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	public WebDriver driver = null;

	public Locators(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement demo_site(WebDriver driver) {
		return driver.findElement(By.linkText("DEMO SITE"));
	}
	public WebElement forms(WebDriver driver)
	{
	return driver.findElement(By.xpath("//h5[contains(text(),'Forms')]"));
	}
	public WebElement practice_form(WebDriver driver)
	{
	return driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]"));
	}
	public WebElement firstname(WebDriver driver)
	{
	return driver.findElement(By.xpath("//input[@id = 'firstName']"));
	}
	public WebElement lastname(WebDriver driver)
	{
	return driver.findElement(By.xpath("//input[@id = 'lastName']"));
	}
	public WebElement email(WebDriver driver)
	{
	 return driver.findElement(By.xpath("//input[@id = 'userEmail']"));
	}
	public WebElement gender(WebDriver driver)
	{
	return driver.findElement(By.xpath("//label[@for = 'gender-radio-1']"));
	}
	public WebElement number(WebDriver driver)
	{
	return driver.findElement(By.xpath("//input[@id ='userNumber']"));
	}
	public WebElement hobby(WebDriver driver)
	{
	return driver.findElement(By.xpath("//label[@for = 'hobbies-checkbox-2']"));
	}
	public WebElement address(WebDriver driver)
	{
	return driver.findElement(By.xpath("//textarea[@id ='currentAddress']"));
	}
	public WebElement submit(WebDriver driver)
	{
	return driver.findElement(By.xpath("//button[@id = 'submit']"));
	}
	public WebElement close(WebDriver driver)
	{
	return driver.findElement(By.id("closeLargeModal"));
	}
}
