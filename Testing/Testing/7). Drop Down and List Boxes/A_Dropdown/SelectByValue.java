package A_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ARUN/Projects/College/Testing/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		WebElement selectByIndex = driver.findElement(By.id("day"));
		Select selByIndex=new Select(selectByIndex);
		selByIndex.selectByIndex(10);
		System.out.println("Day is Selected");
		
		WebElement seleByVal=driver.findElement(By.id("month"));
		Select selByVal = new Select(seleByVal);
		selByVal.selectByValue("5");
		System.out.println("The Month is selected");
		
		WebElement seleByText=driver.findElement(By.id("year"));
		Select selByTxt=new Select(seleByText);
		selByTxt.selectByVisibleText("2016");
		System.out.println("The year is selected");
	
	}
}
