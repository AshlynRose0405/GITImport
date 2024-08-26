package com.IPTClasses;

import com.POM.demoLoginPage;
import com.confiReader.readerProperties;

public class demoLoginRunnerClass extends BaseClass {

	public static void main(String[] args) throws Exception {
		readerProperties rp = new readerProperties();

		browserLaunch(rp.getBrowser());

		browserLaunch(rp.getBrowser());
		launchUrl(rp.getUrl());

		demoLoginPage demo = new demoLoginPage(driver);

		demo.getDemoLogin();

	}

}
