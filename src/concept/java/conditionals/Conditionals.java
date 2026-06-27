package concept.java.conditionals;

public class Conditionals {
    static void main(String[] args) {
        System.out.println("Conditionals in Java");
        /*
         * Conditionals: Conditionals are used for execute code on condition basis
         * 1. if-statement
         * 2. if-else-statement
         * 3. if-else ladder
         * 4. switch
         */
        // if statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible for driving...");
        }
        // if-else statement
        if (age >= 18) {
            System.out.println("You are eligible for driving...");
        } else {
            System.out.println("You are not eligible for driving...");
        }
        // nested if-else statement or if-else ladder
        String day = "Tuesday";
        if (day.equals("Saturday")) {
            System.out.println("The day is " + day);
        } else if (day.equals("Sunday")) {
            System.out.println("The day is " + day);
        } else if (day.equals("Monday")) {
            System.out.println("The day is " + day);
        } else if (day.equals("Tuesday")) {
            System.out.println("The day is " + day);
        } else if (day.equals("Wednesday")) {
            System.out.println("The day is " + day);
        } else if (day.equals("Thurusday")) {
            System.out.println("The day is " + day);
        } else if (day.equals("Friday")) {
            System.out.println("The day is " + day);
        } else {
            System.out.println("The day is not valid");
        }
        System.out.println("----------------Switch-case Statement----------------");
        // switch case statement --> Short hand
        switch (day) {
            case "Saturday", "Monday", "Wednesday", "Thursday", "Friday", "Tuesday", "Sunday":
                System.out.println("The day is " + day);
                break;
            default:
                System.out.println("The day is not valid");
        }
        // NOTE: without break statement all case will be executed
//        switch (day) {
//            case "Saturday":
//                System.out.println("The day is " + day);
//            case "Sunday":
//                System.out.println("The day is " + day);
//            case "Monday":
//                System.out.println("The day is " + day);
//            case "Tuesday":
//                System.out.println("The day is " + day);
//            case "Wednesday":
//                System.out.println("The day is " + day);
//            case "Thrusday":
//                System.out.println("The day is " + day);
//            case "Friday":
//                System.out.println("The day is " + day);
//            default:
//                System.out.println("The day is not valid");
//        }
    }
}
