package Resorce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {

	public static WebDriver driver;
	@BeforeClass
	public void InitDriver()
	{
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.close();
	}
}
