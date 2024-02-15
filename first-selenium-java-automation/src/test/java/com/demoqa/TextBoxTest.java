package com.demoqa;

import org.testng.annotations.Test;
import PageObjects.TextBoxPage;
import Resorce.SetUp;

public class TextBoxTest extends SetUp {
	TextBoxPage textBoxPage = new TextBoxPage();
	@Test
	public void FillTextBoxPage()
	{
		textBoxPage.GoToTextBoxPage();
	}
}
