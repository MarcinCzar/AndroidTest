package com.test.news.cucumberTest.stepDef;

import androidx.test.rule.ActivityTestRule;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.test.news.cucumberTest.pages.CommonPage;
import com.test.news.cucumberTest.pages.LoginPage;
import com.test.news.cucumberTest.pages.NewsPage;
import com.test.news.features.login.presentation.LoginActivity;

public class LoginStepDef {

    private LoginPage login = new LoginPage();

    private ActivityTestRule<LoginActivity> activityRule = new ActivityTestRule<>(LoginActivity.class);

    @Given("^the user opens app for the first time$")
    public void the_user_opens_app_for_the_first_time() {
        login.launchLoginScreen(activityRule);
    }

    @Then("^login screen with (\\S+) and (\\S+) entries and (\\S+) is displayed$")
    public void login_screen_with_user_and_password_entries_and_login_button_is_displayed(String userLabel, String passwordLabel,String buttonLabel) {
        CommonPage.isLabelDisplayed(userLabel);
        CommonPage.isLabelDisplayed(passwordLabel);
        CommonPage.isLabelDisplayed(buttonLabel);
    }

    @Given("^the user provided (\\S+) and (\\S+)$")
    public void the_user_provided_name_and_password(String userName, String password) {
        LoginPage.AddUserName(userName);
        LoginPage.AddPassword(password);
    }

    @When("^login button is clicked$")
    public void login_button_is_clicked() {
        LoginPage.ClickOnLogin();
    }

    @Then("^error (\\S+) are displayed by user name and password entries$")
    public void error_markers_are_displayed_by_user_name_and_password_entries(String errorLabel) {
        CommonPage.isLabelDisplayed(errorLabel);
    }

    @Then("^user is taken to the news screen$")
    public void user_is_taken_to_the_news_screen() {
        NewsPage.ImageIsDisplayed();
    }

    @Given("^user opens app next time$")
    public void user_opens_app_next_time(){
        //to do
    }

}
