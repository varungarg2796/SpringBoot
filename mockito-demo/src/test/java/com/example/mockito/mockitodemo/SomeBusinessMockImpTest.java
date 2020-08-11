package com.example.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessMockImpTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[] {24,15,3};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
        SomeBusinessImp businessImp = new SomeBusinessImp(new DataServiceStub());
        int result = businessImp.findTheGreatestFromAllData();
        assertEquals(24, result);
    }


}

