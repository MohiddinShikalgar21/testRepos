package com.hsbc.question1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalDemo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1, "a", 51),
                new Student(2, "b", 41),
                new Student(3, "c", 55),
                new Student(4, "d", 60),
                new Student(5, "e", 45),
                new Student(6, "f", 70),
                new Student(7, "g", 39),
                new Student(8, "h", 48),
                new Student(9, "i", 66),
                new Student(10, "j", 80)
        );


        University university = new University();

        // Lambda expression to determine pass/fail
        ResultFinder passFail = student -> student.getMarks() >= 50 ? "PASS" : "FAIL";

        System.out.println("PASSED Students:");
        university.printStudentResult(studentList, passFail);

        System.out.println("\nFAILED Students:");
        university.printStudentResult(studentList, passFail);

        // Find the list of students whose names start with "a" using Stream API
        List<Student> studentsWithA = studentList.stream()
                .filter(student -> student.getName().startsWith("a"))
                .collect(Collectors.toList());

        System.out.println("\nStudents whose names start with 'a':");
        studentsWithA.forEach(student ->
                System.out.println(student.getRno() + " " + student.getName() + " " + student.getMarks())
        );
    }
}
