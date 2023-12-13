package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static String browser = "chrome";

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		//above method
		WebElement pwd = driver.findElement(By.id("password"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(pwd)).sendKeys("Testing");
		
		//below method
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(pwd)).click();
		

	}

}

//Link - https://www.selenium.dev/documentation/webdriver/elements/locators/
//Available Relative Locators - Above, Below, Left of, Right of and Near

