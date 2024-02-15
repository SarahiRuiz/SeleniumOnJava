package PageObjects;

import Resorce.SetUp;

public class RadioButtonPage extends SetUp{

	public void GoToRadioButtonPage() {
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
	}
}
