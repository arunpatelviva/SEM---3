package B_Listboxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxs {
	public static void main(String[] args) {
		System. setProperty("webdriver.chrome.driver","C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("C:\\ARUN\\Projects\\College\\Testing\\Testing\\7). Drop Down and List Boxes\\B_Listboxes/Listbox.html");
		WebElement listbox = driver.findElement(By.id("city")); Select select =new Select (listbox);
		select.selectByIndex(1);
		select.selectByValue("c");
		select.selectByVisibleText("DELHI");
	}
}
