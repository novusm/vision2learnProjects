import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 9, 10, 6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number between 1 & 10: ");

        int searchNum = sc.nextInt();

        boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == searchNum) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Value " + searchNum + " found in array");
            } else {
                System.out.println("That Number is not in array!");
            }
        }

}