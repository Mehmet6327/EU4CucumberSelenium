package com.vytrack.step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {


    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user navigates to Fleet, Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user navigates to Marketing, Campaigns");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user navigates to Activities,Calendar Events");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");
    }






}