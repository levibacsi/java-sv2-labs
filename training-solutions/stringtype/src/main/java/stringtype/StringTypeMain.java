package stringtype;

public class StringTypeMain {
    public static void main (String [] args){
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = "Hello John Doe".equals(message);
        boolean c = "Hello John Doe444".equals(message);

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String string1 = "";
        String string2 = "";
        String concatString = string1 + string2;
        System.out.println(concatString);
        System.out.println(concatString.length());

        System.out.println("Abcde".length());
        System.out.println("Abcde".substring(0,1) + ", " + "Abcde".substring(2,3));
        System.out.println("Abcde".substring(0,3));
    }
}
