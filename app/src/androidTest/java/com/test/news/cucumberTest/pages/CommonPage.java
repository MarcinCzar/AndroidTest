package com.test.news.cucumberTest.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class CommonPage {

    public static void isLabelDisplayed(String value) {
        onView(withText(value))
                .check(matches(isDisplayed()));
    }

}
