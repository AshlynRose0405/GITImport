package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.InterfaceClass.AdatinLoginInterface;
import com.Manager.adatinPOMManager;

public class AdatinLoginPom extends BaseClass implements AdatinLoginInterface {

	WebDriver AdatinLoginPomDriver;

	@FindBy(id = user_id)
	private WebElement userName;

	@FindBy(id = password_id)
	private WebElement password;

	@FindBy(id = login_id)
	private WebElement loginBtn;

	public AdatinLoginPom(WebDriver driver) {

		AdatinLoginPomDriver = driver;

		PageFactory.initElements(driver, this);

	}

	adatinPOMManager adatinPOMManager = new adatinPOMManager();

	public void getAdatinLoginPage() throws Exception {

		inputValue(AdatinLoginPomDriver, userName, adatinPOMManager.getAdatinReaderProperties().getUserName());

		inputValue(AdatinLoginPomDriver, password, adatinPOMManager.getAdatinReaderProperties().getPasssword());

		clickElement(AdatinLoginPomDriver, loginBtn);

	}

}
