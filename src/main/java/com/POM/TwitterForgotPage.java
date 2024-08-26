package com.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.confiReader.TwitterReaderProperties;

public class TwitterForgotPage extends BaseClass {

	WebDriver TwitterForgotDriver;

	@FindBy(xpath = "(//*[@dir=\"auto\"])[1]")
	WebElement forgotPassword;

	@FindBy(name = "cppEmailOrUsername")
	WebElement email;

	@FindBy(xpath = "//div[@role='button']")
	WebElement loginLink;

	public TwitterForgotPage(WebDriver driver) {
		TwitterForgotDriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getTwitterForgot() {
		TwitterReaderProperties TwitterReaderProperties = new TwitterReaderProperties();

		try {
			clickElement(TwitterForgotDriver, forgotPassword);

			inputValue(TwitterForgotDriver, email, TwitterReaderProperties.getEmail());

			clickElement(TwitterForgotDriver, loginLink);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
