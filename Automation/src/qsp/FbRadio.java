package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRadio {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		int a=  driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int b = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int c = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		if(a==b && b==c)
			System.out.println("Pass");
		else
			System.out.println("fail");

	}

}
