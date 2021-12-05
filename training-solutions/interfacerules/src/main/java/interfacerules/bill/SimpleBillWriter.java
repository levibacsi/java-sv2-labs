package interfacerules.bill;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SimpleBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String item: billItems) {
            String[] words = item.split(";");

            sb.append(words[0]).append(", ").append(words[2]).append(" * ").append(words[1]).append(" = ")
                    .append(Integer.parseInt(words[2]) * Integer.parseInt(words[1])).append(" Ft\n");
        }
        return sb.toString();
    }
}
