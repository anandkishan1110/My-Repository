package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int a = driver.findElement(By.id("username")).getSize().getHeight();
		int b=driver.findElement(By.id("username")).getSize().getWidth();
		int x=driver.findElement(By.name("pwd")).getSize().getHeight();
		int y=driver.findElement(By.name("pwd")).getSize().getWidth();
		if(a==x&&b==y)
			System.out.println("pass");
		else
			System.out.println("fail");

	}

}
