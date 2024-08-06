package com.hsbc.question1;

public class ExceptionHandlingExamples {

    public static void main(String[] args) {
    	
        singleTryCatchFinallyExample();

        multipleCatchBlocksExample();

        nestedTryCatchBlocksExample();

        throwAndThrowsExample();
    }

    public static void singleTryCatchFinallyExample() {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void multipleCatchBlocksExample() {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void nestedTryCatchBlocksExample() {
        try {
            try {
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void throwAndThrowsExample() {
        try {
            checkRange(150);
        } catch (InvalidRangeException e) {
            System.out.println("Caught InvalidRangeException: " + e.getMessage());
        }
    }

    public static void checkRange(int number) throws InvalidRangeException {
        if (number < 1 || number > 100) {
            throw new InvalidRangeException("Number is out of range");
        }
    }
}

class InvalidRangeException extends Exception {
    public InvalidRangeException() {
        super();
    }

    public InvalidRangeException(String message) {
        super(message);
    }

    public InvalidRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRangeException(Throwable cause) {
        super(cause);
    }

    protected InvalidRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }

    protected InvalidInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
