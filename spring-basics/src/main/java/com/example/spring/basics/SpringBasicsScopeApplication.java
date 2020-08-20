package com.example.spring.basics;

import com.example.spring.basics.basic.BinarySearchImpl;
import com.example.spring.basics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsScopeApplication {
    // What are the beans?
    // What are the dependencies?
    // Where to search for beans?
    private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);


    public static void main(String[] args) {


        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        // ApplicationContext manages the beans
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsScopeApplication.class, args);


        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());


        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());


    }

}
