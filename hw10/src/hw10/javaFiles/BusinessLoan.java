/*
 * Ammar Irfan 
 * 11/01/2020
 * (Construction Loan Company Interface: Polymorphism)
 * SubClass of Loan 
 */
package hw10;

/**
 *
 * @author Usmani
 */
public class BusinessLoan extends Loan{

    public BusinessLoan(int loanNumber, String lastName, double amtOfLoan, int term) {
        super(loanNumber, lastName, amtOfLoan, term);
        super.setApr(1);
    }
    
}
