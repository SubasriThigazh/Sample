package com.testng.parameter.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class DataProviderSample extends BaseClass{

	@Test(dataProvider = "testData", dataProviderClass = DataProvidingClass.class)
	public void testMethod(String username, String password) {
//		browserLaunch("chrome", "https://adactinhotelapp.com/");
//		WebElement user = findElementById("username");
//		WebElement pwd = findElementById("password");
//		WebElement loginBtn = findElementById("login");
		
//		user.sendKeys(username);
//		pwd.sendKeys(password);
//		click(loginBtn);
//		pageClose();
		
		//for Parallel attribute
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		driver.close();
		
	}
	
	@DataProvider(name = "Credentials", parallel=true)
	public Object[][] data(){    
		return new Object[][] {{"Suba", "suba123"}, 
							   {"Sugantha", "sugantha123"}, 
							   {"Vinod", "vinod123"}, 
							   {"Eswari", "eswari123"}}; 
	}
}
