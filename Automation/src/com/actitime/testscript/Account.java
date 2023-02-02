package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Account {
	@Test(groups="smokeTest")
	public void createAccount() {
		Reporter.log("createAccount");
	}
	@Test
	public void modifyAccount() {
		Reporter.log("modifyAccount");
	}
	@Test
	public void deleteAccount() {
		Reporter.log("deleteAccount");
	}
	

}
