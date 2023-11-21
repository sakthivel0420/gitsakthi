package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FitnessLocators {
	
	
	@FindBy(xpath = "//span[@class=\"main_navbtn_m\" and contains(text(),'Fitness')]")
	public WebElement fit;
	@FindBy(xpath = "//a[@href=\"https://www.sportsjam.in/cycles\" and contains(text(),'Cycles')]//parent::li//parent::ol/li/a")
	public WebElement cycle;
	@FindBy(id="drpSort")
	public WebElement sort;
	@FindBy(xpath="//a[@title='Go to Giant']//parent::td")
	public WebElement brand;
	
	
	
	public String listPath ="//div[@class='bucket_left']/h4";

}
