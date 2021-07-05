package com.company.sak.hw3.task1.exception;

public class OutOfBoundException extends Exception{
    public OutOfBoundException() {
        super("Incorrect index value");
    }

    public OutOfBoundException(String message) {
        super(message);
    }

    public OutOfBoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfBoundException(Throwable cause) {
        super(cause);
    }
}
