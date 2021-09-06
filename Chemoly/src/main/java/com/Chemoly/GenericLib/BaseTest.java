package com.Chemoly.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoconstants 
{
	public static WebDriver driver;
	public void openBrowser() throws Throwable 
	{
		FileLib flib = new FileLib();
		String browserName = flib.readpropertyData(PROP_PATH, "browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}	
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("enter proper browser Name");		
		}

		driver.manage().window().maximize();

		String testUrl = flib.readpropertyData(PROP_PATH, "url");
		driver.get(testUrl);

		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(),flib.readpropertyData(PROP_PATH, "loginTitle"), "Login Page");
	}


	public void closeBrowser()
	{
		driver.quit();

	}

}
