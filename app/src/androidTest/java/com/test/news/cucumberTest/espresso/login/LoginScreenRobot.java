package com.test.news.cucumberTest.espresso.login;

import androidx.test.rule.ActivityTestRule;

import com.test.news.features.login.presentation.LoginActivity;

public class LoginScreenRobot {

    public void launchLoginScreen(ActivityTestRule<LoginActivity> testRule) {
        testRule.launchActivity(null);
    }

}
