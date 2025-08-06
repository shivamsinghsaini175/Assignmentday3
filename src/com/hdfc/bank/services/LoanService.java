package com.hdfc.bank.services;

import com.hdfc.bank.models.HomeLoan;
import com.hdfc.bank.models.Loan;
import com.hdfc.bank.models.PersonalLoan;

public class LoanService {

    public void printEMIDetails(Loan loan) {
        String type = "Unknown";
        if (loan instanceof HomeLoan) {
            type = "HomeLoan";
        } else if (loan instanceof PersonalLoan) {
            type = "PersonalLoan";
        }

        double emi = loan.calculateEMI();

        System.out.println("Loan ID: " + loan.getLoanId()
                + " | Customer: " + loan.getCustomerName()
                + " | Type: " + type
                + " | EMI: " + emi);
    }
}
