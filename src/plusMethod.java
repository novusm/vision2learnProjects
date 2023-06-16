public class plusMethod {
    static int additionMethod(int x, int y) {
        return x + y;
    }

    static double additionMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = additionMethod(8, 5);
        System.out.println(additionMethod(23, 25));
        System.out.println(additionMethod(23.6,29.5));
        System.out.println(myNum1);
    }

}
