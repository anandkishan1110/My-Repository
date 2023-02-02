package com.practise.drive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTR3 {
    static {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/kisha/Desktop/list.html");
		WebElement mtr = d.findElement(By.id("mtr"));
        Select s=new Select(mtr);
        List<WebElement> text = s.getOptions();
       int count= text.size();
       for(int i=0;i<count;i++) {
    	  String data = text.get(i).getText();
    	  al.add(data);
       }
       Collections.sort(al);
       for(String j:al) {
    	   System.out.println(j);  
       }
    	d.close();   
	}

}
