public class ThreeDigitCodes {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) { // eliminates duplicates
                        int number = i * 100 + j * 10 + k;
                        System.out.println(number);
                        count++;
                    }
                }
            }
        }

        System.out.println("There are " + count + " three-digit codes.");
    }
}
