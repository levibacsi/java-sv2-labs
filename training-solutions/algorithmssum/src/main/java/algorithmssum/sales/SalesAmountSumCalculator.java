package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public int sumSalesAmount(List<Salesperson> salespersons){
        int sumOfSales = 0;
        for (Salesperson sales: salespersons){
            sumOfSales += sales.getAmount();
        }
        return sumOfSales;
    }
}
