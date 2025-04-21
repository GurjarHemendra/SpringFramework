package org.hemendra.spring.springcore.referencetype;

public class Student {

    Score s;

    public Score getS() {
        return s;
    }

    public void setS(Score s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s=" + s +
                '}';
    }
}
