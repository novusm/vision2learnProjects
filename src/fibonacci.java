import java.math.BigInteger;

public class fibonacci {
    // main
    public static void main(String[] args) {
        // pass on how many Fibonacci sequence we need
        fibonacci(100);
    }

    // method to produce the Fibonacci sequence: 0, 1, 1, 2,...
    public static void fibonacci(int counter) {
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger nextNum = BigInteger.valueOf(0);

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i <= counter; i++) {
            nextNum = num1.add(num2);
            num1 = num2;
            num2 = nextNum;

            System.out.println(nextNum);
        }
    }
}
