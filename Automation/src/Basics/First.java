package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mingle-t20b-portal.mingle.awsdev.infor.com/MNGQAINFOROS_PP2/");
		//driver.findElement(By.xpath("//*[@id=\"from1\"]/div/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("inforosqa01@infor.com");
		driver.findElement(By.id("pass")).sendKeys("cg@40CjCW|9$jX8&");
		//driver.findElement(By.xpath("//[@title='Sign On']")).click();
		//driver.findElement(By.className("ping-button normal allow")).click();
		driver.findElement(By.xpath("//a[@title='Sign On']")).click();
		Thread.sleep(9000);
        driver.findElement(By.xpath("//button[@title='App Menu']")).click();
        System.out.println("Clicked on App Menu");
        
       // driver.findElement(By.xpath("//start(text()='Infor ION API'")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//span[(text(),'Infor ION API']")).click();
        
        //driver.findElement(By.xpath("//*[@id=\"mhdrSite\"]")).click();
        
        //driver.findElement(By.xpath("//div[@id='icdeskWrp']/ul[@id='icdeskUl']/li/a[@title='Infor ION API']")).click();
        //driver.findElement(By.xpath("//*[@id=\"mhdrSite\"]")).click();
        System.out.println("Clicked on IONAPI");
        
        driver.findElement(By.className("suite-add-desc")).click();
	}

}

