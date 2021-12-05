package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Darjeeling", 567);
        HerbalTea herbalTea = new HerbalTea("Winter delight", 543);

        System.out.println(tea.getName()+ " " + tea.getPrice());
        System.out.println(herbalTea.getName() + " " + herbalTea.getPrice());
    }
}
