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
public class PersonalLoan extends Loan{

    public PersonalLoan(int loanNumber, String lastName, double amtOfLoan, int term) {
        super(loanNumber, lastName, amtOfLoan, term);
        super.setApr(2);
    }
}
