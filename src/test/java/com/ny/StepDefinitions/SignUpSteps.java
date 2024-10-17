package com.ny.StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.ny.BrowserInstance.BrowserHandle;
import com.ny.CoreFunctions.CoreFunctions;
import com.ny.PageObjects.NYHomePage;
import com.ny.PageObjects.NYLoginPage;
import com.ny.TestUtils.Excel;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps extends BrowserHandle {
	
	@When("user clicks on Login icon")
	public void user_clicks_on_login_icon() throws InterruptedException {

		Thread.sleep(2000);
		CoreFunctions.click(NYHomePage.loginIcon(), "click on login");
	}
	
	@When("user enters a emailID")
	public void user_enters_a_emailID () throws InterruptedException, IOException {
		
		Excel reader = new Excel();
		List<Map<String, String>> testdata = reader.getData("/nytimes-sample/src/test/resources/TestData.xlsx", "SignUpTestData");
		
		String emailId = testdata.get(0).get("Email");
		if (emailId != null)
			CoreFunctions.setText(NYLoginPage.email(), emailId);
		Thread.sleep(3000);
	
	}
	
	@When("user enters invalid emailID")
	public void user_enters_invalid_emailID() throws InterruptedException, IOException {
		Excel reader = new Excel();
		List<Map<String, String>> testdata = reader.getData("/nytimes-sample/src/test/resources/TestData.xlsx", "SignUpTestData");
		
		String emailId = testdata.get(1).get("Email");
		if (emailId != null)
			CoreFunctions.setText(NYLoginPage.email(), emailId);
		Thread.sleep(3000);
	}
	
		
	@When("user clicks on continue button on login page")
	public void user_clicks_on_continue_button() {
		CoreFunctions.click(NYLoginPage.continueIcon(), "Click on continue");
		
	}
	
	@Then("user gets an error message")
	public void user_gets_an_error_message () {
		Assert.assertEquals(NYLoginPage.error().getAttribute("value"), "Please enter a valid email address.");
		
	}
	
	@Then("an error message is displayed")
	public void an_error_message_is_displayed () {
		Assert.assertEquals(NYLoginPage.error().getAttribute("value"), "The email address or password you entered is incorrect. Please try again");
		
	}

	@When("user enters an invalid password")
	public void user_enters_password() throws InterruptedException, IOException {
		Excel reader = new Excel();
		List<Map<String, String>> testdata = reader.getData("/nytimes-sample/src/test/resources/TestData.xlsx", "SignUpTestData");
		
		String password = testdata.get(0).get("Password");
		if (password != null)
			CoreFunctions.setText(NYLoginPage.email(), password);
		Thread.sleep(3000);
	    
	}

	@When("user clicks on create account")
	public void user_clicks_on_create_account() {
		CoreFunctions.click(NYLoginPage.createAccount(), "click on create Account");		

	}	

}
