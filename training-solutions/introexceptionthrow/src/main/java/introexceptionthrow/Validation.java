package introexceptionthrow;

public class Validation {
    boolean success = true;

    public void validateName (String name){
        if ("".equals(name) || null == name){
            success = false;
            throw new IllegalArgumentException("No name entered.");
        }
    }

    public void validateAge(String ageString){
        if (ageString == null || "".equals(ageString)){
            success = false;
            throw new IllegalArgumentException("No age entered.");
        }

        try {
            if (Integer.parseInt(ageString) < 0 || Integer.parseInt(ageString) > 120) {
                success = false;
                throw new IllegalArgumentException("Age not accepted.");
            }
        }
        catch (NumberFormatException nfe){
            success = false;
            throw new IllegalArgumentException("Error. Age not a number");
        }
    }
}
