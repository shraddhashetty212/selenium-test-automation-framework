package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

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
		
		//cookies
		driver.findElement(By.cssSelector("button#CybotCookiebotDialogBodyLevelButtonCustomize")).click();
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyButtonDecline']")).click();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are: "+alltags.size());
		
		for (int i = 0; i < alltags.size(); i++)
		{
			System.out.println("Links on the page are: "+alltags.get(i).getAttribute("href"));
			System.out.println("Visible text on the anchor tag is: "+alltags.get(i).getText());
		}
		driver.close();

	}

}

//WebDriver is an interface and ChromeDriver and FireFoxDriver etc are the classes of that interface.
//So thats why we can create objects of the classes using ChromeDriver driver = new ChromeDriver();
//this above step is called creating objects of the class ChromeDriver
//Link - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html

