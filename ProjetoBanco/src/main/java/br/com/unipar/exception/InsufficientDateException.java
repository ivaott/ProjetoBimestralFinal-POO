package br.com.unipar.exception;


public class InsufficientDateException extends RuntimeException {
    
    public InsufficientDateException() {
        super ("N�o � poss�vel obter resultado com a data nula!");
    }
}
