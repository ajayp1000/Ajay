package com.automation.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.mortgagecalculator.org");
		WebElement test= driver.findElement(By.name("param[homevalue]"));
		test.clear();
		test.sendKeys("10000");
		WebElement test1=driver.findElement(By.id("loanamt"));
		test1.clear();
		test1.sendKeys("20000");
		WebElement test2=driver.findElement(By.id("intrstsrate"));
		test2.clear();
		test2.sendKeys("23");
		WebElement test3=driver.findElement(By.xpath(".//*[@id='pptytax']"));
		test3.clear();
		test3.sendKeys("2");
		driver.findElement(By.cssSelector("#loanterm")).click();
		driver.findElement(By.linkText("Output parameters »")).click();
		driver.findElement(By.partialLinkText("Output parameters")).click();
		driver.close();
		List<WebElement> elements= driver.findElements(By.tagName("input"));
		System.out.println(elements.size());
		System.out.println("success");
		
	
		
	}

}
