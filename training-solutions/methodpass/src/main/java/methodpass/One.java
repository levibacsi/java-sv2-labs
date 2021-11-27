package methodpass;

public class One {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(number);
        number++;
        System.out.println(number);

        One one = new One();
        one.addOne(number);
        one.addOne(number);
        System.out.println(one.addOne(number));
        System.out.println(number);
    }

    public int addOne(int number){
        return number + 1;
    }
}
