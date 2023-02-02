package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass {
	@Test
	public void testProject() throws InterruptedException {
		Reporter.log("createProject",true);
		HomePage h=new HomePage(driver);
		Thread.sleep(5000);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewProjectOption().click();
		t.getProjectNameTbx().sendKeys("Selenium007");
		t.getCustomerDD().click();
		t.getCreateCustomerTx().click();
		t.getDescriptionTx().sendKeys("Automation");
		t.getCreateProjectBtn().click();
	}

}
