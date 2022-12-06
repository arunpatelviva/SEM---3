package A_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(3000);
		for(WebElement webElement :	driver.findElements(By.name("sex"))) {
			System.out.println(webElement.getAttribute("value")+" = "+webElement.isSelected());
		}
		Thread.sleep(1000);
		driver.quit();
	}
}