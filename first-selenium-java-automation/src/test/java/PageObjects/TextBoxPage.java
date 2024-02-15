package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import Enums.TextBoxPageElements;
import Resorce.SetUp;

public class TextBoxPage extends SetUp{

	public TextBoxPageElements textBoxPageElements = new TextBoxPageElements();
	public GlobalMethods globalMethods = new GlobalMethods();
	public void GoToTextBoxPage()
	{
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}
	public void FillTextBoxPage()
	{
		WebElement FullNameInput = driver.findElement(textBoxPageElements.FullNameInput);
		globalMethods.EnterText(FullNameInput, "Name", 10);
	}
}
