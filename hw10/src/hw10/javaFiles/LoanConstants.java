/*
 * Ammar Irfan 
 * 11/01/2020
 * (Construction Loan Company Interface: Polymorphism)
 * This is interface of LoanConstants and this is implemented on Loan Class.
 */
package hw10;

/**
 *
 * @author Usmani
 */
public interface LoanConstants {

    /**
     * loan 
     *  short-term
     *  (1 year), medium-term (3 years), and long-term (5 years) loans
     */
    final int loanTerms[]  = {1,3,5};
    final int maxLoan = 500000;
    final String companyName= new String();
}
