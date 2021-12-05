package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String item: billItems) {
            String[] words = item.split(";");

            sb.append(words[0]).append("; darabszám: ").append(words[2]).append(", egységár: ").append(words[1]).append(", összesen: ")
                    .append(Integer.parseInt(words[2]) * Integer.parseInt(words[1])).append(" Ft\n");
        }
        return sb.toString();
    }
}
