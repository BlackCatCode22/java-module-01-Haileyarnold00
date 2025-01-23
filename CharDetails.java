import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {

        System.out.println("Welcome to my character to ASCII calculator!");

        System.out.println("Enter character:");
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);

        int ascii = a;

        System.out.println("ASCII value of: " + a + " is " + ascii);




    }
}