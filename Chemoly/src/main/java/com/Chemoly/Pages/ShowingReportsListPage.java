package com.Chemoly.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Chemoly.GenericLib.BaseTest;

public class ShowingReportsListPage {
	
	@FindBy(xpath="//input[@value=\"Create New Report\"]") private WebElement createnewReportbtn;

	public ShowingReportsListPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void ClickCreateNewReportBtn() 
	{
		 createnewReportbtn.click();
	}
}
