package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//cookies
		driver.findElement(By.id("accept-choices")).click();
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		
		//Print the title of the page
		String scriptToExecute = "return document.title;";
		String Title = (String) jsexecutor.executeScript(scriptToExecute);
		System.out.println(Title);
		
		
		//Click button on the page
		driver.switchTo().frame("iframeResult");
		System.out.println("Swicted to iframe");
		jsexecutor.executeScript("myFunction()");
		System.out.println("Clicked on the 'Try it' button");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
		
		//Highlight the button on the page
		System.out.println("Swicted to iframe again");
		WebElement tryItButton = driver.findElement(By.xpath("//button[normalize-space()='Try it']"));
		jsexecutor.executeScript("arguments[0].style.border='5px solid green';", tryItButton);
		
		//Scroll the page
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiedButton = driver.findElement(By.xpath("//a[normalize-space()='GET CERTIFIED']"));
		jsexecutor.executeScript("arguments[0].scrollIntoView(true);", certifiedButton);
		Thread.sleep(2000);

		
		driver.quit();

	}

}

//Link - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
//Link for alert - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.TargetLocator.html and then click on alert
//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/Alert.html


