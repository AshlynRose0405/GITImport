package com.IPTClasses;

import com.Manager.adatinPOMManager;

public class AdatinRunnerClass extends BaseClass {

	public static void main(String[] args) throws Exception {

		adatinPOMManager adatinPOMManager = new adatinPOMManager();

		browserLaunch(adatinPOMManager.getAdatinReaderProperties().getBrowser());
		
		launchUrl(adatinPOMManager.getAdatinReaderProperties().getUrl());

		adatinPOMManager.getAdatinLoginPom().getAdatinLoginPage();

		adatinPOMManager.getAdatinSearchHotelPom().getAdatinSearchHotel("search");
		
		adatinPOMManager.getAdatinSelectHotelPom().getAdatinSelectHotel("continue");
		
	
		adatinPOMManager.getAdatinBookingPagePom().getAdatinBooking("cancel");

	}

}
