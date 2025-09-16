public class Simulate_an_ATM {
    
    public static void main(String[] args) {
        BankAccount a1=new BankAccount();
        a1.account_holder="Ansh";
        a1.balance=20000;
        a1.account_number=12345678;
        a1.deposit=2000;
        a1.withdraw=1000;
        a1.display_balance();
        a1.amountdeposit();
        a1.withdrawmoney();
    }
}

class BankAccount{
    String account_holder;
    int balance;
    int account_number;
    int deposit;
    int withdraw;

    int amountdeposit(){
        System.out.print("Total amount is "+(deposit+balance));
        balance=balance+deposit;
        return balance+deposit;
    }

    int withdrawmoney(){
        if(balance>withdraw){
            System.out.println("\namount after withdraw "+(balance-withdraw));
           return balance-withdraw; 
        }
        else{
            System.out.println("\nNot enough balance");
            return -1;
        }
    }

    void display_balance(){
        System.out.println("\nYour current balance is: "+balance);
    }
}