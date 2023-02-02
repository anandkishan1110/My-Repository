package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/kisha/Desktop/demo.html");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[name='n1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='https://www.qspiders.com']")).click();
		driver.close();
		

	}

}
