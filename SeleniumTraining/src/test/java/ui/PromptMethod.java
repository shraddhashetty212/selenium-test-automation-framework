package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		//cookies
		driver.findElement(By.id("accept-choices")).click();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		
		//handling alert box
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().sendKeys("Shraddha");
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		driver.switchTo().parentFrame();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}

//Link - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
//Link for alert - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.TargetLocator.html and then click on alert
//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/Alert.html


