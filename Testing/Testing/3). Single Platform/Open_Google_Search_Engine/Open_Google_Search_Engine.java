package Open_Google_Search_Engine;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Google_Search_Engine {

//	static WebDriver wd;

	public static void main(String[] args) {

		WebDriver wd = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice");
		System.out.println("1.ChromeBrowser \n2. Firefox Browser");
		int ch = sc.nextInt();
		sc.close();
		switch (ch) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "C:\\ARUN\\Projects\\College\\Testing\\chromedriver.exe");
			wd = new ChromeDriver();
			if (wd != null) {
				wd.get("https://www.google.com/");
			}
			break;			
		case 2:
			System.setProperty("webdriver.gecko.driver", "C:\\ARUN\\Projects\\College\\Testing\\geckodriver.exe");
			wd = new FirefoxDriver();
			if (wd != null) {
				wd.get("https://www.google.com/");
			}
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
