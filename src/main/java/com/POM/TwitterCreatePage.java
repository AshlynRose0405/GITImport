package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.confiReader.TwitterReaderProperties;

public class TwitterCreatePage extends BaseClass {

	WebDriver TwitterDriver;

	@FindBy(xpath = "//span[text()='Sign up']")
	WebElement createBtn;

	@FindBy(name = "emailOrPhone")
	WebElement email;

	@FindBy(name = "fullName")
	WebElement fullName;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signupBtn;

	public TwitterCreatePage(WebDriver driver) {
		TwitterDriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getTwit() {
		TwitterReaderProperties TwitterReaderProperties = new TwitterReaderProperties();

		try {
			clickElement(TwitterDriver, createBtn);

			inputValue(TwitterDriver, email, TwitterReaderProperties.getEmail());

			inputValue(TwitterDriver, fullName, TwitterReaderProperties.InputName());

			inputValue(TwitterDriver, userName, TwitterReaderProperties.inputUserName());

			inputValue(TwitterDriver, password, TwitterReaderProperties.getpassword());

			clickElement(TwitterDriver, signupBtn);
		} catch (Exception e) {
			e.printStackTrace();

			System.err.println("ERROR IN GETTWIST METHOD");
		}

	}

}
