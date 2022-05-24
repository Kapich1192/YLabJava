package com.YlabTasks.YlabTasks.lections.lesson2.Task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOfFourNumbersTest {

    @Test
    void min() {
        int actual = MinimumOfFourNumbers.min(2,3,6,8);
        int extended = 2;
        assertEquals(extended,actual);
    }
}