package D_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/ARUN/Projects/College/Testing/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		// driver.manage(). ).window().maximize();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("OnePlus6T");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		// js.executeScript(1 ("window. .scrollBy(0,300)");

	}

}
