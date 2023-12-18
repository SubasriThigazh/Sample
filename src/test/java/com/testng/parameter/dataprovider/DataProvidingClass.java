package com.testng.parameter.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProvidingClass {

	@DataProvider
	public Object[][] testData(){    
		return new Object[][] {{"Suganya", "suganya123"}, 
							   {"Rajesh", "rajesh123"}, 
							   }; 
	}
}
