package exceptionmulticatch.converter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String string){
        if (string == null){
            throw new NullPointerException("Binary string is null.");
        }

        boolean[] booleans = new boolean[string.length()];
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != '0' && string.charAt(i) != '1'){
                throw new IllegalArgumentException("Binary string is not valid.");
            }

            booleans[i] = '0' != string.charAt(i);
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans){
        if (booleans == null){
            throw new NullPointerException("Boolean array is null.");
        }

        if (booleans.length == 0 ){
            throw new IllegalArgumentException("Boolean array is empty.");
        }

        StringBuilder binaryString = new StringBuilder();
        for (Boolean bool: booleans){
            if (Boolean.TRUE.equals(bool)){
                binaryString.append("1");
            } else {
                binaryString.append("0");
            }
        }
        return binaryString.toString();
    }
}
