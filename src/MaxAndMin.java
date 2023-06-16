import java.util.Random;

public class MaxAndMin {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Fill the array with random values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }

        // Find the maximum and minimum values
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Output the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
