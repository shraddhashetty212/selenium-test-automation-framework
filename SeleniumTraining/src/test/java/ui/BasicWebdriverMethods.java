package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {

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

		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("https://www.sugarcrm.com/de/?utm_source=sugarcrm.com&utm_medium=referral");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#CybotCookiebotDialogBodyLevelButtonCustomize")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyButtonDecline']")).click();
		Thread.sleep(2000);
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		driver.findElement(By.xpath("//font[text()='View all add-ons']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		//driver.navigate().to("https://google.com");
		driver.quit();

	}

}

//WebDriver is an interface and ChromeDriver and FireFoxDriver etc are the classes of that interface.
//So thats why we can create objects of the classes using ChromeDriver driver = new ChromeDriver();
//this above step is called creating objects of the class ChromeDriver
//Link - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html

