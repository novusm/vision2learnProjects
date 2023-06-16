import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int sumTotal = 0;
        int counter = 1;

        while (counter <= sumTo) {
            sumTotal += counter;
            counter++;
        }

        System.out.println("The sum of the numbers from 1 to " + sumTo + " is " + sumTotal);
    }
}
