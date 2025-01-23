//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner; // Import the Scanner class


public class FavoriteNumber {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        // Create a scanner class for user import
        Scanner scanner = new Scanner(System.in);

        // create a string variable for user's favorite number
        String myFavoriteNumber;

        // Prompt the user for their favorite number
        System.out.println("\n What is your favorite number: ");

        // Get the input into our variable
        myFavoriteNumber = scanner.nextLine();

        // Prove that you got the number
        System.out.println("\n " + myFavoriteNumber + " is the best number of all! \n");
    }
}