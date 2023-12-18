package com.testng.reports;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ReportsSample extends BaseClass{

	@Test
	public void sampleMethod() throws Throwable {
		createTestName("Sample");
		System.out.println("Reports Sample");
		reportStatus("INFO", "Sample Info step");
		reportStatus("WARN", "Sample Warn step");
	}
	
	@Test
	public void fbLogin() throws Throwable {
		createTestName("Login testcase for Facebook");
	try {
		browserLaunch("chrome", "https://www.facebook.com/");
		reportStatus("PASS", "Browser launched with Facebook URL");
		
		findElementById("email").sendKeys("Muthulakshmi");
		reportStatus("PASS", "Username entered");
		
		findElementById("pass").sendKeys("Test@123");
		reportStatus("PASS", "Password entered");
		reportStatus("PASS SCREENSHOT", "Sample");
		
		findElementAB(By.name("login")).click();
		reportStatus("PASS", "Clicked on Login button");
	}catch(Exception e) {
		reportStatus("FAIL", e.getLocalizedMessage());
	}
	}
}
