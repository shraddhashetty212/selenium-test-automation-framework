package ui;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		
		//Step 1 - Switch to frame which has that particular table
		//Step 2 - Get the number of rows
		//Step 3 - Get the number of columns
		//Step 4 - Iterate through the rows and columns and get the text and print it
		
		
		//Rows - //table[@id="table02"]/tbody/tr
		//Columns - //table[@id="table02"]/tbody/tr[1]/td
		
		List<WebElement> rowelements = driver.findElements(By.xpath("//table[@id=\"table02\"]/tbody/tr"));
		System.out.println("Number of rows: " +rowelements.size());
		int rowsize = rowelements.size();
		
		List<WebElement> columnelements = driver.findElements(By.xpath("//table[@id=\"table02\"]/tbody/tr[1]/td"));
		System.out.println("Number of columns: " +columnelements.size());
		int columnsize = columnelements.size();
		
		for (int i = 1; i <= rowsize; i++)
		{
			for (int j = 1; j <= columnsize; j++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@id=\"table02\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText()+ "  ");
			}
			System.out.println( );
		}
		driver.quit();

	}

}



