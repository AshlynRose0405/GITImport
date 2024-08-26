package com.IPTClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RunnerClass extends BaseClass {

	public static void main(String[] args) {
		browserLaunch("Chrome");

		waitconcepts(30);

		launchUrl("https://www.amazon.in/");

		pageHeadline(driver, "getcurrenturl");

		WebElement allCategoriesBtn = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		selectDropdownOption(allCategoriesBtn, "text", "Alexa Skills");
		selectDropdownOption(allCategoriesBtn, "value", "search-alias=fashion");
		selectDropdownOption(allCategoriesBtn, "index", "9");

		WebElement searchTab = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		inputValue(driver, searchTab, "HomeDecor");
		catchVariables(driver, searchTab);
		// keyboardActions("Enter");

		WebElement searchBtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		clickElement(driver, searchBtn);

		screenShot("AmazonPage");

		WebElement tab = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[30]"));
		scriptsExecutor(driver, tab, "scrollIntoView", null);
		scriptsExecutor(driver, tab, "click", null);

		// scriptsExecutor(driver, searchTab, "sendkeys", "babyproduct");
		scrolUpDown(0, 500);

		WebElement sellElement = driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[3]"));

		mouseActions(driver, sellElement, null, "click");
		
		
		//window handling
//		handlingWindows(driver, 0);
//
//		addressNavigation(driver, "https://demoqa.com/alerts", "to");
//		pageHeadline(driver, "title");
//
//		addressNavigation(driver, null, "backward");
//		addressNavigation(driver, null, "forward");
//		addressNavigation(driver, null, "refresh");
//
//		scrolUpDown(0, 500);
//		WebElement seeAlert = driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
//		clickElement(driver, seeAlert);
//		popUpScreen(driver, "simple", null, null);
//
//		WebElement confirmBox = driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
//		clickElement(driver, confirmBox);
//		popUpScreen(driver, "confirm", "dismiss", null);
//		clickElement(driver, confirmBox);
//		popUpScreen(driver, "confirm", "accept", null);
//		
		
//		WebElement promptBox = driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
//		
//		clickElement(driver, promptBox);
//		popUpScreen(driver, "prompt", null, "ROSSIE");
//		popUpScreen(driver, "simple", null, null);
//		
//		addressNavigation(driver, "https://demoqa.com/frames", "to");
//		scrolUpDown(0, 500);
//		
//		exitBrowser(driver, "quit");

	}

}
