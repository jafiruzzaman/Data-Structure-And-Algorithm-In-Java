package concept.java.dataTypes;

public class DataTypes {
    static void main(String[] args) {
        System.out.println("Data-Types In Java");
        /*
         * Data-Types in Java:
         * byte
         * short
         * int
         * float
         * double
         * long
         * char
         * boolean
         */

        // byte:
        byte byteValue = 127; // range -128 to +127
        System.out.println("byte value: " + byteValue);

        // short:
        short shortValue = 32767; // range from -32768 to +32767
        System.out.println("short value: " + shortValue);

        // int:
        int intValue = 323454541; // range -2^31-1 to 2^31-1
        System.out.println("int value: " + intValue);

        // long:
        long longValue = 12454545231231L; // make sure add L at the end
        System.out.println("long value: " + longValue);

        // float:
        float floatValue = 1.5475454f; // make sure that add f at the end
        System.out.println("floating value: " + floatValue);

        // double:
        double doubleValue = 1.66565652622;
        System.out.println("double value: " + doubleValue); // Note: double have more

        // char:
        char ch = 'c';
        System.out.println("char value: "+ch); // only store single character

        // boolean
        boolean bool = true;
        System.out.println("boolean value: "+bool);

    }
}

/*
 * variable:  variable is a named stored in memory location where value is stored
 * Data-Type: Data-Type define what type of data variable have to store
 */
