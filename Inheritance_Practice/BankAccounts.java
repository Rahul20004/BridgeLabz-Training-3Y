
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account | Acc No: " + accountNumber + " | Balance: " + balance + " | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account | Acc No: " + accountNumber + " | Balance: " + balance + " | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int duration; // in months

    FixedDepositAccount(int accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Acc No: " + accountNumber + " | Balance: " + balance + " | Duration: " + duration + " months");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(101, 50000, 5.5);
        CheckingAccount c1 = new CheckingAccount(102, 20000, 10000);
        FixedDepositAccount f1 = new FixedDepositAccount(103, 100000, 24);

        s1.displayAccountType();
        c1.displayAccountType();
        f1.displayAccountType();
    }
}
