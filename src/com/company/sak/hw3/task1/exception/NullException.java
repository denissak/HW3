package com.company.sak.hw3.task1.exception;

public class NullException extends Exception {
    public NullException() {
        super(" this link is null");
    }

    public NullException(String message) {
        super(message);
    }

    public NullException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullException(Throwable cause) {
        super(cause);
    }
}
