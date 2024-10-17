package com.ny.StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.ny.BrowserInstance.BrowserHandle;
import com.ny.PageObjects.NYHomePage;
import com.ny.TestUtils.Excel;
import com.ny.CoreFunctions.CoreFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BrowserHandle {

	@Given("user clicks on continue")
	public void user_clicks_on_continue() {
		CoreFunctions.click(NYHomePage.continueIcon(), "Click on continue icon.");
	}

	@When("user clicks on search icon")
	public void user_clicks_on_search_icon() {
	CoreFunctions.click(NYHomePage.searchIcon(), "Click on search icon.");
	}
	
	@When("user enters keyword {string} and rownumber {int}")
	public void user_enters_sheetname_and_rownumber(String string, Integer int1) throws IOException {
		Excel reader = new Excel();
		List<Map<String, String>> testdata = reader.getData("/nytimes-sample/src/test/resources/TestData.xlsx", string);
		
		String searchResult = testdata.get(int1).get("SearchKeyword");
		if (searchResult != null)
			CoreFunctions.setText(NYHomePage.enterText(), searchResult);
	}

	@When("user clicks on Go")
	public void user_clicks_on_go() throws InterruptedException {
		CoreFunctions.click(NYHomePage.go(), "click on Go");
	}

	@Then("user is able to see information related to the keyword")
	public void user_is_able_to_see_information_related_to_the_keyword() {
	   
	   Assert.assertEquals(NYHomePage.searchResult().getAttribute("value"), "Trump");
	}

}
