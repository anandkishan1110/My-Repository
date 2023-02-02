package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).click();
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("java");
		List<WebElement> allSug = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        Thread.sleep(10000);
		int count=allSug.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
        	String text=allSug.get(i).getText();
        	System.out.println(text);
        }
        driver.close();
	}

}
