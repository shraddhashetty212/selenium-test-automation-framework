package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSData;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSData.class, dataProvider="testdatafromexcel")
	public static void LoginTest(String username, String password)
	{
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();  // locators -- properties
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("submit_button"))).click();
	}
	
	/*
	@DataProvider(name="testdata")
	public Object[][] tData()
	{
		return new Object[][] 
		{
			{"shraddhavikasshetty@gmail.com", "Zoho1"},
			{"shraddhashetty@gmail.com", "Zoho2"},
			{"shraddhavikas@gmail.com", "Zoho21"},
			{"shraddhavikasshetty@gmail.com", "Zoho2121"}
			
		};
	}
	*/

}

/*
 * Data Providers
 * https://testng.org/doc/documentation-main.html
 */
