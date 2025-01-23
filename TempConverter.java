//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import  java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.print("Hello and welcome to my Fahrenheit to Celsius Converter!");

        Scanner scanner = new Scanner(System.in);

        int F;
            float Fahrenheit, Celsius;
            System.out.println("\n\n Enter temperature:");

            F = scanner.nextInt();

            Fahrenheit = F;
            Celsius =((Fahrenheit - 32)*5/9);

        System.out.println("Temperature in celsius is:" + Celsius);


    }
}