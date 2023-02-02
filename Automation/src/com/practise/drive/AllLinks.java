package com.practise.drive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
        List<WebElement> allLinks = d.findElements(By.xpath("//a"));
        int count = allLinks.size();
        System.out.println(count);
        for(WebElement j:allLinks) {
        	String data = j.getText();
        	System.out.println(data);
        }
        d.close();
	}

}
