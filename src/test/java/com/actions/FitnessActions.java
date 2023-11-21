package com.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.locators.FitnessLocators;
import com.utility.Helper_Class;

public class FitnessActions {
	FitnessLocators FitnessLocators = null;
	int size = 0;
	Actions act = null;
	Select sel = null;

//Constructor
	public FitnessActions() {
		FitnessLocators = new FitnessLocators();
		PageFactory.initElements(Helper_Class.getDriver(), FitnessLocators);
		act = new Actions(Helper_Class.getDriver());

	}

//Methods for the actions
	public void selectFitness() {
		act.moveToElement(FitnessLocators.fit).perform();
	}

	public void selectcycle() {
		act.moveToElement(FitnessLocators.cycle).click().build().perform();
	}

	public void sort() {
		sel = new Select(FitnessLocators.sort);
		sel.selectByIndex(1);
	}

	public void selectBrand() {
		FitnessLocators.brand.click();
	}

	public void printList() {
		List<WebElement> element = Helper_Class.getDriver().findElements(By.xpath(FitnessLocators.listPath));
		size = element.size();
		System.out.println("Count of products diplayed = " + size);
		for (WebElement element1 : element) {
			System.out.println("Product Name :" + element1.getText());
		}
	}
}
