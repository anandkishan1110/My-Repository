package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskModule {
	@BeforeMethod(groups="smokeTest")
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test
	public void createTask() {
		Reporter.log("createCustomer",true);
	}
	@Test
	public void deleteTask() {
		Reporter.log("deleteCustomer",true);
	}

}
