package com.hdfc.bank.services;

import com.hdfc.bank.models.HomeLoan;
import com.hdfc.bank.models.Loan;
import com.hdfc.bank.models.PersonalLoan;

public class LoanService {

    public void printEMIDetails(Loan loan) {
        loan.printDetails(); 

        double emi = loan.calculateEMI();
        System.out.println("EMI: " + emi);


        if (loan instanceof PersonalLoan) {
            PersonalLoan pl = (PersonalLoan) loan;

            pl.applyInsurance("Tata AIG", pl.getLoanAmount());
        } else if (loan instanceof HomeLoan) {
            HomeLoan hl = (HomeLoan) loan;

            hl.applyInsurance("Tata AIG", hl.getLoanAmount());
        }

        System.out.println();
    }
}
