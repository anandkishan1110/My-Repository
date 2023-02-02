package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgreementActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.partialLinkText("Read Service Agreement")).click();
		Set<String> all = driver.getWindowHandles();
		String wh = driver.getWindowHandle();
		for(String alwh:all)
		{
			driver.switchTo().window(alwh);
			if(!(wh.equals(alwh)))
			{
				List<WebElement> heading = driver.findElements(By.xpath("//h2"));
				for(WebElement hd:heading)
				{
					String b = hd.getText();
					System.out.println(b);
				}
				driver.close();
			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(wh);
		driver.close();
		
	}

}
