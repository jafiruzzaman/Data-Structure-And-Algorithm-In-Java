package concept.java.inputs;

import java.util.Scanner;

public class Inputs {
    static void main(String[] args) {
        System.out.println("Inputs in Java");
        Scanner sc = new Scanner(System.in);

        // input for byte
        System.out.println("Enter a byte value from -128 to 127");
        byte byteValue = sc.nextByte();
        System.out.println("byte value: " + byteValue);

        // input for short
        System.out.println("Enter a short value from -32768 to 32767");
        short shortValue = sc.nextShort();
        System.out.println("short value: " + shortValue);

        // input for int
        System.out.println("Enter a short value from -2^31-1 to 2^31-1");
        int intValue = sc.nextInt();
        System.out.println("int value: " + intValue);

        // input for long
        System.out.println("Enter a long value which is bigger than int");
        long longValue = sc.nextLong();
        System.out.println("long value: " + longValue);

        // input for float
        System.out.println("Enter a float value which contains 7 decimal value");
        float floatingValue = sc.nextFloat();
        System.out.println("float value: " + floatingValue);

        // input for long
        System.out.println("Enter a double value value which contains 15 decimal value");
        double doubleValue = sc.nextDouble();
        System.out.println("double value: " + doubleValue);

        // input for char
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println("char value: " + ch);
        sc.next();

        // input for String
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        System.out.println("String value: " + str);

        // make sure to close
        sc.close();
    }
}
