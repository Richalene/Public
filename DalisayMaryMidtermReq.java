package Dalisay.Mary.MidtermReq; // Use a package name that reflects your project structure and follows naming conventions (lowercase letters).

import java.math.BigInteger; // Import necessary classes.
import java.util.Scanner;

public class DalisayMaryMidtermReq { // Follow class naming conventions
    
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Initialize Scanner for user input.
        //Follows the 4 space indent.
        // Input numbers
        System.out.print("Enter the first number: ");
        String num1Str = scanner.nextLine(); // Read input as a string to handle large numbers.
        BigInteger num1 = new BigInteger(num1Str); // Convert the string input to BigInteger.

        System.out.print("Enter the second number: ");
        String num2Str = scanner.nextLine(); // Read input as a string to handle large numbers.
        BigInteger num2 = new BigInteger(num2Str); // Convert the string input to BigInteger.

        // Invisible space (not necessary, can be removed)
        System.out.println("");

        // Operations and Output
        // Addition
        BigInteger sum = num1.add(num2); // Add
        System.out.println("Sum: " + sum); // Output

        // Subtraction
        BigInteger difference = num1.subtract(num2); // Subtract
        System.out.println("Difference: " + difference); // Output

        // Multiplication
        BigInteger product = num1.multiply(num2); // Multiply
        System.out.println("Product: " + product); // Output

        // Division
        BigInteger[] quotientAndRemainder = num1.divideAndRemainder(num2); // Perform division and get quotient and remainder
        BigInteger quotient = quotientAndRemainder[0]; // quotient
        BigInteger remainder = quotientAndRemainder[1]; // remainder
        System.out.println("Quotient = " + quotient + ", Remainder = " + remainder); // Output

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}
