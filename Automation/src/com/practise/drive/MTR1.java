package com.practise.drive;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTR1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/kisha/Desktop/list.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> options = s.getOptions();
		int count=options.size();
		for(int i=0;i<count;i++) {
			String data = options.get(i).getText();
			hs.add(data);
		}
			for(Object j:hs) {
				System.out.println(j);
		}
			d.close();

	}

}
