package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map) {
        int longestOcean = 0;
        int actualOcean = 0;
        for (int i = 0; i < (map.length() - 1); i++) {
            if ('0' == map.charAt(i) && '0' == map.charAt(i + 1)) {
                actualOcean++;
                if (actualOcean > longestOcean) {
                    longestOcean = actualOcean;
                }
            } else {
                actualOcean = 1;
            }
        }
        return longestOcean;
    }
}
