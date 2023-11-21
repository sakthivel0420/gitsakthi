package com.actions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.locators.LoginLocators;
import com.utility.Helper_Class;

public class LoginActions {

	LoginLocators LoginLocators = null;

	public LoginActions() {
		LoginLocators = new LoginLocators();
		PageFactory.initElements(Helper_Class.getDriver(), LoginLocators);
	}

	public void clickSignIn() {
		LoginLocators.signin.click();
	}

	public void setemail(String email) {
		LoginLocators.email.sendKeys(email);
	}

	public void setpass(String pass) {
		LoginLocators.pass.sendKeys(pass);
	}

	public void signButton() {
		LoginLocators.signButton.click();
	}

	public void ForgorPass() {
		LoginLocators.forgot.click();
	}

	public void username(String email) {
		LoginLocators.username.sendKeys(email);
	}

	public void submit() {
		LoginLocators.emailsubmit.click();
	}

	public void logout() {
		LoginLocators.check2.click();
	}

	public String getVerifyText() {
		return LoginLocators.check.getText();
	}

	public String getVerifyText1() {
		return LoginLocators.check1.getText();
	}

	public String getVerifyText2() {
		return LoginLocators.check2.getText();
	}

	public void Login(String email, String pass) {
		setemail(email);
		setpass(pass);
	}
	public void credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : signUpForm) {
			String email = data.get("email");
			String pass = data.get("pass");
			Login(email, pass);
		}
	}

}
