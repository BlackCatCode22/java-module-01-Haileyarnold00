//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class MadLibs {
    public static void main(String[] args) {

        System.out.println(" Welcome to my MadLibs code!");

        Scanner scanner = new Scanner(System.in);

        String verb;
        String noun;
        String adj;

       System.out.println("Enter a verb:");
       verb = scanner.nextLine();

       System.out.println("Enter a noun:");
       noun = scanner.nextLine();

       System.out.println("Enter an adjective:");
       adj = scanner.nextLine();

       System.out.println("I " + verb + " to the " + adj + " " + noun);







    }
}