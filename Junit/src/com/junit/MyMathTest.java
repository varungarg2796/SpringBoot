package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {


    @Before
    public void before() {
        System.out.println("This will run before every test");
    }

    @After
    public void after() {
        System.out.println("This will run after every test");
    }

    // @BeforeClass and @AfterClass should be static

    @Test
    void sumWith3Numbers() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {1,2,3});
        assertEquals(6, result);
    }

    @Test
    void sumWith1Number() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {1});
        assertEquals(1, result);
        // assertTrue(condition);
        // assertFalse(condition);
        // Check out the whole assert library!
    }
}