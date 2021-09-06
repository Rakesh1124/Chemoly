package com.Chemoly.TestScripts;

import com.Chemoly.GenericLib.BaseTest;
import com.Chemoly.GenericLib.FileLib;
import com.Chemoly.GenericLib.WebDriverCommonLib;
import com.Chemoly.Pages.CreateLeadPage;
import com.Chemoly.Pages.CustomViewPage;
import com.Chemoly.Pages.HomePage;
import com.Chemoly.Pages.LoginPage;

public class CreateLeadTest  extends BaseTest{

	public static void main(String[] args) throws Throwable {

		
		BaseTest bt= new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		
		LoginPage lp=new LoginPage();
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readpropertyData(PROP_PATH,"username"),flib.readpropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "homeTitle"), "HomePage");
		Thread.sleep(2000);
		
		HomePage hp =new HomePage();
		hp.clickLeadsTab();
		Thread.sleep(2000);
		
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "customViewTitle"), "custom view Page");
		 
		CustomViewPage cv= new CustomViewPage();
		cv.ClickNewLeadsBtn();
		
		Thread.sleep(2000);
		
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "createLeadTitle"), "create Lead page");
		
		CreateLeadPage cl=new CreateLeadPage();
		cl.createLeadwithMandetoryDetails(flib.readExcelData(EXCEL_PATH, "Leads", 0, 1),
				flib.readExcelData(EXCEL_PATH, "Leads", 1, 1));
		
		
		
		
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH,"leadDetailsTitle"), "Lead Details Page");
		
			}

}
