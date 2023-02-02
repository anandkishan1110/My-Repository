package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Address {
	@Test(groups="smokeTest")
	public void createAddress()
	{
		Reporter.log("createAddress");
	}
	@Test()
	public void modifyAddress()
	{
		Reporter.log("modifyAddress");
	}
	@Test()
	public void deleteAddress()
	{
		Reporter.log("deleteAddress");
	}

}
