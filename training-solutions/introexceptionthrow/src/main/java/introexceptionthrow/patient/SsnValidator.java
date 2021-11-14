package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn (String ssn) {
        String ssnNumber = ssn.replaceAll(" ", "");

        if (ssnNumber.length() != 9) {
            throw new IllegalArgumentException("SSN not 9 digits");
        }

        char[] ssnChars = ssnNumber.toCharArray();
        int sumChars = 0;
        for (int i = 0; i < ssnChars.length - 1; i += 2) {
            sumChars += ssnChars[i] * 3;
        }

        for (int i = 1; i < ssnChars.length - 1; i += 2) {
            sumChars += ssnChars[i] * 7;
        }

        return sumChars % 10 == Integer.parseInt(ssnNumber.substring(8));
    }
}
