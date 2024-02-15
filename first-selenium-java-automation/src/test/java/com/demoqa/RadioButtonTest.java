package com.demoqa;

import org.testng.annotations.Test;
import PageObjects.RadioButtonPage;
import Resorce.SetUp;

public class RadioButtonTest extends SetUp {
	
	RadioButtonPage radioButtonPage = new RadioButtonPage();
	@Test
	public void FillRadioButton()
	{
		radioButtonPage.GoToRadioButtonPage();
	}
}
