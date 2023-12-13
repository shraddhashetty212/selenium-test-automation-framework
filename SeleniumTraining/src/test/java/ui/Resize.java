package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement resizingElement = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-se')]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizingElement, 200, 130).perform();
		Thread.sleep(3000);

		
		driver.quit();

	}

}

//Link - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
//Link for alert - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.TargetLocator.html and then click on alert
//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/Alert.html


