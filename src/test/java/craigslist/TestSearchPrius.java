package craigslist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;



public class TestSearchPrius extends BaseTest{


	@Test
	public void TestStartSearching() {
		//		enter searching Data
		driver.get("https://tampa.craigslist.org/search/cta?");
		Assert.assertEquals("tampa bay cars & trucks - craigslist", driver.getTitle());
		WebElement searchField = driver.findElement(By.xpath("//input[@enterkeyhint='search']"));
		searchField.sendKeys("Prius" + "\n");

	}





}


