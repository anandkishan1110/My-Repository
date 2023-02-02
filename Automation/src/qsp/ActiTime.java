package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		/*if(rs==true)
		{
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}*/
		driver.quit();

	}

}
