package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenOla {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ARUN\\Projects\\College\\Testing\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ola.com");
		System.out.println(driver.getTitle());

	}

}
