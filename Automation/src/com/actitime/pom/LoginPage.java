package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTbx;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement psTbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setUserName(String un,String pw)
	{
		unTbx.sendKeys(un);
		psTbx.sendKeys(pw);
		lgBtn.click();
	}
}
