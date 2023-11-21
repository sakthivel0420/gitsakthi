package com.StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

//import java.util.List;
//import java.util.Map;

import org.testng.Assert;

import com.actions.LoginActions;
import com.utility.ExcelReader;
import com.utility.Helper_Class;
import com.utility.properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	LoginActions LA = new LoginActions();
	properties pro = new properties();
	ExcelReader el = new ExcelReader();

	@Given("user is in the home page of sportsjam")
	public void user_is_in_the_home_page_of_sportsjam() {
		Helper_Class.openPage(pro.url);
		Helper_Class.log.info("User is in the home page.");

	}

	@Given("User clicks the log in button")
	public void user_clicks_the_log_in_button() {
		LA.clickSignIn();
		Helper_Class.log.info("User clicks one the login button");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		LA.signButton();
		Helper_Class.log.info("User clicks ont the login button");
	}

	@Then("User is shown looged in to the website")
	public void user_is_shown_looged_in_to_the_website() {
		Assert.assertTrue(LA.getVerifyText2().contains("Logout"));
		Helper_Class.log.info("User is shown the loggen in message");
		LA.logout();
	}

	@Then("User is shown No customer account found message")
	public void user_is_shown_no_customer_account_found_message() {
		Assert.assertTrue(
				LA.getVerifyText1().contains("There is no account existing with the details mentioned by you."));
		Helper_Class.log.info("User is shown no existing account message ");
	}

	@When("User clicks the forrgot password button")
	public void user_clicks_the_forrgot_password_button() {
		LA.ForgorPass();
		Helper_Class.log.info("User clicks forgot password");
	}

	@When("User gives valid emailid")
	public void user_gives_valid_emailid() {
		LA.username(pro.vaild_email);
		Helper_Class.log.info("User enters the valid email id");
	}

	@When("user enter the details using sheetname  {string} and rownumber {int}")
	public void user_enter_the_details_using_sheetname_and_rownumber(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = el.getData("C:\\Users\\ssenthilvel\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\Features\\ExcelReaderSheet.xlsx",sheetname);
		String skill = testdata.get(rownumber).get("email");
		LA.username(skill);
		Helper_Class.log.info("User takes values from an excel sheet to enter the email address");
	}

	@When("the user clicks submit")
	public void the_user_clicks_submit() {
		LA.submit();
		Helper_Class.log.info("User clicks the submit button");
	}

	@Then("a pop is shown with a message sucessfully sent recovery email")
	public void a_pop_is_shown_with_a_message_sucessfully_sent_recovery_email() {
		Assert.assertTrue(
				LA.getVerifyText().contains("Successfully sent the password reset link To the registered email."));
		Helper_Class.log.info("User is sent a password recovery mail to the registed mail id");
	}

	@When("User gives valid Credentials")
	public void user_gives_valid_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		LA.credentials(dataTable);

		Helper_Class.log.info("User enters valid credentials ");
	}

	@When("User gives Invalid Credentials")
	public void user_gives_invalid_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		LA.credentials(dataTable);
		Helper_Class.log.info("User enters invalid credentials ");
	}
}
