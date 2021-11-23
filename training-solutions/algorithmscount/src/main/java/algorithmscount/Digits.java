package algorithmscount;

//Hány olyan kétjegyű pozitív egész szám van, amelyben az egyik számjegy 5-tel nagyobb a másiknál?

public class Digits {
    public int getCountOfNumbers(){
        int counter = 0;
        for (int i = 10; i < 100; i++){
            String num = Integer.toString(i);
            if (Math.abs(num.charAt(0) - num.charAt(1)) == 5){
                counter++;
            }
        }
        return counter;
    }
}
