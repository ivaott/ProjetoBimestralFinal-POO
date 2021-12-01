package br.com.unipar;

import br.com.unipar.entities.CheckingAccount;
import br.com.unipar.entities.SavingsAccount;
import java.util.Date;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();

        Date dateOne = new Date(08/10/2021);
        Date dateTwo = new Date(08/11/2021);
        
        try {
            checkingAccount.getOverdraftLimit(700);
            checkingAccount.extractByPeriod(dateOne, dateTwo);
            checkingAccount.getBankBalanceByDate(dateOne);
            checkingAccount.cashDeposit(100);
            checkingAccount.cashOut(500);

            savingsAccount.extractByPeriod(dateOne, dateOne);
            savingsAccount.getBankBalanceByDate(dateTwo);
            savingsAccount.cashDeposit(500);
            savingsAccount.cashOut(200);

            System.out.println(checkingAccount.getBalance());
            System.out.println(savingsAccount.getBalance());

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }
    
}
