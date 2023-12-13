package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingRadioButton {

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

		driver.get("http://test.rubywatir.com/radios.php");
		driver.manage().window().maximize();
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@class='radioclass']"));
		radio1.click();
		System.out.println(radio1.isSelected());  //this will return true
		
		WebElement radio2 = driver.findElement(By.id("radioId"));
		radio2.click();
		System.out.println(radio2.isSelected()); //this will return true
		System.out.println(radio1.isSelected()); //this will return false
		
		WebElement numOfRadios = driver.findElement(By.xpath("//input[@type='radio']"));
		//numOfRadios.size(); //should give the number as 6
		
		driver.close();

	}

}

