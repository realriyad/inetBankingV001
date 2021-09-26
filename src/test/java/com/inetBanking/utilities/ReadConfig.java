package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		
		}catch (Exception exp) {
			System.out.println("Exception is"+ exp.getMessage());

		}

	}
	
	public String getApplicatioURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String  username= pro.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getExpectedTitle() {
		String expectedTitle = pro.getProperty("expectedTitle");
		return expectedTitle;
	}
	
	public String getFirefox() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getEdgepath() {
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
	
	

}

