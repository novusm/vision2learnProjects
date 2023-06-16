import java.util.Random;
public class randomProgram {
    public static void main(String[] args) {
        Random random = new Random();
        int obj = random.nextInt(6)+6;

        System.out.println("Generate random number.... ");
        System.out.print("The value you get is" + obj);




    }
}
