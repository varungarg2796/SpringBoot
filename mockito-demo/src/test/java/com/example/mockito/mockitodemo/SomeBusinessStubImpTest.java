package com.example.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImpTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImp businessImp = new SomeBusinessImp(new DataServiceStub());
        int result = businessImp.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements  DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] { 24, 5 , 15};
    }
}