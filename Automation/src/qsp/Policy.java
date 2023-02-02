package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Policy {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select s=new Select(month);
        s.selectByIndex(8);
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select y=new Select(year);
	    y.selectByValue("1999");
	    driver.findElement(By.xpath("//a[text()='11']")).click();
	    driver.findElement(By.xpath("//input[@id='alternative_number']")).sendKeys("9845098450");
	    Thread.sleep(5000);
	    driver.findElement(By.id("renew_policy_submit")).click();
	    String text = driver.findElement(By.xpath("//span[@id='policynumberError']")).getText();
	    System.out.println(text);
	}

}
