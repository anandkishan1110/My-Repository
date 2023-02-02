package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 promax");
	    Thread.sleep(10000);
		List<WebElement> allSug = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int size=allSug.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String text=allSug.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
