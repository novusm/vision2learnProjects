import java.util.Scanner;
public class TimesTableLoop2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to see times table: ");

        int timesTable = reader.nextInt();

        for (int i = 1; i <= 12; i++) {
            int result = timesTable * i;
            System.out.println(timesTable + " x " + " = " + result);
        }
    }
}