package B_CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		// 1) select specific check box
		driver.findElement(By.xpath("//input[@id='monday']")).click();

		
	}
}
