package com.ny.StepDefinitions;

import org.testng.Assert;

import com.ny.BrowserInstance.BrowserHandle;
import com.ny.CoreFunctions.CoreFunctions;
import com.ny.PageObjects.NYHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OtherSectionSteps extends BrowserHandle {
	
	@When("user clicks on games section")
	public void user_clicks_on_games_section () {
		CoreFunctions.click(NYHomePage.gamesIcon(), "Click on Games section");
		
	}
	
	@Then("user lands on the spelling bee in games section")
	public void user_lands_on_section () {
		Assert.assertEquals(NYHomePage.gamesSection().getText(), "Spelling Bee");
		
	}

}
