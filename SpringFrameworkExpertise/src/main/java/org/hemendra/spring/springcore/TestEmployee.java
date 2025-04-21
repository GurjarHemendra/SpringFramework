package org.hemendra.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("resources/springconfig.xml");
        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee);
    }
}
