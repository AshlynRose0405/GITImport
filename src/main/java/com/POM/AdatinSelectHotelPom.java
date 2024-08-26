package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.InterfaceClass.AdatinLoginInterface;

public class AdatinSelectHotelPom extends BaseClass implements AdatinLoginInterface{
	
	WebDriver AdatinSelectHotelDriver;
	
	@FindBy(xpath=RatioBtn_id)
	private WebElement ratioBtn;
	
	@FindBy(name=ContinueBtn_name)
	private WebElement continueBtn;
	
	@FindBy(id=CancelBtn_id)
	private WebElement cancelBtn;
	
	public AdatinSelectHotelPom(WebDriver driver) {
		AdatinSelectHotelDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getAdatinSelectHotel(String continueORCancelElement) {
		
		clickElement(AdatinSelectHotelDriver, ratioBtn);
		
		if (continueORCancelElement.equalsIgnoreCase("continue")) {
			
			clickElement(AdatinSelectHotelDriver, continueBtn);
			
		}else if (continueORCancelElement.equalsIgnoreCase("cancel")) {
			
			clickElement(AdatinSelectHotelDriver, cancelBtn);
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
