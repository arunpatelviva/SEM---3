package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ARUN\\Projects\\College\\Testing\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());

	}

}
