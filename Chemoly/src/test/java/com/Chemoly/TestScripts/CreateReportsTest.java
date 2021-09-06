package com.Chemoly.TestScripts;

import org.testng.annotations.Test;

import com.Chemoly.GenericLib.BaseTest;
import com.Chemoly.GenericLib.FileLib;
import com.Chemoly.GenericLib.WebDriverCommonLib;
import com.Chemoly.Pages.HomePage;
import com.Chemoly.Pages.LoginPage;
import com.Chemoly.Pages.ShowingReportsListPage;
import com.Chemoly.Pages.ZohoCRMPage;

public class CreateReportsTest extends BaseTest {
	

@Test
  public void run() throws Throwable {
		
		BaseTest bt= new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		
		LoginPage lp=new LoginPage();
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readpropertyData(PROP_PATH,"username"),flib.readpropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "homeTitle"), "Home Page");
		Thread.sleep(2000);
		
		HomePage hp =new HomePage();
		hp.clickReportsTab();
		Thread.sleep(2000);
		
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "showingReportsTitle"), "Showing Reports List Page");
        ShowingReportsListPage sr=new ShowingReportsListPage();
        sr.ClickCreateNewReportBtn();
        
        
        wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "zohocrmTitle"), "Zoho crm page");
        ZohoCRMPage zc=new ZohoCRMPage();
        zc.ClickSelectDn();
        zc.ClickLeadRealDn();
        zc.ClickSelectRealDn();
        zc.ClickonContinebtn();
        
      
        
        bt.closeBrowser();
        
        
        
	}


}
