package B_CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Last_2_Check_boxes_selection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
		int totalcheckboxes = checkboxes.size();
		for (int i = totalcheckboxes - 2; i < totalcheckboxes; i++) {
			checkboxes.get(i).click();
		}

	}

}
