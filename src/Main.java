public class Main {
    static void myMethod(String fName) {
        System.out.println(fName + " Potter");
    }

    static void threeName(String cName, String dName, String eName){
        System.out.print(cName + dName + eName);
    }

    public static void main(String[] args) {
        myMethod("James");
        myMethod("Lily");
        myMethod("Albus");
        myMethod("Michael");
        threeName("Draco ","Lucius ","Malfoy");
    }

}