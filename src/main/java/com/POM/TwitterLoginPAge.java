package com.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.confiReader.TwitterReaderProperties;

public class TwitterLoginPAge extends BaseClass {

	WebDriver TwitterLoginDriver;

	@FindBy(name = "username")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	public TwitterLoginPAge(WebDriver driver) {

		TwitterLoginDriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void gettwitlogin() {

		TwitterReaderProperties TwitterReaderProperties = new TwitterReaderProperties();

		try {
			inputValue(TwitterLoginDriver, email, TwitterReaderProperties.getEmail());

			inputValue(TwitterLoginDriver, password, TwitterReaderProperties.getpassword());

			clickElement(TwitterLoginDriver, loginBtn);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR IN TWITLOGIN METHOD");
		}
	}

}
