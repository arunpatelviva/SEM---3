package B_CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		// 2) Select all the check boxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
		System.out.println("Total No of check boxes: " + checkboxes.size());

		for(WebElement chbox:checkboxes) {
			chbox.click();
		}
	}
}
