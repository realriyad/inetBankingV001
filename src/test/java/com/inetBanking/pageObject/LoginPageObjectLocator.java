package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.testCases.BaseClass;


public class LoginPageObjectLocator {

	public  WebDriver  driver;


	//page factory
	@FindBy (xpath="//*[@id=\"ap_email\"]")
	WebElement signInLink;

	@FindBy (xpath = "//*[@id=\"ap_email\"]")
	WebElement email;

	@FindBy (id="continue")
	WebElement continueButton;

	@FindBy (xpath="//*[@id=\"auth-error-message-box\"]/div")
	WebElement errorText;

	@FindBy (xpath="//input[@id='ap_password']")
	WebElement Password;

	@FindBy (id="signInSubmit")
	WebElement submitButton;

	@FindBy (id="twotabsearchtextbox")
	WebElement searchBar;

	@FindBy (id="nav-search-submit-button")
	WebElement submitSearch;

	

public LoginPageObjectLocator(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


	//action method
	
	public void getSignIn() {
		signInLink.click();
	}
	public void setUserName(String username) {
		email.sendKeys(username);
	}
	public void continueButton() {
		continueButton.click();
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}
	public void submit() {
		submitButton.click();
	}


}

