package com.example.spring.basics.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //using component and primary so that multiple components can be added
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
