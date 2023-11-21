package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {

	@FindBy(xpath="//a[text()='Sign in']")
	public WebElement signin;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName")
	public WebElement email;
	@FindBy(xpath ="//*[@id=\"ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password\"]")
	public WebElement pass;
	@FindBy(id="ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton")
	public WebElement signButton;
	@FindBy(linkText = "Forgot Password")
	public WebElement forgot;
	@FindBy(xpath = "//*[@id=\"txtUserName\"]")
	public WebElement username;
	
	@FindBy(id = "lblError")
	public WebElement check;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_FailureText")
	public WebElement check1;
	@FindBy(css = "a[href='https://www.sportsjam.in/LogOut.aspx']")
	public WebElement check2;
	@FindBy(id = "btnsubmit")
	public WebElement emailsubmit;
	

}
