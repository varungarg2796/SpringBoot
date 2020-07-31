package com.example.spring.basics;

import org.springframework.stereotype.Component;

@Component // this is a bean
public class BubbleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
