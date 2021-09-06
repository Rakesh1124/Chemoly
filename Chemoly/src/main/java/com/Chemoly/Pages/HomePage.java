package com.Chemoly.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Chemoly.GenericLib.BaseTest;

public class HomePage {
	
	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadstab;
	@FindBy(xpath="//a[text()=\"Reports\"]") private WebElement reportstab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickLeadsTab()
	{
		leadstab.click();
	}
	public void clickReportsTab()
	{
		reportstab.click();
		
	}
	

}
