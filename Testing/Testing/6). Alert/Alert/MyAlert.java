package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(50);
		System.out.println("accepted");
		alert.accept();
		Thread.sleep(50);
		driver.quit();
		
		
//		driver.findElement(By.linkText("PopUp")).click();
//		Robot robot = new Robot();
//		robot.mouseMove(400, 5);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		driver.quit();
		
		
	}
}
