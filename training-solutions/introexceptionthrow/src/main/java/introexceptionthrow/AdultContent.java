package introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {
        Adult adult = new Adult("John", 18);
        Adult anotherAdult = new Adult("Bill", 19);
        Adult yetAnotherAdult = new Adult("Barbara", 17);

        System.out.println(adult);
        System.out.println(anotherAdult);
        System.out.println(yetAnotherAdult);
    }
}
