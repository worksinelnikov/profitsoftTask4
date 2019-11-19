package com.profitsoft.domain;

import com.profitsoft.entity.EmployeeType;
import com.profitsoft.repos.EmployeeTypeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:spring-config.xml"); //move from src.main.java to src.main.resources
//        ctx.refresh();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(applicationContext);
    }
}
