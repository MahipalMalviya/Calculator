package com.mahipal.calculator.espressotests

import androidx.test.rule.ActivityTestRule
import com.mahipal.calculator.CalculatorActivity
import org.junit.Rule
import android.widget.Button
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.allOf

import com.mahipal.calculator.R


/**
 * Created by Mahipal on 21/8/20
 */
class CalculateScreen {

    @Rule
    var mainActivityRule: ActivityTestRule<CalculatorActivity> =
        ActivityTestRule(CalculatorActivity::class.java, true, false)

    fun start(): CalculateScreen {
        mainActivityRule.launchActivity(null)

        return this
    }

    fun pressNumber(number: String): CalculateScreen {
        onView(withText(number))
            .perform(click())

        return this
    }

    fun pressOperation(operator: String): CalculateScreen {
        onView(withText(operator))
            .perform(click())

        return this
    }

    fun pressEqual(): CalculateScreen {
        onView(withId(R.id.buttonEqual))
            .perform(click())

        return this
    }

    fun verifyButtonIsDisplayed(text: String): CalculateScreen {
        onView(allOf(isAssignableFrom(Button::class.java), withText(text)))
            .check(matches(isDisplayed()))

        return this
    }

    fun verifyTextDisplay(text: String): CalculateScreen {
        onView(withId(R.id.tv_result))
            .check(matches(withText(text)))

        return this
    }

}