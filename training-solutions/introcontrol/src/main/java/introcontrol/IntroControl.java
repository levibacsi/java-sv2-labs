package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 11) {
            return number;
        } else {
            return number - 10;
        }
    }

    public String describeNumber(int number) {
        return number == 0 ? "zero" : "not zero";
    }

    public String greetingToJoe(String name) {
        return "Joe".equals(name) ? "Hello Joe" : "";
    }

    public int calculateBonus(int sale){
        if (sale >= 1000000) {
            return sale / 10;
        } else {
            return 0;
        }
    }
    public int calculateConsumption(int prev, int next){
        if (next >= prev) {
            return next - prev;
        } else {
            return 10000 - prev + next;
        }
    }

    public void printNumbers(int max){
         for (int i = 0; i <= max; i++) {
             System.out.print(i);
         }
    }

    public void printNumbersBetween(int min, int max){
        if (min <= max){
            for (int i = min; i <= max; i++){
                System.out.print(i);}
        } else {
            for (int i = max; i <= min; i++){
                System.out.print(i);;
            }
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if (a <= b){
            for (int i = a; i <= b; i++){
                System.out.print(i);}
        } else {
            for (int i = a; i >= b; i--){
                System.out.print(i);
            }
        }
    }

    public void printOddNumbers(int max){
        for (int i = 1; i <= max; i+=2) {
            System.out.print(i);
        }
    }
}