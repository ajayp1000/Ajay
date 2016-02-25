package com.automation.demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoitprog {
	public static void main(String[] args) throws IOException,InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		Runtime runtime = Runtime.getRuntime();
		Thread.sleep(5000);
		runtime.exec("D:\\New folder\\raj.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/form/input[1]")).click();
		driver.close();
	}

}
