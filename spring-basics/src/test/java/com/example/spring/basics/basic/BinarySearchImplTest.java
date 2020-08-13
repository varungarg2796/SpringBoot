package com.example.spring.basics.basic;

import com.example.spring.basics.SpringBasicsApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


// Load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringBasicsApplication.class)
class BinarySearchImplTest {

    //Get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        // call method on binary search
        // check if it is correct
        int result = binarySearch.binarySearch(new int[] {}, 5);
        assertEquals(1,result);
    }
}