package com.hsbc.question1.exception;

public class InvalidRangeException extends Exception {
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
