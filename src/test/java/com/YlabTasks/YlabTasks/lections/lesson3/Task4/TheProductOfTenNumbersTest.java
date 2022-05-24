package com.YlabTasks.YlabTasks.lections.lesson3.Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheProductOfTenNumbersTest {

    @Test
    void factorial() {
        int actual = TheProductOfTenNumbers.factorial(3);
        int expected = 6;
        assertEquals(expected,actual);

    }
}