package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kisha/Desktop/Naurki.html");
		Thread.sleep(2000);
        File f=new File("‪./data/ANAND.CV.docx");
        String abpath = f.getAbsolutePath();
        driver.findElement(By.id("cv")).sendKeys(abpath);
	}

}
