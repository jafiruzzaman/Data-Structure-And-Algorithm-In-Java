package concept.java.loops;

public class Loops {
    static void main(String[] args) {
        System.out.println("Loops In Java");
        /*
         * Loop: loop is used to perform to remove unnecessary repetitive works
         * There are 3 types of loop in Java
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         * 4. for-each loop
         */
        System.out.println("--------------- for loop ---------------");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------- while loop ---------------");
        int i = 1;
        while (i < 6) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("--------------- do-while loop: run at-least one time if and only if one time---------------");
        int j = 6;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 5);
    }
}
