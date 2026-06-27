package concept.java.operators;

public class Operators {
    static void main(String[] args) {
        System.out.println("Operators in Java");
        // Operator: Operator used to perform some operation on operands.

        /*
         * Arithmetic Operators: +,-,*,/,%
         * Assignment Operators: =,+=,-=,*=,/=,%=
         * Comparison Operators: >,>=,<=,==,!=
         * Logical Operators: &&, ||, !
         * Bitwise Operators: &, |
         */

        System.out.println("--------- Assignment Operators ---------");
        int a = 10;
        System.out.println("a=10, now a= " + a);
        a += 10;
        System.out.println("a+=10, now a= " + a);
        a -= 10;
        System.out.println("a-=10, now a= " + a);
        a *= 10;
        System.out.println("a*=10, now a= " + a);
        a /= 10;
        System.out.println("a/=10, now a= " + a);

        System.out.println("--------- Arithmetic Operators ---------");
        int num1 = 10, num2 = 5;
        System.out.println("10 + 5 =" + (num1 + num2));
        System.out.println("10 - 5 =" + (num1 - num2));
        System.out.println("10 * 5 =" + (num1 * num2));
        System.out.println("10 / 5 =" + (num1 / num2));
        System.out.println("10 % 5 =" + (num1 % num2));

        System.out.println("--------- Comparison Operators ---------");
        System.out.println("10 + 5 =" + (num1 > num2));
        System.out.println("10 > 5 =" + (num1 >= num2));
        System.out.println("10 < 5 =" + (num1 < num2));
        System.out.println("10 <= 5 =" + (num1 <= num2));
        System.out.println("10 == 5 =" + (num1 == num2));
        System.out.println("10 != 5 =" + (num1 != num2));

        System.out.println("--------- Logical Operators ---------");
        System.out.println("num1 > num2 && num1!=num2=" + (num1 > num2 && num1 != num2));
        System.out.println("num1 > num2 || num1!=num2=" + (num1 > num2 || num1 != num2));
        System.out.println("!true =" + (!true));


    }
}
