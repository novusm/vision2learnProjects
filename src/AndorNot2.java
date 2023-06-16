import java.util.Scanner;

public class AndorNot2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.println("Enter a number:) - " );
        int number = reader.nextInt();
        //asks user to input number

        if(number % 2 == 0) {
            System.out.print("Your number is even");
        }
        else if (number % 2 != 0) {
            System.out.print("Your number is odd");
        }
        else
        {
            System.out.print("Your number is negative");
        }




    }
}
