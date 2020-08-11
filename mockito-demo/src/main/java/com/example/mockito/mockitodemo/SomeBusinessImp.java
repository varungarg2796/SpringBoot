package com.example.mockito.mockitodemo;

public class SomeBusinessImp {
    private DataService dataService;

    public SomeBusinessImp(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }

}

