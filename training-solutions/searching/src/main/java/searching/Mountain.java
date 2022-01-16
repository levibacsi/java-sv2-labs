package searching;

import java.util.Arrays;

public class Mountain {
    private int[] peaks;

    public Mountain(int[] peaks) {
        this.peaks = peaks;
    }

    public int[] getPeaks() {
        return peaks;
    }

    boolean searchPeak(Peak peak) {
        return Arrays.binarySearch(peaks, peak.getPeakHeight()) >= 0;
    }
}