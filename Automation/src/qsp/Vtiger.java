package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions  a=new Actions(driver);
		a.moveToElement(resource).perform();
		Thread.sleep(7000);
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement button = driver.findElement(By.id("loginspan"));
		a.doubleClick(button).perform();
		Set<String> wh = driver.getWindowHandles();
		for(String allwh:wh)
		{
			driver.switchTo().window(allwh);
			String title = driver.getTitle();
			//System.out.println(title);
			if(title.equals("Login - Vtiger"))
			{
				System.out.println("Login page is displayed");
			}
			else
			{
				System.out.println("Login page is not displayed");
			}
		}
		driver.close();

	}

}
