package com.britishbroadcast.testlab101

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    @JvmField
    @Rule
    val mainTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)
    val inputText = "The beginning is far. The beginning is far."

    @Test
    fun testForUIInput(){
        Espresso.onView(withId(R.id.input_edittext)).perform(ViewActions.typeText(inputText))
        Espresso.onView(withId(R.id.input_edittext)).check(matches(withText(inputText)))
    }

    @Test
    fun testForUIOutputTextChange(){
        Espresso.onView(withId(R.id.input_edittext)).perform(ViewActions.typeText(inputText))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.input_button)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.outpup_textview)).check(matches(withText(inputText)))
    }

    @Test
    fun testForSecondActivityOpening(){
        Espresso.onView(withId(R.id.next_button)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.second_textview)).check(matches(ViewMatchers.isDisplayed()))

    }
}