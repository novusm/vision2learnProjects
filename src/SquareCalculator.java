import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Width ");
        double width = reader.nextDouble();

        System.out.print("Enter Height ");
        double height = reader.nextDouble();

        System.out.println(width);
        System.out.println(height);

        double perimeter = (width + height) *2;

        double area = width * height;
        System.out.println(perimeter);


        System.out.println(area);
        reader.close();

    }
}
