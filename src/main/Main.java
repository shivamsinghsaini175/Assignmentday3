package main;

import com.hdfc.bank.models.HomeLoan;
import com.hdfc.bank.models.Loan;
import com.hdfc.bank.models.PersonalLoan;
import com.hdfc.bank.services.LoanService;

public class Main {
    public static void main(String[] args) {
        Loan personalLoan = new PersonalLoan(101, "shivam", 1700000.0, "world tour");
        Loan homeLoan = new HomeLoan(102, "udhav", 15000.0, "jammu");

        LoanService service = new LoanService();

        service.printEMIDetails(personalLoan);
        service.printEMIDetails(homeLoan);

        System.out.println(personalLoan.toString());
        System.out.println(homeLoan.toString());
    }
}
