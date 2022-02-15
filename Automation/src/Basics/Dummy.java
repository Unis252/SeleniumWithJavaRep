package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\yshaik\\Downloads\\chromedriver_win32 (6)");
		WebDriver driver = new ChromeDriver();
		driver.get("www.Maps.com");

	}

}
