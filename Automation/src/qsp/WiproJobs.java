package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Wipro jobs");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(Keys.ENTER);
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		int count=allLink.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allLink.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
