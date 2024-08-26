package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.InterfaceClass.AdatinLoginInterface;
import com.Manager.adatinPOMManager;

public class AdatinSearchHotelPom extends BaseClass implements AdatinLoginInterface {

	WebDriver AdatinSearchHotelPomDriver;

	@FindBy(name = Location_name)
	private WebElement location;

	@FindBy(id = Hotels_id)
	private WebElement hotels;

	@FindBy(id = RoomType_id)
	private WebElement roomType;

	@FindBy(id = NoOfRooms_id)
	private WebElement noOfRooms;

	@FindBy(id = CheckIn_id)
	private WebElement checkIn;

	@FindBy(id = CheckOut_id)
	private WebElement checkOut;

	@FindBy(id = AdultPerRoom_id)
	private WebElement adultPerRoom;

	@FindBy(id = ChildPerRoom_id)
	private WebElement childPerRoom;
	
	@FindBy(id=SearchBtn_id)
	private WebElement searchBtn;
	
	@FindBy(id= ResetBtn_id )
	private WebElement resetBtn;
	

	public AdatinSearchHotelPom(WebDriver driver) {

		AdatinSearchHotelPomDriver = driver;

		PageFactory.initElements(driver, this);
	}

	adatinPOMManager adatinPOMManager = new adatinPOMManager();

	public void getAdatinSearchHotel(String searchOrResetElement) throws Exception {

		selectDropdownOption(location, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getLocation());

		selectDropdownOption(hotels, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getHotel());

		selectDropdownOption(roomType, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getRoomType());

		selectDropdownOption(noOfRooms, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getNoOfRooms());
		
		clearVaiables(AdatinSearchHotelPomDriver, checkIn);

		inputValue(AdatinSearchHotelPomDriver, checkIn, adatinPOMManager.getAdatinReaderProperties().getCheckIn());
		
		clearVaiables(AdatinSearchHotelPomDriver, checkOut);

		inputValue(AdatinSearchHotelPomDriver, checkOut, adatinPOMManager.getAdatinReaderProperties().getCheckOut());

		selectDropdownOption(adultPerRoom, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getAdultPerRoom());

		selectDropdownOption(childPerRoom, adatinPOMManager.getAdatinReaderProperties().getSelectionType(),
				adatinPOMManager.getAdatinReaderProperties().getChildPerRoom());
		
		
		if(searchOrResetElement.equalsIgnoreCase(adatinPOMManager.getAdatinReaderProperties().getSearchBtn())) {
	
			clickElement(AdatinSearchHotelPomDriver, searchBtn);
		
		}else if (searchOrResetElement.equalsIgnoreCase(adatinPOMManager.getAdatinReaderProperties().getResetBtn())) {
			
			clickElement(AdatinSearchHotelPomDriver, resetBtn);

		}

	}

}
