package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingbrowser {
	
	public static WebDriver driver;
	
	public static void main(String[] args) 
	
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogen41\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	//	driver.close();

	}
}
