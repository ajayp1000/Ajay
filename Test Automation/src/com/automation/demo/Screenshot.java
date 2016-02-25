package com.automation.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot
{
	public static void main(String[] args) throws  IOException,InterruptedException
	{
	 WebDriver driver= new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 driver.get("http://192.168.50.21:9000");
	 File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File file= new File("taska.png");
	 FileUtils.copyFile(screenshotAs, file);
	 driver.close();
	}

}
