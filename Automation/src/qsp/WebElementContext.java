package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementContext {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kisha/Desktop/Row.html");
	List<WebElement> data = driver.findElements(By.tagName("td"));
	int count = data.size();
	System.out.println(count);
	for(WebElement i:data)
	{
		String text = i.getText();
		System.out.println(text);
	}
	}
}
