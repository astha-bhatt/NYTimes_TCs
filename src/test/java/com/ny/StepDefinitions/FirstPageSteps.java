package com.ny.StepDefinitions;

import org.testng.Assert;

import com.ny.CoreFunctions.CoreFunctions;
import com.ny.PageObjects.NYHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstPageSteps {
	
	@When("user clicks on The Todays Paper link")
	public void user_clicks_on_the_todays_paper_link() {
		CoreFunctions.click(NYHomePage.todaysPaper(), "click on Today's Paper link");
	}
	

	@Then("user lands on The Todays Paper section")
	public void user_lands_on_the_front_page() {
		Assert.assertEquals(NYHomePage.todaysPaperSection().getText(), "Today’s Paper");
	}

}
