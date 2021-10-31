package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(Integer.toBinaryString(9));
        System.out.println(operators.isEven(5));
        System.out.println(operators.isEven(6));
        System.out.println(operators.getResultOfDivision(13, 4));

        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull(""));

        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("hello"));
    }
}
