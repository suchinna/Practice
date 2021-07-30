package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {
	WebDriver driver;
	
	public Spicejet(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']") WebElement depdrop;
	@FindBy(xpath="//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='PNQ']") WebElement depcity;
	@FindBy(xpath="//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']") WebElement arrivalcity;
	@FindBy(id="divpaxinfo") WebElement passengersdd;
	@FindBy(id="ctl00_mainContent_ddl_Adult") WebElement adultdd;
	@FindBy(id="ctl00_mainContent_ddl_Child") WebElement childdd;
	//@FindBy(id="ctl00_mainContent_view_date1") WebElement datepick;
	
	@FindBy(xpath="//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']") WebElement selectdate;
		
	public void getDeparturecity() throws InterruptedException{
		depdrop.click();
		depcity.click();
		Thread.sleep(2000);
		arrivalcity.click();
	}
	
	public void getPassengers(){
		passengersdd.click();
	}
	
	public void getDate(){
		//datepick.click();
		selectdate.click();
	}
	
	public void getAdults(){
		Select sel= new Select(adultdd);
		sel.selectByVisibleText("3");
		Select sel1 = new Select(childdd);
		sel1.selectByVisibleText("2");
		
	}
	
	public void gittest(){
	System.out.println("Git Testing");
	System.out.println("Git Testing2");
	}
	

}
