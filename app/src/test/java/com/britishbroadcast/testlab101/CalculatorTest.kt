package com.britishbroadcast.testlab101

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    @Before
    fun setUp() {
    }

    @Test
    fun `test multiplication`(){
        assertEquals(4, Calculator.multiplication(2,2))
        assertNotEquals(4, Calculator.multiplication(5,2))
    }

    @Test
    fun `test addition`(){
        assertEquals(0, Calculator.addition(-2,2))
        assertEquals(-1, Calculator.addition(5,-6))
        assertEquals(5, Calculator.addition(-5,10))
        assertEquals(7, Calculator.addition(7,0))
        assertEquals(3000, Calculator.addition(1000,2000))
        assertEquals(0, Calculator.addition(0,0))
        assertNotEquals(11, Calculator.addition(1,1))
        assertEquals(-11, Calculator.addition(-5,-6))
        assertEquals(-2, Calculator.addition(0,-2))
    }

    @Test
    fun `test subtractions`(){
        assertEquals(0, Calculator.subtraction(2,2))
        assertEquals(-4, Calculator.subtraction(-2,2))
        assertEquals(4, Calculator.subtraction(2,-2))
        assertEquals(-2, Calculator.subtraction(0,2))
        assertEquals(2, Calculator.subtraction(2,0))
        assertEquals(0, Calculator.subtraction(-2,-2))
        assertEquals(0, Calculator.subtraction(0,0))
        assertEquals(2, Calculator.subtraction(0,-2))
    }
    @After
    fun tearDown() {
    }
}