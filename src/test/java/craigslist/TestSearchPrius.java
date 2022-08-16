package craigslist;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Get;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestSearchPrius {

	public static WebDriver driver;

	@BeforeTest
	public static void setUpClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tampa.craigslist.org/search/cta?");
		Assert.assertEquals("tampa bay cars & trucks - craigslist", driver.getTitle());
		driver.findElement(By.id("query")).click();
				
	}		
	
	@Test

	public void TestStartSearching() {
		System.out.println("Starting Searching");

		//		enter searching Data
		WebElement searchField = driver.findElement(By.id("query"));
		searchField.sendKeys("Prius");

		//		click search button
		WebElement searchButton = driver.findElement(By.className("searchbtn"));
		searchButton.click();



	}

	@AfterTest
	public static void tearDown() {
		driver.quit();
	}

}


