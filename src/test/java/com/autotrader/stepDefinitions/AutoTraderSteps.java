package com.autotrader.stepDefinitions;


import com.autotrader.pages.AutoTraderPage;
import com.autotrader.utilities.CommonMethods;
import com.autotrader.utilities.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AutoTraderSteps extends CommonMethods {
    @Given("User is in landing page")
    public void user_is_in_landing_page() {

    }

    @Then("^I clicked on used cars on the home page$")
    public void i_Clicked_On_Used_Cars_On_The_HomePage() {
//        MyDriver.get().manage().deleteAllCookies();
        autoTraderPage.clickOnUsedCars();
    }
}
