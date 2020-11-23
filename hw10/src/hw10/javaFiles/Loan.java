/*
 * Ammar Irfan 
 * 11/01/2020
 * (Construction Loan Company Interface: Polymorphism)
 * Abstract Loan class implements LoanConstants.
 */
package hw10;

/**
 *
 * @author Usmani
 */
public abstract class Loan implements LoanConstants {
    private int loanNumber;
    private String lastName;
    private double amtOfLoan;
    private double apr;
    private int term; 

    public Loan(int loanNumber, String lastName, double amtOfLoan, int term) {
        this.loanNumber = loanNumber;
        this.lastName = lastName;
        setAmtOfLoan(amtOfLoan); //validating the value
        setTerm(term);          //validating the value
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAmtOfLoan() {
        return amtOfLoan;
    }

    public void setAmtOfLoan(double xAmtOfLoan) {
        if(xAmtOfLoan > maxLoan)
            System.out.print("Loan is not allow over price 500000");
        else
            this.amtOfLoan=xAmtOfLoan;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int xterm) {
        for (int i: loanTerms){
            if(xterm == i)
                this.term = i;
        }
        
        if(xterm != this.term)
            System.out.println("Please Choose 1 3 or 5 years term");
    }

    @Override
    public String toString() {
        return "Loan{" + "loanNumber=" + loanNumber + ", lastName=" + lastName + ", amtOfLoan=" + amtOfLoan + ", apr=" + apr + ", term=" + term + '}';
    }
    
    
    
}
