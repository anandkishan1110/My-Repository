package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone  14 pro max");
		Thread.sleep(20000);
		List<WebElement> allLink = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
        int count=allLink.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
        	String text = allLink.get(i).getText();
        	System.out.println(text);
        }
        allLink.get(count-1).click();
	}

}
