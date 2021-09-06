package com.Chemoly.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Chemoly.GenericLib.BaseTest;

public class CreateLeadPage {
	
	
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement companyTb;
	@FindBy(xpath="//input[@name=\"property(Last Name)\"]") private WebElement lastNametb;
	@FindBy(xpath="(//input[@value=\"Save\"])[1]") private WebElement saveBtn;
	
	public CreateLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void createLeadwithMandetoryDetails(String companyName, String ln)
	{
		companyTb.sendKeys(companyName);
		lastNametb.sendKeys(ln);
		saveBtn.click();
	}

}
