//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// SimpleGreeting.java HAA
// on 1/22/25
//module 1 assignment #3
//refactor from "main.java" to "SimpleGreeting.java"

//SCanner class is here
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;


public class SimpleGreeting {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("\n\n ****** Welcome to my Simple Greeting program! ***** \n\n");

       // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a String variable to hold our user's name
        String myUserName;

        // Prompt the user for their name
        System.out.println("\n Pleaser Enter your name: ");

        // get the input into our variable
        myUserName = scanner.nextLine();

        //Prove that you got the user name
        System.out.println("\n Hello " + myUserName + " how are you today?");
    }
}