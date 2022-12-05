import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Code_Of_Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/users/signup?ssrc=product_home");


		//By id
		driver.findElement(By.id("display-name")).sendKeys("T-shirts");

		//By name
		driver.findElement(By.name("password")).sendKeys("MyPassword");

		//By classname
		driver.findElement(By.className("s-checkbox")).click();

		//tag
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println("<a>  size: "+tags.size());
		for(WebElement tag : tags)
			System.out.print(tag.getText()+", ");

		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.partialLinkText("Sign up on")).click();
		
		driver.findElement(By.cssSelector("#password")).sendKeys("Test...");
		
		//Xpath - when id name and class missing then use xpath
		driver.findElement(By.xpath("//input[@size='30']")).sendKeys("a@gmail.com");
		
		
	}

}
