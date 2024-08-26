package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.InterfaceClass.AdatinLoginInterface;
import com.Manager.adatinPOMManager;

public class AdatinBookingPagePom extends BaseClass implements AdatinLoginInterface {

	WebDriver AdatinBookingDriver;

	@FindBy(id = FullName_id)
	private WebElement fullName;

	@FindBy(xpath = LastName_xpath)
	private WebElement lastName;

	@FindBy(name = Address_name)
	private WebElement address;

	@FindBy(xpath = CreditNo_xpath)
	private WebElement creditNo;

	@FindBy(id = CcType_id)
	WebElement ccType;

	@FindBy(name = Month_name)
	WebElement expiryMonth;

	@FindBy(name = Year_name)
	WebElement expiryYear;

	@FindBy(xpath = cvv_xpath)
	WebElement cvvNo;

	@FindBy(id = BookNowBtn_id)
	WebElement bookNow;

	@FindBy(id = CancelKey_id)
	WebElement cancelKey;

	public AdatinBookingPagePom(WebDriver driver) {

		AdatinBookingDriver = driver;

		PageFactory.initElements(driver, this);

	}

	adatinPOMManager adatinPOMManager = new adatinPOMManager();

	public void getAdatinBooking(String bookOrCancelElement) throws Exception {

		inputValue(AdatinBookingDriver, fullName, adatinPOMManager.getAdatinReaderProperties().getFullName());

		inputValue(AdatinBookingDriver, lastName, adatinPOMManager.getAdatinReaderProperties().getLastName());

		inputValue(AdatinBookingDriver, address, adatinPOMManager.getAdatinReaderProperties().getAddress());

		inputValue(AdatinBookingDriver, creditNo, adatinPOMManager.getAdatinReaderProperties().getCreditNo());

		selectDropdownOption(ccType, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getCcType());

		selectDropdownOption(expiryMonth, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getExpiryMonth());

		selectDropdownOption(expiryYear, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getExpiryYear());

		inputValue(AdatinBookingDriver, cvvNo, adatinPOMManager.getAdatinReaderProperties().getCvvNo());

		if (bookOrCancelElement.equalsIgnoreCase(adatinPOMManager.getAdatinReaderProperties().getBook())) {
			clickElement(AdatinBookingDriver, bookNow);
		} else if (bookOrCancelElement.equalsIgnoreCase(adatinPOMManager.getAdatinReaderProperties().getCancelNow())) {
			clickElement(AdatinBookingDriver, cancelKey);
		}

	}

}
