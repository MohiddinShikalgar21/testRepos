package com.hsbc.question1;

public class Student {
    private int rno;
    private String name;
    private int marks;

    public Student(int rno, String name, int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public boolean getResult(ResultFinder resultFinder) {
        return "PASS".equals(resultFinder.result(this));
    }
}
