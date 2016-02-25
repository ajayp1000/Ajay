package com.automation.demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String firstid=driver.getWindowHandle();
		System.out.println("Firstwindowid:"+firstid);
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath(".//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
		
		String secondWindowid="";
		Set<String> windowHandles = driver.getWindowHandles();
		for(String id:windowHandles)
		{
			if(!firstid.equalsIgnoreCase(id))
			{
				secondWindowid=id;
			}
		}
		System.out.println("secondwindowid:"+secondWindowid);
		driver.switchTo().window(secondWindowid);
		driver.findElement(By.id("User_Id")).sendKeys("Rajkumar");
		Thread.sleep(2000);
		driver.switchTo().window(firstid);
		Thread.sleep(2000);
		driver.quit();
	}

}
