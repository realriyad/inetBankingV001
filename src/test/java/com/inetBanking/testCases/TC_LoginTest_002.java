package com.inetBanking.testCases;







import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPageObjectLocator;

public class TC_LoginTest_001 extends BaseClass {



	@Test
	public void loginTestWithValidData() throws InterruptedException {
		LoginPageObjectLocator lpoj =PageFactory.initElements(driver, LoginPageObjectLocator.class);
		
		logger.info("Opening application");
		lpoj.setUserName(username);
		logger.info("Entered username");

		lpoj.continueButton();
		lpoj.setPassword(password);
		logger.info("Entered password");

		lpoj.submit();

		String title = driver.getTitle();
		//Assert.assertEquals(title, expectedTitle);
		if(title.equals(expectedTitle)) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login Test Failed");

		}



	}


}
