package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kisha/Desktop/list.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement> allOption = s.getOptions();
		int count=allOption.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allOption.get(i).getText();
			System.out.println(text);
		}
        driver.close();
	}

}
