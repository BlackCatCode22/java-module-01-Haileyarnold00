//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to my Simple Interest Calculator!");

        Scanner scanner = new Scanner(System.in);

        int princ;
        int rate;
        int time;

        System.out.println("Enter your principal:");
        princ = scanner.nextInt();

        System.out.println("Enter your rate:");
        rate = scanner.nextInt();

        System.out.println("Enter your time:");
        time = scanner.nextInt();

        double interest = princ * rate * time;

        System.out.println("Your simple interest is: " + interest);



    }
}