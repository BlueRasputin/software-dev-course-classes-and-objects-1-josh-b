package org.example;
import java.util.Scanner;

public class Calculator {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            System.out.println("The sum is " + add(a, b));
            System.out.println("The difference is " + subtract(a, b));
            System.out.println("The product is " + multiply(a, b));
            System.out.println("The quotient is " + divide(a, b));
        }


        // Add a static function called add that takes two int parameters and returns their sum (as an int)

        public static int add( int a, int b ) {

            return a + b;

        }

        // Add a static function called subtract that takes two int parameters and returns their difference (as an int)

        public static int subtract( int a, int b ) {

            return a - b;

        }



    // Add a static function called multiply that takes two int parameters and returns their product (as an int)

        public static int multiply( int a, int b ) {

            return a * b;

        }



    // Add a static function called divide that takes two int parameters and returns their quotient (as an int)

        public static int divide( int a, int b) {
            return a / b;
        }

    }
}
