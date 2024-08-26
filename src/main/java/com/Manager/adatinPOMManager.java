package com.Manager;

import com.IPTClasses.BaseClass;
import com.POM.AdatinBookingPagePom;
import com.POM.AdatinLoginPom;
import com.POM.AdatinSearchHotelPom;
import com.POM.AdatinSelectHotelPom;
import com.confiReader.AdatinReaderProperties;

public class adatinPOMManager extends BaseClass {

	private AdatinReaderProperties AdatinReaderProperties;

	private AdatinLoginPom AdatinLoginPom;

	private AdatinSearchHotelPom AdatinSearchHotelPom;

	private AdatinSelectHotelPom AdatinSelectHotelPom;

	private AdatinBookingPagePom AdatinBookingPagePom;
	
	
	
	

	public AdatinReaderProperties getAdatinReaderProperties() {

		AdatinReaderProperties = new AdatinReaderProperties();

		return AdatinReaderProperties;
	}
	
	
	

	public AdatinLoginPom getAdatinLoginPom() {
		
		AdatinLoginPom = new AdatinLoginPom(driver);

		return AdatinLoginPom;
	}

	public AdatinSearchHotelPom getAdatinSearchHotelPom() {
		AdatinSearchHotelPom = new AdatinSearchHotelPom(driver);

		return AdatinSearchHotelPom;
	}

	public AdatinSelectHotelPom getAdatinSelectHotelPom() {
		AdatinSelectHotelPom = new AdatinSelectHotelPom(driver);

		return AdatinSelectHotelPom;

	}

	public AdatinBookingPagePom getAdatinBookingPagePom() {
		AdatinBookingPagePom = new AdatinBookingPagePom(driver);
		return AdatinBookingPagePom;
	}

}
