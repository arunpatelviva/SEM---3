package C_Using_Class_Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Class_Name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
//		driver.manage().window().maximize();// maximize web page
		// id &name locator

		WebElement searchbox = driver.findElement(By.id("form-control tryit-email"));
		searchbox.sendKeys("Enter your email address here");
		driver.findElement(By.name("buttonClick()")).click();
	}

}
