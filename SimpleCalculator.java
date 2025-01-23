//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome to my simple calculator!");

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter first number:");
        a = scanner.nextInt();

        System.out.println("Enter second number:");
        b = scanner.nextInt();

        double sum = a + b;
        double minus = a - b;
        double product = a * b;
        double division = a/b;

        System.out.println("\n Addition: " + a + " plus " + b + " equals = " + sum);

        System.out.println("\n Subtraction: " + a + "minus " + b + "equals = " + minus);

        System.out.println("\n Multiplication: " + a + " multiplied by " + b + " equals = " + product);

        System.out.println("\n Division: " + a + " divided by " + b + " equals = " + division);
    }
}