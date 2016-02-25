package com.automation.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://192.168.50.21:9000");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Ajay");
		driver.findElement(By.name("password")).sendKeys("12ajay12");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("sdincident")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='hideleftmenu']/table/tbody/tr[7]/td/table/tbody/tr/td/div/div[7]")).click();
		driver.findElement(By.linkText("Advanced Reports")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/a/img")).click();
		
		WebElement wElement = driver.findElement(By.name("list__service_category"));
		Select select =new Select(wElement);
		select.selectByIndex(0);
		Thread.sleep(5000);
		select.selectByValue("12");
		Thread.sleep(5000);
		select.selectByVisibleText("WebWise");
		Thread.sleep(5000);
		
		System.out.println("printing all the options in ");
		List<WebElement> options = select.getOptions();
		for(WebElement ab:options)
		{
			System.out.println(ab.getText());
		}
		
		System.out.println("printing all the seleced options");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for(WebElement ac:allSelectedOptions)
		{
			System.out.println(ac.getText());
		}
		
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First selected options:"+firstSelectedOption.getText());
		
		select.deselectAll();
		
		
		driver.close();
		
		
		
	}

}
