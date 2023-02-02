package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProduct {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		List<WebElement> apple = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count=apple.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String brand = apple.get(i).getText();
			String cost = price.get(i).getText();
			System.out.println(brand+"------->"+cost);
		}
		driver.close();

	}

}
