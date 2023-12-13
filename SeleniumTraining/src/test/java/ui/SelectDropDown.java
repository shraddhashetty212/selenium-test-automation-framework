package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static String browser = "chrome";

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
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

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button#CybotCookiebotDialogBodyLevelButtonCustomize")).click();
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyButtonDecline']")).click();
		
		WebElement dropdown = driver.findElement(By.name("employees_c"));
		Select select = new Select(dropdown);
		
		select.selectByValue("level1");
		Thread.sleep(2000);
		select.selectByVisibleText("101 - 250 employees");
		Thread.sleep(2000);
		select.selectByIndex(7);
		Thread.sleep(2000);
		
		driver.close();

	}

}

//WebDriver is an interface and ChromeDriver and FireFoxDriver etc are the classes of that interface.
//So thats why we can create objects of the classes using ChromeDriver driver = new ChromeDriver();
//this above step is called creating objects of the class ChromeDriver
//Link - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html

