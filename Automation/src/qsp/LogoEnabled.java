package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoEnabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}

public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean rs = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
if(rs==true)
{
	System.out.println("pass");
}
else {
	System.out.println("Fail");
}
driver.quit();
	}

}
