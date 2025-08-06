package com.hdfc.bank.models;

public class HomeLoan extends Loan {
    private String propertyAddress;

    public HomeLoan(int loanId, String customerName, double loanAmount, String propertyAddress) {
        super(loanId, customerName, loanAmount);
        this.propertyAddress = propertyAddress.trim();
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    @Override
    public double calculateEMI() {
        return (loanAmount * 0.10) / 12;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Loan Type: HomeLoan");
        System.out.println("Property Address: " + propertyAddress);
    }

    public void applyInsurance(String insurer, double insuredAmount) {
        System.out.println("Home loan insurance via " + insurer + " for ₹" + insuredAmount);
    }

    public void applyInsurance() {
        System.out.println("HomeLoan Insurance applied with basic coverage.");
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
