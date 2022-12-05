package B_Explicit_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//They allow your code to halt program execution, or freeze the thread, until the condition you pass it resolves.
public class Explicit_Waits {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");
		// driver. findElement (By.xpath("//input
		// [@id=’login-username’]")).sendKeys("abc@yahoo.com");

		// Thread. sleep(3000) ;
		// driver. findElement (By.xpath ("//input [@id= ‘login-signin']”)).click();

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));

		sendKeys(driver, firstname, 10, "Yahoo");
		sendKeys(driver, lastname, 20, "YouTube");

		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver, forgotAccount, 10);
	}

	private static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);

	}

	private static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
