package A_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");

		for(WebElement webElement :	driver.findElements(By.name("sex"))) {
			if(webElement.getAttribute("value").matches("-1"))
				webElement.click();
		}
		Thread.sleep(1000);
		driver.quit();
	}
}