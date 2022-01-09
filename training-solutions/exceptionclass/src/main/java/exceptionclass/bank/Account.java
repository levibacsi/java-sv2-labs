package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract = 100000;
    private static final String INVALID = "Invalid amount!";

    public Account(String accountNumber, double balance) {
        if (accountNumber == null){
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0){
            throw new InvalidAmountBankOperationException(INVALID);
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amountToSubtract) {
        if (amountToSubtract < 0 || amountToSubtract > maxSubtract) {
            throw new InvalidAmountBankOperationException(INVALID);
        }

        if (amountToSubtract > balance) {
            throw new LowBalanceBankOperationException("Low balance!");
        } else {
            balance -= amountToSubtract;
            return balance;
        }
    }

    public double deposit (double amountToDeposit){
        if (amountToDeposit < 0){
            throw new InvalidAmountBankOperationException(INVALID);
        }
        balance += amountToDeposit;
        return balance;
    }
}
