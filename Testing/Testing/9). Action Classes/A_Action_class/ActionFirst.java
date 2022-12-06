package A_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionFirst {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=business+vector+icons&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjHhcyTzsz7AhWVyzgGHXc8AzYQ_AUoAXoECAMQAw&biw=1242&bih=568&dpr=1.1#imgrc=rGN4eIuJn6LBMM");
		Thread.sleep(1000);
		
		WebElement googleSearch=driver.findElement(By.name("q"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(googleSearch,Keys.SHIFT).sendKeys("selenium");
		
	}

}
