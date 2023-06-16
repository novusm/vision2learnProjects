import java.util.Scanner;
public class MinMaxMethods {
    // main method
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("This program will print the smallest and largest number.");
        System.out.println("Enter three numbers to compare : ");
        // read user input as num1, num2, num3
        double num1 = reader.nextDouble();
        double num2  =reader.nextDouble();
        double num3 = reader.nextDouble();

        // print out the smallest number by calling minNum method
        System.out.println("Smallest number is " + minNum (num1, num2, num3));
        // print out the largest number by calling maxNum method
        System.out.println("Largest number is " + maxNum(num1, num2, num3));
    }

    // METHOD TO FIND THE SMALLEST
    public static int minNum (int a, int b, int c){
        if ( a < b && a < c) {
            return a; // a is smallest
        } else if (b < a && b < c ){
            return b; // b is smallest
        } else {
            return c;
        }
    }
    public static double minNum (double a, double b, double c){
        if ( a < b && a < c) {
            return a; // a is smallest
        } else if (b < a && b < c ){
            return b; // b is smallest
        } else {
            return c;
        }
    }

    // create method maxNum and print the biggest number
    public static int maxNum (int a, int b, int c){
        if ( a > b && a > c) {
            return a; // a is smallest
        } else if (b > a && b > c ){
            return b; // b is smallest
        } else {
            return c;
        }
    }


    // create method maxNum and print the biggest number
    public static double maxNum (double a, double b, double c){
        if ( a > b && a > c) {
            return a; // a is smallest
        } else if (b > a && b > c ){
            return b; // b is smallest
        } else {
            return c;
        }
    }
}
