package com.Chemoly.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Chemoly.GenericLib.BaseTest;

public class ZohoCRMPage {
	
	@FindBy(xpath="//select[@name=\"primarymodule\"]") private WebElement selectdrpdown;
    @FindBy(xpath="//select[@id=\"Leadsrelatedmodule\"]") private WebElement leadrealDn;
    @FindBy(xpath="(//option[text()=\"Products\"])[2]") private WebElement selectrealDn;
    @FindBy(xpath=("//input[@value=\"Continue\"]")) private WebElement continueBtn;
    public ZohoCRMPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
    public void ClickSelectDn() 
    {
    	selectdrpdown.click();
    }
    public void ClickLeadRealDn()
    {
    	leadrealDn.click();
    }
    public void ClickSelectRealDn() 
    {
    	selectrealDn.click();
    }
    public void ClickonContinebtn()
    {
    	continueBtn.click();
    }
}