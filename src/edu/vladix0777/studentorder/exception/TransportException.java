package edu.vladix0777.studentorder.exception;

public class TransportException extends Exception
{
    public TransportException() {
    }

    public TransportException(String message) {
        super(message);
    }

    public TransportException(String message, Throwable cause) {
        super(message, cause);
    }
}
