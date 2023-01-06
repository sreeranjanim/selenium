package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/market/login.asp");
	driver.findElement(By.id("user_email")).sendKeys("ranjani");
	driver.findElement(By.name("user_password")).sendKeys("ranj1234567");
	driver.findElement(By.className("btn-primary")).click();                 
	driver.close();
	
	

	}

}
