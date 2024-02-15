package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Resorce.SetUp;

public class GlobalMethods extends SetUp {

	public boolean Click(WebElement element, Duration timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(click-> WaitToClick(element));
	}
	public boolean WaitToClick(WebElement element)
	{
		try
		{
			element.click();
			return true;
		}catch(Exception ex)
		{
			return false;
		}
	}
	
	public boolean EnterText(WebElement element, String value, Duration timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(enter-> WaitToEnterText(element, value));
	}
	public boolean WaitToEnterText(WebElement element, String value)
	{
		try
		{
			element.clear();
			element.sendKeys(value);
			return true;
		}catch(Exception ex)
		{
			return false;
		}
	}
}
