package algorithmscount.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan (List<Transaction> transactionList, int limit){
        int entriesLess = 0;
        for (Transaction t: transactionList){
            if (t.getTransactionType() == TransactionType.CREDIT & t.getAmount() < limit){
                entriesLess++;
            }
        }
        return entriesLess;
    }
}
