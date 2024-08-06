package com.hsbc.question1.exception;

public class PizzaAlreadyExistsException extends Exception {
    public PizzaAlreadyExistsException() {
        super();
    }

    public PizzaAlreadyExistsException(String message) {
        super(message);
    }

    public PizzaAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PizzaAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    protected PizzaAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
