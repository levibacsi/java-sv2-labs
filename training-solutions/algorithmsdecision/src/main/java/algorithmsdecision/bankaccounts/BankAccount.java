package algorithmsdecision.bankaccounts;

public class BankAccount {
    private String nameOfOwner;
    private String accountNumber;
    private double balance;

    public BankAccount (String nameOfOwner, String accountNumber, double balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner(){
        return nameOfOwner;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public boolean withdraw(int amount){
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(int amount){
        balance += amount;
        return true;
    }
}
