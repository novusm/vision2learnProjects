import java.util.Scanner;
public class NewSquareCalculator {
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      System.out.println("Enter the Width ");
      double width = reader.nextDouble();

        System.out.println("Enter the Height ");
      double height = reader.nextDouble();

        System.out.println(width);
        System.out.println(height);

        double perimeter = (width + height)*2;

        System.out.println("this is the perimeter: " + perimeter);
    }
}
