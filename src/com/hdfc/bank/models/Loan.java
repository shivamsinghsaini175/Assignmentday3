package com.hdfc.bank.models;

public abstract class Loan {
    public static final String BANK_NAME = "HDFC Life";
    private final int loanId;
    protected String customerName;
    protected double loanAmount;

    public Loan(int loanId, String customerName, double loanAmount) {
        this.loanId = loanId;
        this.customerName = customerName.trim();
        this.loanAmount = loanAmount;
    }

    public int getLoanId() {
        return loanId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public abstract double calculateEMI();

    public void printDetails() {
        System.out.println("--- EMI Details ---");
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Loan ID: " + loanId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", customerName='" + customerName + '\'' +
                ", loanAmount=" + loanAmount +
                '}';
    }
}
