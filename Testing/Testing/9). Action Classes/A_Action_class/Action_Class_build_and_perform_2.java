package A_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_build_and_perform_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement googleSearch = driver.findElement(By.name("q"));
		Actions act = new Actions(driver);
		act.keyDown(googleSearch, Keys.SHIFT).sendKeys("selenium").keyUp(googleSearch, Keys.SHIFT)
				.keyDown(googleSearch, Keys.CONTROL).sendKeys("a").keyDown(googleSearch, Keys.CONTROL).sendKeys("x")
				.build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
