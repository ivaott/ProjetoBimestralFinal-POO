package br.com.unipar.exception;


public class InsufficientDepositException extends RuntimeException{
    
    public InsufficientDepositException() {
        super ("N�o � poss�vel fazer dep�sito com valor menor que 0,00!");
    }
}
