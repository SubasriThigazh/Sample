package com.testng.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class BookConfirmationPage extends BaseClass{
	@Test
	public void adactinConfirmation() throws Throwable
	{
		createTestName("Confirmation Report for TestCases");
		browserLaunch("chrome", "https://adactinhotelapp.com/index.php");
		reportStatus("PASS", "LoginPage Successfully Opened");
		findElementById("username").sendKeys("Muthulakshmi07");
		reportStatus("PASS", "Username Successfully Entered");
		findElementById("password").sendKeys("Test@123");
		reportStatus("PASS", "Password Successfully Entered");
		reportStatus("PASS SCREENSHOT", "Username and Pssword Entered");
		findElementAB(By.className("login_button")).click();
		reportStatus("PASS","Login Successful");
		reportStatus("PASS SCREENSHOT", "Login");
		WebElement opt=findElementAB(By.name("location"));
		selectByVisibleText(opt,"London");
		reportStatus("PASS","Location for booking has been Entered");
		findElementById("Submit").click();
		reportStatus("PASS","Submitted Location Successfully");
		//reportStatus("PASS SCREENSHOT", "SearchHotel");
		findElementAB(By.name("radiobutton_2")).click();
		reportStatus("PASS","Hotel Name Clicked");
		findElementAB(By.name("continue")).click();
		reportStatus("PASS","Hotel Name Successfully Entered");
		reportStatus("PASS SCREENSHOT", "Hotel Booking");
		findElementById("first_name").sendKeys("SubasriThigazh");
		reportStatus("PASS","FirstName Successfully Enetred");
		findElementAB(By.name("last_name")).sendKeys("Ja");
		reportStatus("PASS","LastName Successfully Entered");
		findElementById("address").sendKeys("49,MiddleStreet,TamilNadu 605604");
		reportStatus("PASS","Address Successfully Entered");
		findElementById("cc_num").sendKeys("4678258681815654");
		reportStatus("PASS","CardNumber Successfully Entered");
		WebElement card=findElementAB(By.name("cc_type"));
		selectByIndex(card, 2);
		reportStatus("PASS","CardType Successfully Entered");
		WebElement mon=findElementAB(By.xpath("//select[@name='cc_exp_month']"));
		selectByIndex(mon, 12);
		reportStatus("PASS","Month Successfully Entered");
		WebElement year=findElementAB(By.xpath("//select[@name='cc_exp_year']"));
		selectByIndex(year,3);
		reportStatus("PASS","Year Successfully Entered");
		findElementAB(By.name("cc_cvv")).sendKeys("123");
		reportStatus("PASS","CVV Successfully Entered");
		findElementAB(By.name("book_now")).click();
		reportStatus("PASS"," Confirmation of Hotel Successfully Registered");
		reportStatus("PASS SCREENSHOT", "ConfirmationHotel");
		Thread.sleep(6000);
		WebElement confirm=findElementAB(By.className("login_title"));
		System.out.println(confirm.isEnabled());
		reportStatus("PASS"," Successfully Booked");
		reportStatus("PASS SCREENSHOT", "BookingConfirmationPage Displayed Successfully");
		
		
		
		
		
		
		
	}

	

}
