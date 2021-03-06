package com.test.news.cucumberTest.pages;

import androidx.test.rule.ActivityTestRule;

import com.test.news.R;
import com.test.news.features.login.presentation.LoginActivity;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class LoginPage {

    public void launchLoginScreen(ActivityTestRule<LoginActivity> testRule) {
        testRule.launchActivity(null);
    }

    public static void AddUserName(String userName) {
        onView(withId(R.id.editTextUserName))
                .perform(clearText(), typeText(userName));
    }

    public static void AddPassword(String password) {
        onView(withId(R.id.editTextPassword))
                .perform(clearText(), typeText(password));
    }
    public static void ClickOnLogin() {
        onView(withId(R.id.buttonLogin))
                .perform(click());
    }

    public static void  LoginToApplication(String userName, String password) {
        AddUserName(userName);
        AddPassword(password);
        ClickOnLogin();
    }

}
