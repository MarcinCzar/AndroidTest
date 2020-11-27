package com.test.news.cucumberTest.pages;

import com.test.news.R;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class NewsPage {

    public static void ImageIsDisplayed() {
        onView(withId(R.id.imageView))
                .check(matches(isDisplayed()));
    }

    public static void ClickOnImage() {
        onView(withId(R.id.imageView))
                .perform(click());
    }

}
