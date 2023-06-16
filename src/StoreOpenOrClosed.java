import java.util.Scanner;
public class StoreOpenOrClosed {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Is the store open ? Y or N");
        String response = reader.nextLine();
        if (response.equals("Y")) {
            System.out.println("Sorry we are not open today");
        } else if
            (response.equals("N")) {
        System.out.println("Welcome we are open");
    }else
        System.out.println("Please use 'Y' or 'N' to respond");}}
