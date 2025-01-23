//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class CircleArea {
    public static void main(String[] args) {
        System.out.println(" \n **** Hello and welcome to my area of a circle calculator!");

       Scanner scanner = new Scanner(System.in);

       int rad;

       double pie = 3.14, ar;

       System.out.println("Enter radius of circle:");

       rad = scanner.nextInt();
       ar = pie * rad * rad;
       System.out.println("\n Area of circle:" + ar);











        }
    }
