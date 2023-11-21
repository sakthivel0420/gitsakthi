package com.StepDefinition;

import com.actions.FitnessActions;
import com.utility.Helper_Class;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FitnessStepDefinition {
	FitnessActions FA = new FitnessActions();

	@When("User selects fitness")
	public void user_selects_fitness() {
		FA.selectFitness();
		Helper_Class.log.info("User selects the fitness option");
	}

	@When("User selects the cycle option")
	public void user_selects_the_cycle_option() {
		FA.selectcycle();
		Helper_Class.log.info("User selects the cycle option");
	}

	@When("User sorts the product to low to high")
	public void user_sorts_the_product_to_low_to_high() {
		FA.sort();
		Helper_Class.log.info("User Sorts the product to low to high");
	}

	@When("User selects the Giants brand")
	public void user_selects_the_giants_brand() {
		FA.selectBrand();
		Helper_Class.log.info("User selects the Giants Brand");
	}

	@Then("User verifies the number of products displayed")
	public void user_verifies_the_number_of_products_displayed() throws InterruptedException {
		Thread.sleep(3000);
		FA.printList();
		Helper_Class.log.info("User verifies the number of products displayed");
	}

}
