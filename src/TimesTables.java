import java.util.Scanner;
public class TimesTables {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What times table would you like : ");

        int timesTable = reader.nextInt();

        for(int i = 1; i <=12; i++) {
            int result = timesTable * i;
            System.out.println(timesTable + " x " + " = " + result);

        }
    }
}
