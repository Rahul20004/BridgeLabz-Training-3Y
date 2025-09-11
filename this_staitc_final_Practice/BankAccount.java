class BankAccount {
    private static String bankName = "State Bank of India"; // shared value
    private static int totalAccounts = 0; // track total accounts

    private String accountHolderName;
    private final int accountNumber; // constant, cannot change

    // Constructor -> 'this' removes ambiguity
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Display details -> check instanceof
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
        }
    }

    // Static method -> show total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul", 101);
        BankAccount acc2 = new BankAccount("Sneha", 102);

        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
