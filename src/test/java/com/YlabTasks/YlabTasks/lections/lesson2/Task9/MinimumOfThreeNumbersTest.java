package com.YlabTasks.YlabTasks.lections.lesson2.Task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOfThreeNumbersTest {

    @Test
    void min() {
        int actual = MinimumOfThreeNumbers.min(5,4,3);
        int extended = 3;
        assertEquals(actual,extended);
    }
}