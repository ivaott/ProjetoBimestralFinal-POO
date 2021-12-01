
package br.com.unipar.exception;

public class InsufficientWithdrawalException extends RuntimeException {
    
    public InsufficientWithdrawalException() {
        super ("Seu saldo n�o � suficiente para saque!");
    }
}
