import java.util.Scanner;

public class ReaderInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = reader.nextDouble();

        System.out.println("Enter the height: ");
        double height = reader.nextDouble();

        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        double perimeter = (width + height) * 2;
        double area = width * height;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        reader.close();
    }
}
