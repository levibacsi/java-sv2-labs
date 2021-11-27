package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SeparatedSum {
    String numbers = "";
    public String numberListReader() {
        try {
            List<String> numberList = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            numbers = numberList.get(0);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return numbers;
    }

    public Separate sum(String floatingNumbers) {
        Separate separateSums = new Separate(0, 0);

        String[] realNumbers = floatingNumbers.replace(",", ".").split(";");

        double sumPos = 0;
        double sumNeg = 0;
        for (String d: realNumbers){
            if (Double.parseDouble(d) > 0) {
                sumPos += Double.parseDouble(d);
            } else {
                sumNeg += Double.parseDouble(d);
            }
        }
        separateSums.setPositive(sumPos);
        separateSums.setNegative(sumNeg);

        return separateSums;
    }

    public static void main(String[] args) {
        SeparatedSum separatedSum = new SeparatedSum();
        System.out.println(separatedSum.sum(separatedSum.numberListReader()));
    }
}

