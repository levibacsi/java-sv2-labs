package algorithmsmax.sales;

import java.util.ArrayList;
import java.util.List;

public class Sales{
    //	kiválasztja a legnagyobb árbevételt elért értékesítőt:
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        int maxSale = sales.get(0).getAmount();
        Salesperson maxSalePerson = null;
        for (Salesperson sp: sales){
            if (sp.getAmount() > maxSale){
                maxSale = sp.getAmount();
                maxSalePerson = sp;
            }
        }
        return maxSalePerson;
    }

    // kiválasztja azt az értékesítőt, aki a célt a legnagyobb összeggel meghaladta:
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        int biggestDifference = sales.get(0).getDifferenceFromTarget();
        Salesperson furthestPerson = sales.get(0);
        for (Salesperson sp: sales){
            if (sp.getDifferenceFromTarget() > biggestDifference){
                biggestDifference = sp.getDifferenceFromTarget();
                furthestPerson = sp;
            }
        }
        return furthestPerson;
    }

    // kiválasztja azt az értékesítőt, aki a legnagyobb összeggel alulmúlta a célt:
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        int biggestDifference = sales.get(0).getDifferenceFromTarget();
        Salesperson furthestPerson = sales.get(0);
        for (Salesperson sp: sales){
            if (sp.getDifferenceFromTarget() < biggestDifference){
                biggestDifference = sp.getDifferenceFromTarget();
                furthestPerson = sp;
            }
        }
        return furthestPerson;
    }
}