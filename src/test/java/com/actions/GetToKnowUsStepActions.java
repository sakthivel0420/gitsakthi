package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.GetToKnowUsStepLocators;
import com.utility.Helper_Class;

public class GetToKnowUsStepActions {
	GetToKnowUsStepLocators Get = null;

	public GetToKnowUsStepActions() {
		Get = new GetToKnowUsStepLocators();
		PageFactory.initElements(Helper_Class.getDriver(), Get);
	}

	public void clickabout() {
		Get.about.click();
	}

	public void clickcontact() {
		Get.contact.click();
	}

	public void clickinquiry() {
		Get.inquiry.click();
	}

	public void clickteam() {
		Get.team.click();
	}

	public String VerifyTextabout() {
		return Get.aboutcheck.getText();
	}

	public String VerifyTextcontact() {
		return Get.contactcheck.getText();
	}

	public String VerifyTextinquiry() {
		return Get.inquirycheck.getText();
	}

	public String VerifyTextteam() {
		return Get.teamcheck.getText();
	}

	public void changetab() {
		for (String tab : Helper_Class.getDriver().getWindowHandles()) {
			Helper_Class.getDriver().switchTo().window(tab);
		}
	}

	public void scroll() {
		Helper_Class.jse.executeScript("window.scrollBy(0,500)");
	}

	public void scrollAll() {
		Helper_Class.jse.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
	}

}
