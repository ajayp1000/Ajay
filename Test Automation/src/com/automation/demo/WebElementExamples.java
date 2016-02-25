package com.automation.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementExamples
{
public static void main(String[] args)
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
	WebElement searchbutton = driver.findElement(By.name("btnK"));
	
	String getattrib = searchbutton.getAttribute("aria-label");
	String tagName = searchbutton.getTagName();
	boolean displayed = searchbutton.isDisplayed();
	boolean enabled = searchbutton.isEnabled();
	boolean selected = searchbutton.isSelected();
	String cssValue = searchbutton.getCssValue("font-family");
	Point location = searchbutton.getLocation();
	Dimension size = searchbutton.getSize();
	
	System.out.println("Attribute value of search button is:"+getattrib);
	System.out.println("Tagname of search button is:"+tagName);
	System.out.println("Value of is dispalyed:"+displayed);
	System.out.println("Value of is enabled:"+enabled);
	System.out.println("Value of is selected:"+selected);
	System.out.println("value of cssvalue:"+cssValue);
	System.out.println("Location is:"+location);
	System.out.println("size of search button is:"+size);
}
}
