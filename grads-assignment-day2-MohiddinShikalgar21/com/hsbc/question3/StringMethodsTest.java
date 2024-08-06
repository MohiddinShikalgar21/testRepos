package com.hsbc.question3;

public class StringMethodsTest {
    public static void main(String[] args) {

    	String example = "  Java programming is fun. Java is fun.  ";
        String emptyString = "   "; // for isBlank() test

        // a. lastIndexOf
        int lastIndex = example.lastIndexOf("Java");
        System.out.println("lastIndexOf(\"Java\"): " + lastIndex);

        // b. replace
        String replacedString = example.replace("Java", "Python");
        System.out.println("replace(\"Java\", \"Python\"): " + replacedString);

        // c. split
        String[] splitArray = example.split(" ");
        System.out.println("split(\" \"):");
        for (String str : splitArray) {
            System.out.println(str);
        }

        // d. isBlank
        boolean isBlank = emptyString.isBlank();
        System.out.println("isBlank(): " + isBlank);

        // e. strip
        String strippedString = example.strip();
        System.out.println("strip(): " + strippedString);

        // f. substring
        String substring = example.substring(2, 19);
        System.out.println("substring(2, 19): " + substring);
    }
}
