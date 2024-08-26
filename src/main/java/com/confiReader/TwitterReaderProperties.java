package com.confiReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TwitterReaderProperties {

	static Properties pro;

	static FileInputStream fis;

	private Properties twitterReadFile() {

		try {
			File file = new File(
					"D:\\Ashlyn class\\JAVA\\eclipse\\A1\\IPTClasses\\src\\main\\java\\com\\configProperties\\Twitter.Properties");
			pro = new Properties();

			fis = new FileInputStream(file);

			pro.load(fis);

			return pro;
		} catch (Exception e) {
			e.printStackTrace();

			System.err.println("ERROR IN THE TWITTERREADFILE METHOD");
		}
		return null;

	}

	public String getBrowser() {

		String browser = twitterReadFile().getProperty("Browser");
		return browser;

	}

	public String getUrl() {
		String url = twitterReadFile().getProperty("Url");
		return url;
	}

	public String getEmail() throws IOException {

		String inputEmail = twitterReadFile().getProperty("Email");
		return inputEmail;

	}

	public String InputName() {
		String InputFullName = twitterReadFile().getProperty("FullName");
		return InputFullName;
	}

	public String inputUserName() {
		String inputUserName = twitterReadFile().getProperty("UserName");
		return inputUserName;
	}

	public String getpassword() throws IOException {

		String inputpassword = twitterReadFile().getProperty("Password");
		return inputpassword;

	}

}
