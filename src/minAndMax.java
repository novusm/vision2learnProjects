import java.util.Random;

public class minAndMax{
    public static void main(String[] args) {
        // 2. create object random
        Random rand = new Random();

        // 3. initialise empty array with size 10
        int[] arr = new int[10];

        // 4. generate random numbers to fill in your array, bound is 100
        System.out.println("Generating 10 random numbers....");
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        // 5. to find the biggest element, create new variable max
        int max = arr[0];

        // 6.a use for loops to compare max and array[i]
        // 6.b inside the loop update max if array[i] is bigger
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Biggest number on the sequence is " + max);

        // 7. to find the lowest, crate new variable min
        int min = arr[0];

        // 8.a use for loop to compare min and array[i]
        // 8.b inside the loop update min in array[i] is smaller
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // 9. print max value
        System.out.println("Maximum value is: " + max);

        // 10. print min value
        System.out.println("Minimum value is: " + min);
    }
}
