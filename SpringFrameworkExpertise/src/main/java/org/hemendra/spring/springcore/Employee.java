package org.hemendra.spring.springcore;

import java.util.List;

public class Employee {

    String name ;

    List<String> technologies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", technologies=" + technologies +
                '}';
    }
}
