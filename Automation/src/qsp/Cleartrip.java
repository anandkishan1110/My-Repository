package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='w-100p fs-4 fw-500 c-neutral-500']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@class='w-100p fs-4 fw-500 c-neutral-500']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("(//input[@class='w-100p fs-4 fw-500 '])[2]")).click();
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		driver.findElement(By.xpath("//span[@class='fw-600 fs-4 lh-2 flex flex-middle']")).click();

	}

}
