package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenOlaCab {

	public static void main(String[] args) {
 		System.setProperty("webdriver.gecko.driver", "C:\\ARUN\\Projects\\College\\Testing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.olacabs.com");
		System.out.println(driver.getTitle());
	}

}
