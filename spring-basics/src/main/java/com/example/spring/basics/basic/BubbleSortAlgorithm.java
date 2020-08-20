package com.example.spring.basics.basic;

import org.springframework.stereotype.Component;

@Component // this is a bean
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
