package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {
    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String codesStartWithLetter: codes) {
            if (Character.isLetter(codesStartWithLetter.charAt(0))) {
                if (first) {
                    first = false;
                } else {
                    sb.append(", ");
                }
                sb.append(codesStartWithLetter);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> codes = new ArrayList(Arrays.asList("345GFdfger", "T57fbj", "xtcu45", "45fgh","f578GVHd"));
        Codes codes1 = new Codes();
        System.out.println(codes1.getCodesStartWithLetter(codes));
    }
}
