//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VarsAndMath {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\n Welcome to variables and math !! \n");

       // Declaring an integer variable name 'a' and initializing it with the value 10
        int a = 10;

        // Declaring a double variable name 'b' and initializing it with the value 5.5
        double b = 5.5;

        //Performing a mathematical operation; adding 'a' and 'b'
        double sum = a + b;

        System.out.println("\n\n The sum of " + a + " and " + b + " is " + sum);

        // variables can also be used to store the results of other operations
        double product = a * b;
        System.out.println("The product of " + a + " and " + b + " is: " + product);

        // Demonstrating the variable value change
        a = 20; // Changing the value of 'a' to 20
        sum = a + b; // Recalculating sum with the new value of 'a'
        System.out.println("The new sum of " + a + " and " + b + " is: " + sum);

    }
}