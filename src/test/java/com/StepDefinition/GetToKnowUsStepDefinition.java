package com.StepDefinition;
import org.testng.Assert;

import com.actions.GetToKnowUsStepActions;
import com.utility.Helper_Class;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class GetToKnowUsStepDefinition {
	GetToKnowUsStepActions getAct = new GetToKnowUsStepActions();
	
	@When("User clicks About us")
	public void user_clicks_about_us() {
		getAct.scrollAll();
		getAct.clickabout();
		Helper_Class.log.info("User clicks the about us option");
	} 


	@Then("Hello  Strikers message is shown")
	public void hello_strikers_message_is_shown() {
		getAct.changetab();
	   		Assert.assertTrue(getAct.VerifyTextabout().contains("Hello  Strikers!"));
	   		Helper_Class.log.info("User is shown Hello Striker message");
	}

	@When("User clicks contact us")
	public void user_clicks_contact_us() {
		getAct.scrollAll();
		getAct.clickcontact();
		Helper_Class.log.info("User clicks the contach us option");
	}

	@Then("Sportsjam.in Showrooms message is shown")
	public void sportsjam_in_showrooms_message_is_shown() {
		getAct.changetab();
		Assert.assertTrue(getAct.VerifyTextcontact().contains("Inquiry & Feedback Form"));
		Helper_Class.log.info("User is shown Inquiry & Feedback Form option");
	}

	@When("User clicks inqury\\/feedback")
	public void user_clicks_inqury_feedback() {
		getAct.scrollAll();
		getAct.clickinquiry();
		Helper_Class.log.info("User clicks the inqury/feedback option");
	}
	@Then("Sportsjam.in Showrooms message is showns")
	public void sportsjam_in_showrooms_message_is_showns() {
		getAct.changetab();
		Assert.assertTrue(getAct.VerifyTextinquiry().contains("Inquiry & Feedback Form Details"));
		Helper_Class.log.info("User is shown ");
	}

	@When("User clicks sportsjam team")
	public void user_clicks_sportsjam_team() {
		getAct.scrollAll();
		getAct.clickteam();
		Helper_Class.log.info("User clicks the option Inquiry & Feedback Form Details option");
	}

	@Then("WHO WE ARE @ SPORTSJAM.IN message is shown")
	public void who_we_are_sportsjam_in_message_is_shown() {
		getAct.changetab();
		Assert.assertTrue(getAct.VerifyTextteam().contains("At Sportsjam.in, he leads Operations & Business Development."));
		Helper_Class.log.info("User is shown At Sportsjam.in, he leads Operations & Business Development. message");
	}


}
