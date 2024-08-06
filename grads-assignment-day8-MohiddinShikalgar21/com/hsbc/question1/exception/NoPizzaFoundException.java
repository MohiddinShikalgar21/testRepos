package com.hsbc.question1.exception;

public class NoPizzaFoundException extends Exception {
    public NoPizzaFoundException() {
        super();
    }

    public NoPizzaFoundException(String message) {
        super(message);
    }

    public NoPizzaFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPizzaFoundException(Throwable cause) {
        super(cause);
    }

    protected NoPizzaFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
