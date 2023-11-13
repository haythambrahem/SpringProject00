package tn.esprit.se.springproject00.Service;

public class BlocNotFoundException extends RuntimeException {
    public BlocNotFoundException(String message) {
        super(message);
    }
}
