package org.example;
import java.util.Scanner;
public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters
    public static void shortString(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = scanner.nextLine();
        int str1l = str1.length();
        if (str1l < 5) {
            System.out.println("String is less than 5 characters");
        } else {
            System.out.println("String is at least 5 characters");

        }
    }



    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static char firstLetter(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str2 = scanner.nextLine();
        return str2.charAt(0);

    }




    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String censorAsparagus(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str3 = scanner.nextLine();
        return str3.replace("asparagus","****");
        }

    }





    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.

    public static String bigger(String str3, String str4) {
        if (str4.length() > str3.length()) {
            return str4;
        } else {
            return str3;
        }
    }



}
