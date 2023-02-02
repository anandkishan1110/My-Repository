package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String sd = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		System.out.println("Tag name "+sd);
		String sa=driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		System.out.println("Href attribute "+sa);
		driver.close();
	}
	

}
