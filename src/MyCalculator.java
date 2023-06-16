import java.util.Scanner;
public class MyCalculator {
    // main method
    public static void main(String[] args) {
        // create object scanner
        Scanner sc = new Scanner(System.in);
        // ask user to enter two numbers (int)

        // read user input as num1 and num2
        System.out.println("Enter a number then press enter: ");
        int num1 = sc.nextInt();

        System.out.println("Enter a Number then press enter:  ");
        int num2 = sc.nextInt();

        // now, call the methods to print all results of math. operations
        System.out.println("Your numbers added " + add(num1, num2));
        System.out.println("Your numbers substracted " + subtraction(num1, num2));
        System.out.println("Your numbers multiplied " + Multiply(num1, num2));
        System.out.println("Your numbers divided " + Division(num1, num2));
    }

    // method 1 to add
    static int add (int a, int b){
        return a + b;
    }


    // method 2 to substract
static int subtraction(int a, int b){
        return a - b;
}

    // method 3 to multiply
static int Multiply(int a, int b){
        return a * b;
}

    // method 4 to divide
    static double Division (int a, int b){
        return (double) a / b;
    }
}
