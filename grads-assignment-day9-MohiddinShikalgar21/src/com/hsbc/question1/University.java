package com.hsbc.question1;

import java.util.List;

public class University {
    public void printStudentResult(List<Student> students, ResultFinder rf) {
        for (Student s : students) {
            if (s.getResult(rf)) {
                System.out.println(s.getRno() + " " + s.getName() + " " + s.getMarks() + " PASS");
            } else {
                System.out.println(s.getRno() + " " + s.getName() + " " + s.getMarks() + " FAIL");
            }
        }
    }
}
