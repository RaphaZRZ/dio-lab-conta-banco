import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Please enter your branch number: ");
        int branchNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Please enter your account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Please enter your balance: ");
        BigDecimal balance = sc.nextBigDecimal();
        sc.nextLine();

        System.out.printf("Hi %s! thanks for create an account in our bank, your branch number is %d, account number is %d and your balance is %s.", name, branchNumber, accountNumber, balance);
    }
}