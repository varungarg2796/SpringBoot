package com.example.spring.basics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BinarySearchImpl {

    @Autowired //below is the dependency that is binarysearchimpl depends on sortalgorithm
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int [] numbers, int numberToSearch) {
        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        return 1;
    }

    @PostConstruct
    public void postConstruct() {
        
    }
}
