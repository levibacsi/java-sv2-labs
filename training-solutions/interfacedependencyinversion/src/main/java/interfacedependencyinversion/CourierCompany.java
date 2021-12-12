package interfacedependencyinversion;

public class CourierCompany {
    public static void main(String[] args) {
        Box small = new SmallBox();
        Box medium = new MediumBox();
        Box large = new LargeBox();
        Box extra = new ExtraLargeBox();

        System.out.println(small.getSize() + " " + small.getPrice());
        System.out.println(medium.getSize() + " " + medium.getPrice());
        System.out.println(large.getSize() + " " + large.getPrice());
        System.out.println(extra.getSize() + " " + extra.getPrice());
    }
}
