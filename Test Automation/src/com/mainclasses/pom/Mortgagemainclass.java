package com.mainclasses.pom;

import java.util.concurrent.TimeUnit;

import org.demo.util.Excelutil;
import org.mortagagecal.pom.Mortrgagecal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mortgagemainclass {

		WebDriver driver;
		
		@BeforeMethod
		public void setup()
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.mortgagecalculator.org/");
		}
		
		@Test
		public void test1() throws InterruptedException
		{
			Mortrgagecal mortcal =new Mortrgagecal();
			PageFactory.initElements(driver, mortcal);
			Excelutil util=new Excelutil("C:\\Users\\NOC-PC\\Documents\\Book1.xlsx", 0);
			//int noofrows=util.noofrows(int sheetNo);
			for(int i=1;i<=2;i++)
			{
			
			Thread.sleep(5000);
			mortcal.homevalue(util.getcellvalue(i, 0));
			mortcal.loanamt(util.getcellvalue(i, 1));
			mortcal.intrestrate(util.getcellvalue(i, 2));
			mortcal.loanterm(util.getcellvalue(i, 3));
			mortcal.startmonth(util.getcellvalue(i, 4));
			mortcal.startyear(util.getcellvalue(i, 5));
			mortcal.propertytax(util.getcellvalue(i, 6));
			mortcal.pmiElement(util.getcellvalue(i, 7));
			mortcal.clickbutton();
			}
		
			
		}
		@AfterMethod
		public void teardown()
		{
			driver.close();
		}
	
	

}
