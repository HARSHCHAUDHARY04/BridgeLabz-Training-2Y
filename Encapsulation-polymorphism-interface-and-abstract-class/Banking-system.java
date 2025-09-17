abstract class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public abstract double calculateInterest();

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest() {
        return balance * 0.5 / 100;
    }

    public double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit; }
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class LoanableAccount implements Loanable {
    private double creditScore;

    public LoanableAccount(double creditScore) {
        this.creditScore = creditScore;
    }

    public void applyForLoan() {
        System.out.println("Loan application submitted.");
    }

    public boolean calculateLoanEligibility() {
        return creditScore > 600;
    }

    public double getCreditScore() { return creditScore; }
    public void setCreditScore(double creditScore) { this.creditScore = creditScore; }
}

class BankingSystem {
    public static void processAccounts(BankAccount[] accounts) {
        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " Interest: " + acc.calculateInterest());
        }
    }
}
