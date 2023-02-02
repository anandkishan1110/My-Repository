package com.practise.drive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
   static {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allSugg = d.findElements(By.xpath("//span[contains(text(),'java')]"));
		Thread.sleep(5000);
		int count = allSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String data = allSugg.get(i).getText();
			System.out.println(data);
		}
		d.close();

	}

}
