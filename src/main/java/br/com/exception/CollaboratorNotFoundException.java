package br.com.exception;

public class CollaboratorNotFoundException extends RuntimeException{
    public CollaboratorNotFoundException(String message) {
        super(message);
    }
}
