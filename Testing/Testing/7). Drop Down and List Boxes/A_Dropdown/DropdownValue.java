package A_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		WebElement day_d = driver.findElement(By.id("day"));
		// Select Declaration
		Select oSelect = new Select(day_d);
		Thread.sleep(3000);
		List<WebElement> day_d1 = oSelect.getOptions();
		int total_days = day_d1.size();
		System.out.println("Total count is: " + total_days);
		for (WebElement ele : day_d1) {
			String day_1 = ele.getText();
			System.out.println("Days are " + day_1);
		}
		driver.quit();

	}
}
