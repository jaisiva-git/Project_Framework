package com.SFDC.login;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SFDC.utility.SDFC_LoginPage;
import com.SFDC.utility.TestBase;

public class TC_LoginTest extends TestBase{
	
	

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
		/*public static void LoginErrorMessage() {
			//username: jaisri123@abc.com    // Pwd: Jaisiva@123
			WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
			waitExplicitly(10, ele);
			ele.clear();
			
			ele.sendKeys("jaisri123@abc.com");
			
			WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
			waitExplicitly(10, ele2);

			ele2.sendKeys("Jaisiva@123");
			ele2.clear();
			driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
			
			//Verify error message
			String ActualMsg = driver.findElement(By.xpath("//div[@id='error']")).getText();
			
			String ExpectMsg = "Please enter your password.";
			
			Assert.assertEquals(ActualMsg, ExpectMsg);
			
			if(ActualMsg.equals(ExpectMsg)) {
		        System.out.println("Test Case Passed");
		    }else{
		        System.out.println("Test Case Failed");
		    }
		}
	}
	*/


}
