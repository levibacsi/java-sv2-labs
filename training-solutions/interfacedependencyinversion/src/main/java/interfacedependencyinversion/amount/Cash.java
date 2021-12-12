package interfacedependencyinversion.amount;

public class Cash implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        if (amount % 5 <= 2){
            return amount - amount % 5;
        }
    return amount + (5 - amount % 5);
    }
}
