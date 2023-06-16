import java.util.Scanner;
public class ShoeBrownOrBlack {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print ("Type whether you have 'black' or 'brown' shoes?  ");

        String response = reader.nextLine();

        if (response.equals("brown") || response.equals("black") ||
            (response.equals("BROWN") || response.equals("BLACK") ||
        (response.equals("Brown") || response.equals("Black")))){
            System.out.println("Nice choice");

        } else {
                System.out.println ("Lets get you some good shoes to suit");

            }
        }
    }

