package com.mahipal.calculator.espressotests

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Mahipal on 21/8/20
 */

@RunWith(AndroidJUnit4::class)
class CalculationTests {

    @Test
    fun execute_FirstTest() {
        val calculateScreen = CalculateScreen()

        calculateScreen.start()
            .pressNumber("5")
            .pressNumber("6")
            .pressOperation("+")
            .pressNumber("9")
            .pressNumber("2")
            .pressOperation("-")
            .pressNumber("2")
            .pressNumber("3")
            .pressEqual()
            .verifyTextDisplay("125.0")
    }

    @Test
    fun execute_SecondTest() {
        val calculateScreen = CalculateScreen()

        calculateScreen.start()
            .pressNumber("2")
            .pressNumber("0")
            .pressOperation("*")
            .pressNumber("8")
            .pressNumber("9")
            .pressOperation("/")
            .pressNumber("5")
            .pressNumber("2")
            .pressOperation("+")
            .pressNumber("5")
            .pressNumber("2")
            .pressEqual()
            .verifyTextDisplay("17.115385")
    }
}