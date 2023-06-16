// Nested loop: is a loop inside another loop
// Important: use different counter name for each loop
public class NestedLoop {
    public static void main(String[] args) {

        for(int i=1; i<=9; i++){ // outer loop starts
            for(int j=0; j<=9; j++) { // inner loop starts
                System.out.println(i + " " + j);
            }// end of inner loop
        } // end of outer loop

    }
}
// extension: try to print  number 10 - 99
