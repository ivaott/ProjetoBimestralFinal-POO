package br.com.unipar;

import br.com.unipar.entities.CalculatorScientific;

public class Main {

    public static void main(String[] args) {
        
        CalculatorScientific calculator = new CalculatorScientific();
        
        System.out.println(calculator.sum(4, 4));
        System.out.println(calculator.subtraction(6, 3));
        System.out.println(calculator.division(20, 10));
        System.out.println(calculator.multiplication(8, 3));
        System.out.println(calculator.squareRoot(25));
        System.out.println(calculator.potency(4, 7));
    }
    
}
