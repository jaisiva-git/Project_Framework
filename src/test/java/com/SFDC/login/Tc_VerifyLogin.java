package com.SFDC.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SFDC.utility.SDFC_LoginPage;
import com.SFDC.utility.TestBase;

public class Tc_VerifyLogin extends TestBase{

	@Test
	public static void init() throws Exception{
		
		driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://login.salesforce.com/");

		SDFC_LoginPage loginpage = PageFactory.initElements(driver, SDFC_LoginPage.class);
		loginpage.setUserName("jaisri123@abc.com");
		loginpage.setPassword("Jaisiva@123");
		loginpage.clickSubmit();
		
	}
	
	@Test
	public static void VerifyLogin() {
		//verify the homepage is displayed
		
	}
	
}
