package com.example.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImpMockitoAnnotationTest {
    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImp businessImp;

    @Test
    public void testFindTheGreatestFromAllData() {
        //dataServiceMock.retrieveAllData() => new int[] {24,15,3};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
        int result = businessImp.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}