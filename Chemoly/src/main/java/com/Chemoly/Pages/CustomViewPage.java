package com.Chemoly.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Chemoly.GenericLib.BaseTest;

public class CustomViewPage {
	
	@FindBy(xpath="//input[@value=\"New Lead\"]") private WebElement newLeadsbtn;
	
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void ClickNewLeadsBtn()
	{
		newLeadsbtn.click();
	}
	
}
