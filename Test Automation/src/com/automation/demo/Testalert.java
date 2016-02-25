package com.automation.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testalert {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium-2.44.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/NOC-PC/Desktop/test456.html");
		driver.findElement(By.xpath("html/body/form/input")).click();
		Alert ab = driver.switchTo().alert();
		ab.accept();
		Thread.sleep(5000);
		ab.accept();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
