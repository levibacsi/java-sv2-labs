package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts == null){
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment (String accountNumber, double amountToSubtract){
        boolean success = false;
        for (Account account: accounts){
            if (account.getAccountNumber().equals(accountNumber)){
                success = true;
                account.subtract(amountToSubtract);
            }
        }
        if (!success){
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
    }

    public void deposit (String accountNumber, double amountToDeposit){
        boolean success = false;
        for (Account account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                success = true;
                account.deposit(amountToDeposit);
            }
        }
        if (!success){
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");

        }
    }
}
