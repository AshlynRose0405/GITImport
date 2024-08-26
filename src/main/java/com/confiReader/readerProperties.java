package com.confiReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readerProperties {


	static Properties pro;
//
static FileInputStream fis;

	



private Properties readFile() throws IOException {

		File file = new File(
				"D:\\Ashlyn class\\JAVA\\eclipse\\A1\\IPTClasses\\src\\main\\java\\com\\configProperties\\demoLogin.properties");

		//key =value
		
		
		 fis = new  FileInputStream(file);
		 
		pro = new Properties();
		 
		//fis = new FileInputStream(file);
		
		//pro = new Properties();

		
		pro.load(fis);

		return pro;

	}

	public String getBrowser() throws Exception  {
		
		
		String browser =readFile().getProperty("browser"); 

	   return browser;

	}

	public String getUrl() throws IOException {

		String launchUrl = readFile().getProperty("url");
		return launchUrl;

	}

	public String getEmail() throws IOException {

		String inputEmail = readFile().getProperty("email");
		return inputEmail;

	}

	public String getpassword () throws IOException {

		String inputpassword = readFile().getProperty("password");
		return inputpassword ;

	}

}
