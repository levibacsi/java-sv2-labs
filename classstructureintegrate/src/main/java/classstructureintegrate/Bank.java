package classstructureintegrate;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your account number?");
        String accountNumber = scanner.nextLine();
        System.out.println("What is your name?");
        String owner = scanner.nextLine();
        System.out.println("How much is your current balance?");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);
        System.out.println("Your data: " + bankAccount.getInfo());

        System.out.println("How much money do you want to deposit?");
        int amount = scanner.nextInt();
        bankAccount.deposit(amount);
        System.out.println("Your data: " + bankAccount.getInfo());

        System.out.println("How much money do you want to withdraw?");
        amount = scanner.nextInt();
        bankAccount.withdraw(amount);
        System.out.println("Your data: " + bankAccount.getInfo());
    }
}
