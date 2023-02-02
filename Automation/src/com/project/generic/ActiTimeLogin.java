package com.project.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileLibrary f=new FileLibrary();
		WebDriver driver=new ChromeDriver();
		driver.get(f.getPropertyData("Url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyData("Username"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(f.getPropertyData("Password"));
		driver.findElement(By.id("loginButton")).click();
		driver.close();

	}

}
