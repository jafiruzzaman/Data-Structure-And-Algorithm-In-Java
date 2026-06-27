package concept.java.methods;

public class Methods {
    /*
     * Structure of a method
        static return-type name-of-method(parameter){
            // method-body
     }
     */
    static void printHello() {
        System.out.println("Hi,there...");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void main(String[] args) {

        System.out.println("Methods in Java");
        /*
         * Methods/Functions: method or function are reusable block of code to perform a specific task when it called
         */
        // Call method
        printHello();
        // pass value on methods
        System.out.println(add(5, 5));
    }
}
