abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accNum, String holder, double balance) {
        this.accountNumber = accNum;
        this.holderName = holder;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }

    public double getBalance() { return balance; }
}

// Loanable interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNum, String holder, double balance) { super(accNum, holder, balance); }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; } // 4% interest

    @Override
    public void applyForLoan(double amount) { System.out.println("SavingsAccount Loan Applied: " + amount); }
    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 1000; }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNum, String holder, double balance) { super(accNum, holder, balance); }

    @Override
    public double calculateInterest() { return 0; } // No interest
    @Override
    public void applyForLoan(double amount) { System.out.println("CurrentAccount Loan Applied: " + amount); }
    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

// Demo
class BankingDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S001", "Rahul", 20000),
            new CurrentAccount("C001", "Simran", 10000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(5000);
                System.out.println("Eligible for Loan: " + ((Loanable) acc).calculateLoanEligibility());
            }
            System.out.println("-------------------------");
        }
    }
}
