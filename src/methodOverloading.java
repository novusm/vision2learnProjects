public class methodOverloading {
    public static void main(String[] args) {
        int result1 = sum(1, 6);
        double result2 = sum(2.89,8.99);
        float result3 = (float) sum(82.12, 81.011);
    }

    public static int sum (int x, int y){
        return x + y;
    }
    public static double sum (double x, double y){
        return x + y;
    }
    public static float sum (float x, float y){
        return x + y;
    }
}
