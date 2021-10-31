package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number){
        return (int) number;
    }

    public byte[] convertIntArrayToByteArray(int [] numbers){
        byte [] byteArray = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0 || numbers [i] > 127){
                byteArray[i] = -1;
            } else {
                byteArray[i] = (byte) numbers[i];
            }
        }
    return byteArray;
    }

    public int getFirstDecimal(double number){
        int whole = (int) number;
        double fraction = 10.0 * (number - whole);
        int decimal = (int) fraction;
        return decimal;
    }
}
