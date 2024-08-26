package com.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPTClasses.BaseClass;
import com.confiReader.readerProperties;

public class demoLoginPage extends BaseClass{
	
	public WebDriver demoDriver;//chrome
	
	
	
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
    private WebElement loginBtn;
 		
	
	public demoLoginPage(WebDriver driver) {  //chrome
		
		demoDriver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
//	
//	public demoLoginPage(WebDriver driver) {
//		demoDriver=driver;
//		PageFactory.initElements(driver, this);
//	}
	
	
	
	
	
	
	
	
	
	
	public void getDemoLogin() throws IOException {
		
	readerProperties rp =new readerProperties();
//		
//		clearVaiables(demoDriver, email);
//		
		inputValue(demoDriver, email, rp.getEmail());
		
		clearVaiables(demoDriver, password);
		
		inputValue(demoDriver, password, rp.getpassword());
		
		clickElement(demoDriver, loginBtn);
	}
	
	
	
	

}
