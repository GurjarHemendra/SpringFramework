package org.hemendra.spring.springcore.referencetype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/referenceconfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
