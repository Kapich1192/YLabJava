package com.YlabTasks.YlabTasks.lections.lesson2.Task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void max() {
        int actual = Solution.max(2,3);
        int extended = 3;
        assertEquals(actual,extended);
    }
}