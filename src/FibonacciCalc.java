public class FibonacciCalc {

    public static void main(String[] args) {
        Fibonacci();
    }

    public static void Fibonacci() {
        int n = 100; // Number of Fibonacci numbers to generate

        long[] fibonacci = new long[n];
        fibonacci[0] = 0; // First number in the sequence
        fibonacci[1] = 1; // Second number in the sequence

        System.out.print(fibonacci[0] + ", " + fibonacci[1]);

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(", " + fibonacci[i]);
        }
    }
}
