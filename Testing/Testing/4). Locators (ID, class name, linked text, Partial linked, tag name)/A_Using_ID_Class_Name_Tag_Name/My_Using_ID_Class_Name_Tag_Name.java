package A_Using_ID_Class_Name_Tag_Name;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Using_ID_Class_Name_Tag_Name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/users/signup?ssrc=product_home");


		//By id
		WebElement displayname = driver.findElement(By.id("display-name"));
		displayname.sendKeys("T-shirts");

		//By classname
		driver.findElement(By.className("s-checkbox")).click();

		//tag
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println("<a>  size: "+tags.size());
		for(WebElement tag : tags)
			System.out.print(tag.getText()+", ");
		
		
	}

}
