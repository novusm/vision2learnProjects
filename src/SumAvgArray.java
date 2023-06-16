public class SumAvgArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {1, 3, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
            sum = sum + numbers[i];

        }
        System.out.println("Sum is " + sum);
        double avg = (double)sum/numbers.length;

        System.out.print("The average is " + avg);
    }
    // calculate average

}
