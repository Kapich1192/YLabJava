package com.YlabTasks.YlabTasks.lections.lesson3.Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheSumOfTenNumbersTest {

    @Test
    void sumOfNumbers() {
        int actual = TheSumOfTenNumbers.sumOfNumbers(3);
        int expected = 6;
        assertEquals(actual,expected);
    }
}