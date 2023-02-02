package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/mas.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("Url");
		String un=p.getProperty("Username");
		String pw=p.getProperty("Password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
		driver.findElement(By.xpath("(//div[contains(text(),'Login')]) [1]")).click();
		

	}

}
