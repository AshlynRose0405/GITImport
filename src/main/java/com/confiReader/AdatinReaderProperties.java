package com.confiReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AdatinReaderProperties {

	private Properties getAdatinData() throws Exception {

		File file = new File(
				"D:\\Ashlyn class\\JAVA\\eclipse\\A1\\IPTClasses\\src\\main\\java\\com\\configProperties\\Adatin.properties");

		FileInputStream fs = new FileInputStream(file);

		Properties pro = new Properties();

		pro.load(fs);

		return pro;

	}

	public String getBrowser() throws Exception {
		String browser = getAdatinData().getProperty("Broweser");
		return browser;
	}

	public String getUrl() throws Exception {
		String url = getAdatinData().getProperty("Url");
		return url;
	}

	public String getUserName() throws Exception {
		String userName = getAdatinData().getProperty("UserName");
		return userName;
	}

	public String getPasssword() throws Exception {
		String password = getAdatinData().getProperty("Password");
		return password;
	}

	public String getLocation() throws Exception {

		String location = getAdatinData().getProperty("Location");
		return location;
	}

	public String getSelectionType() throws Exception {
		String selectionType = getAdatinData().getProperty("SelectionType");
		return selectionType;
	}

	public String getHotel() throws Exception {
		String hotel = getAdatinData().getProperty("Hotel");
		return hotel;
	}

	public String getRoomType() throws Exception {
		String roomType = getAdatinData().getProperty("RoomType");
		return roomType;
	}

	public String getNoOfRooms() throws Exception {
		String noOfRooms = getAdatinData().getProperty("NoOfRooms");
		return noOfRooms;
	}

	public String getCheckIn() throws Exception {
		String checkIn = getAdatinData().getProperty("CheckIn");
		return checkIn;
	}

	public String getCheckOut() throws Exception {
		String checkOut = getAdatinData().getProperty("CheckOut");
		return checkOut;
	}

	public String getAdultPerRoom() throws Exception {
		String adultPerRoom = getAdatinData().getProperty("AdultPerRoom");
		return adultPerRoom;
	}

	public String getChildPerRoom() throws Exception {
		String childPerRoom = getAdatinData().getProperty("ChildPerRoom");
		return childPerRoom;
	}

	public String getSearchBtn() throws Exception {
		String searchBtn = getAdatinData().getProperty("searchBtn");
		return searchBtn;
	}

	public String getResetBtn() throws Exception {
		String resetBtn = getAdatinData().getProperty("ResetBtn");
		return resetBtn;
	}

	public String getFullName() throws Exception {
		String fullName = getAdatinData().getProperty("FullName");
		return fullName;
	}

	public String getLastName() throws Exception {
		String lastName = getAdatinData().getProperty("LastName");
		return lastName;
	}

	public String getAddress() throws Exception {
		String address = getAdatinData().getProperty("Address");
		return address;
	}

	public String getCreditNo() throws Exception {
		String creditNo = getAdatinData().getProperty("CreditNo");
		return creditNo;
	}

	public String getCcType() throws Exception {
		String ccType = getAdatinData().getProperty("CcType");
		return ccType;
	}

	public String getExpiryMonth() throws Exception {
		String expiryMonth = getAdatinData().getProperty("ExpiryMonth");
		return expiryMonth;
	}

	public String getExpiryYear() throws Exception {
		String expiryYear = getAdatinData().getProperty("ExpiryYear");
		return expiryYear;
	}

	public String getCvvNo() throws Exception {
		String cvvNo = getAdatinData().getProperty("cvvNo");
		return cvvNo;
	}

	public String getBook() throws Exception {
		String book = getAdatinData().getProperty("Book");
		return book;
	}

	public String getCancelNow() throws Exception {
		String cancelNow = getAdatinData().getProperty("CancelNow");
		return cancelNow;
	}

}
