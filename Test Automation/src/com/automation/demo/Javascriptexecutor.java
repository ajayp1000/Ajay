package com.automation.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Javascriptexecutor {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium-2.44.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://www.javascriptkit.com/javatutors/event2.shtml");
		
		//((JavascriptExecutor)driver).executeScript("inform()");
		//Thread.sleep(5000);
		//http://www.javascriptkit.com/javatutors/event2.shtml
		
		((JavascriptExecutor)driver).executeScript("document.getElementByName('fdO')[O].click()");
		Thread.sleep(5000);

	}

}
