package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan (List<BankAccount> bankAccounts, int limit){
        int counter = 0;
        for (BankAccount bA: bankAccounts){
            if (limit < bA.getBalance()){
                counter++;
            }
        }
        return counter;
    }
}
