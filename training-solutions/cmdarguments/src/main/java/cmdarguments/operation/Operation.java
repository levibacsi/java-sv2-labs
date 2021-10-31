package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if ("/list".equals(args[i] )) {
                System.out.println("Listázás");
            }
            if ("/add".equals(args[i] )){
                System.out.println("Hozzáadás");
            }
            if ("/delete".equals(args[i] )){
                System.out.println("Törlés");
            }else{
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
