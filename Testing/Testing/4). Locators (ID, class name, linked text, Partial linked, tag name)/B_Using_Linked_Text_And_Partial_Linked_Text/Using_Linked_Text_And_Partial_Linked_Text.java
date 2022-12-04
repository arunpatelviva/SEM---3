package B_Using_Linked_Text_And_Partial_Linked_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Linked_Text_And_Partial_Linked_Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();// maximize web page
		// id &name locator

		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirts");

		driver.findElement(By.name("submit_search")).click();
		// linkText & partial linkText
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
	}

}
