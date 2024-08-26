package com.IPTClasses;

import com.POM.TwitterCreatePage;
import com.POM.TwitterForgotPage;
import com.POM.TwitterLoginPAge;
import com.confiReader.TwitterReaderProperties;

public class TwitterRunnerClass extends BaseClass {

	public static void main(String[] args) {

		TwitterReaderProperties TwitterReaderProperties = new TwitterReaderProperties();

		browserLaunch(TwitterReaderProperties.getBrowser());
		launchUrl(TwitterReaderProperties.getUrl());
		waitconcepts(30);

//		TwitterCreatePage TwitterCreatePage  = new TwitterCreatePage(driver);
//		TwitterCreatePage.getTwit();

//		TwitterLoginPAge TwitterLoginPAge = new TwitterLoginPAge(driver);
//		TwitterLoginPAge.gettwitlogin();
//		

		TwitterForgotPage TwitterForgotPage = new TwitterForgotPage(driver);
		TwitterForgotPage.getTwitterForgot();

	}
}
