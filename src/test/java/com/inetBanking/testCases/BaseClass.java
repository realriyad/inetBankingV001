package com.inetBanking.testCases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicatioURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getpassword();
	public String expectedTitle = readconfig.getExpectedTitle();
	public static  WebDriver  driver;

	public static Logger  logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		logger=Logger.getLogger("Amazon");
		PropertyConfigurator.configure("log4j.properties");

		if(br.equals("edge")) {
			System.setProperty("webdriver.edge.driver",readconfig.getEdgepath());
			driver = new EdgeDriver();
		}
		else if(br.equals("firefox")){
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefox());
			driver = new FirefoxDriver();
		
		}
		else if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			driver = new ChromeDriver();
		}

		driver.get(baseURL);
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
