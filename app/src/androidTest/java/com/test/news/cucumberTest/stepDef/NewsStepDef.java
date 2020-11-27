package com.test.news.cucumberTest.stepDef;

import com.test.news.cucumberTest.Page.LoginPage;
import com.test.news.cucumberTest.Page.NewsPage;
import com.test.news.cucumberTest.Page.CommonPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewsStepDef {

    @Given("^the (\\S+) successfully logged in to the app using (\\S+)$")
        public void the_user_successfully_logged_in_to_the_app_using_password(String userName, String password) {
            LoginPage.LoginToApplication(userName, password);
        }


    @Then("^images are displayed in the rows on the list$")
        public void images_are_displayed_in_the_rows_on_the_list() {

        }

    @When("^there is no internet connection$")
        public void there_is_no_internet_connection() {

    }

    @Then("^(\\S+) is displayed and Retry button$")
    public void error_is_displayed_and_Retry_button(String errorMessage) {
        CommonPage.isLabelDisplayed(errorMessage);
    }

    @When("^the news images are successfully loaded on the screen$")
    public void the_news_images_are_successfully_loaded_on_the_screen() {

    }

    @When("^the user clicks one of the image$")
    public void the_user_clicks_one_of_the_image(){

    }

    @Then("^user is navigated to the external browser with clicked image loaded$")
    public void user_is_navigated_to_the_external_browser_with_clicked_image_loaded(){

    }

}
