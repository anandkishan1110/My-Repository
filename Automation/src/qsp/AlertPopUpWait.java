package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpWait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if(text.equals("You Pressed Cancel"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
