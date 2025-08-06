package com.hdfc.bank.models;

public class PersonalLoan extends Loan {
    private String purpose;

    public PersonalLoan(int loanId, String customerName, double loanAmount, String purpose) {
        super(loanId, customerName, loanAmount);
        this.purpose = purpose.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public double calculateEMI() {
        // Suppose 11% annual interest simplified monthly
        return (loanAmount * 0.11) / 12;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Loan Type: PersonalLoan");
        System.out.println("Purpose: " + purpose);
    }

    // Overloaded insurance methods
    public void applyInsurance(String insurer, double insuredAmount) {
        System.out.println("Personal loan insurance via " + insurer + " for ₹" + insuredAmount);
    }

    public void applyInsurance() {
        System.out.println("PersonalLoan Insurance applied with standard coverage.");
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + getLoanId() +
                ", customerName='" + customerName + '\'' +
                ", loanAmount=" + loanAmount +
                '}';
    }
}
