package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

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
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.close();

	}

}

//WebDriver is an interface and ChromeDriver and FireFoxDriver etc are the classes of that interface.
//So thats why we can create objects of the classes using ChromeDriver driver = new ChromeDriver();
//this above step is called creating objects of the class ChromeDriver
//Link - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html

