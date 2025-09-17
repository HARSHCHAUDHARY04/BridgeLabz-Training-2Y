public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        } else {
            System.out.println("Invalid object type");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("AC123", "John Doe");
        BankAccount account2 = new BankAccount("AC456", "Jane Smith");
        account1.displayDetails(account1);
        System.out.println("Total Accounts: " + getTotalAccounts());
    }
}
