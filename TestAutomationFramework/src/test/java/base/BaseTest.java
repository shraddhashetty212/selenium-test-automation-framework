package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();  // this is for config.properties file
	public static Properties loc = new Properties();  // this is for locators.properties file
	public static FileReader fr;  // to read from config.properties file
	public static FileReader fr1;  // to read from locators.properties file
	

	@BeforeMethod
	public void setUp() throws IOException
	{
		if (driver==null)
		{
			System.out.println("The path is : " + System.getProperty("user.dir"));
			fr = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/config.properties");
			fr1 = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/locators.properties");
			prop.load(fr);
			loc.load(fr1);
		}
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();  // base
			driver = new ChromeDriver();  // base
			driver.get(prop.getProperty("testurl"));
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Teardown successful");
	}

}
