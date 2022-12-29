package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title_of_page {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.getTitle();
		System.out.println(driver.getTitle()); // until we come to topic assertions , we use sop to see results that we are 
		//expecting .
		
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		

	}

}
