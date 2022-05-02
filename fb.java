package com.selenium.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	WebDriver driver;
	JavascriptExecutor jse;
	public void invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gurkh\\Downloads\\1sel jar\\chromedriver.exe.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.gmail.com");
		search();
		
	}
    public void search()
    {
    	try {
    		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yourmail@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("your_password");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='gb_x gb_Ea gb_f']")).click();
			Thread.sleep(3000);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    }
	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokebrowser();
		

	}

}
