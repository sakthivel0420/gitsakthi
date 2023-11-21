package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetToKnowUsStepLocators {
	
	
	@FindBy(xpath ="//*[@id=\"footer\"]/div[1]/div[2]/div/div/div[2]/ul[1]/li[2]/a")
	public WebElement about;
	@FindBy(css = "a[href='//www.sportsjam.in/Contactus']")
	public WebElement contact;
	@FindBy(xpath="//ul[@class='utilitynav']//child::a[text()='Inquiry / Feedback']")
	public WebElement inquiry;
	@FindBy(xpath="//ul[@class='utilitynav']//parent::a[text()='Sportsjam Team']")
	public WebElement team;
	
	
	
	
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_ctl00_Pane1\"]/div/div[2]/div/p[2]/strong[1]")
	public WebElement aboutcheck;
	@FindBy(xpath="//div[@class='subheading_r']//child::h2[text()='Inquiry & Feedback Form']")
	public WebElement contactcheck;
	@FindBy(xpath="//h2[text()='Inquiry & Feedback Form Details']")
	public WebElement inquirycheck;
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_ctl00_Pane1\"]/div/div[2]/div/p[5]/span/span")
	public WebElement teamcheck;

}
