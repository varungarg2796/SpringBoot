package com.example.spring.basics;

import com.example.spring.basics.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
    // What are the beans?
    // What are the dependencies?
    // Where to search for beans?

    public static void main(String[] args) {


        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        // ApplicationContext manages the beans
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6, 7}, 4);
        System.out.println(result);

    }

}
