package com.test.news.cucumberTest.espresso.login

import androidx.test.rule.ActivityTestRule
import com.test.news.features.login.presentation.LoginActivity

class LoginScreenRobot {

    fun launchLoginScreen(testRule: ActivityTestRule<LoginActivity>) {
        testRule.launchActivity(null)
    }

}
