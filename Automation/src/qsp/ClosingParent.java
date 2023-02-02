package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingParent {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String pwh = driver.getWindowHandle();
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> alwh = driver.getWindowHandles();
		for(String wh:alwh)
		{
			driver.switchTo().window(wh);
			if(!(pwh.equals(wh)))
			{
				driver.close();
			}
		}
	}
}




