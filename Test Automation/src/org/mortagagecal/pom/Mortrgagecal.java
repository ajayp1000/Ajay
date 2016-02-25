package org.mortagagecal.pom;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class Mortrgagecal {
	
	@FindBy(how=How.NAME,using="param[homevalue]")
	WebElement homevalueElement;
	
	@FindBy(how=How.ID,using="loanamt")
	WebElement loanamtElement;
	
	@FindBy(how=How.ID,using="intrstsrate")
	WebElement intrestrateElement;
	
	@FindBy(how=How.ID,using="loanterm")
	WebElement loantermElement;
	
	@FindBy(how=How.NAME,using="param[start_month]")
	WebElement startmonthElement;
	
	@FindBy(how=How.NAME,using="param[start_year]")
	WebElement startyearElement;
	
	@FindBy(how=How.ID,using="pptytax")
	WebElement propertytaxElement;
	
	@FindBy(how=How.ID,using="pmi")
	WebElement pmiElement;
	
	@FindBy(how=How.NAME,using="cal")
	WebElement clickbutton;
	
	
	public void homevalue(String hmeval)
	{
		homevalueElement.clear();
		homevalueElement.sendKeys(hmeval);
	}
	public void loanamt(String lnamt)
	{
		loanamtElement.clear();
		loanamtElement.sendKeys(lnamt);
	}
	public void intrestrate(String intrate)
	{
		intrestrateElement.clear();
		intrestrateElement.sendKeys(intrate);
	}
	public void loanterm(String lnterm)
	{
		loantermElement.clear();
		loantermElement.sendKeys(lnterm);
	}
	public void startmonth(String srtmnth)
	{
		Select select=new Select(startmonthElement);
		select.selectByVisibleText(srtmnth);
	}
	public void startyear(String srtyr)
	{
		Select select=new Select(startyearElement);
		select.selectByVisibleText(srtyr);
	}
	public void propertytax(String prtytax)
	{
		propertytaxElement.clear();
		propertytaxElement.sendKeys(prtytax);
	}
	public void pmiElement(String pmiele)
	{
		pmiElement.clear();
		pmiElement.sendKeys(pmiele);
	}
	public void clickbutton()
	{
		clickbutton.click();
	}
	

}
