package A_Using_ID_Class_Name_Tag_Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Using_ID_Class_Name_Tag_Name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://automationpractice.com/index.php");
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirts");

		driver.findElement(By.name("submit_search")).click();
	}

}
