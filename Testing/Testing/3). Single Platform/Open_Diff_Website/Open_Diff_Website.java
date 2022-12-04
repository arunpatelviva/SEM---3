package Open_Diff_Website;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Diff_Website {
	private static WebDriver wd;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice");
		System.out.println("1.ChromeBrowser\n2.Firefox Browser");
		int ch = sc.nextInt();
		sc.close();
		switch (ch) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
			wd = new ChromeDriver();
			if (wd != null) {
				wd.get("http:\\amazon.com");
			}
			break;
		case 2:
			System.setProperty("webdriver.gecko.driver", "C:/ARUN/Projects/College/Testing/geckodriver.exe");
			wd = new FirefoxDriver();
			if (wd != null) {
				wd.get("http:\\flipkart.com");
			}
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
