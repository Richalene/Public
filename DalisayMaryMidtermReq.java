package Dalisay.Mary.MidtermReq; // Use a package name that reflects your project structure and follows naming conventions (lowercase letters).

import java.math.BigInteger; // Import necessary classes.
import java.util.Scanner;

public class DalisayMaryMidtermReq { // Follow class naming conventions: PascalCase and file name should match the class name.
    
    public static void main(String[] args) { // Main method: entry point of the application.
        Scanner scanner = new Scanner(System.in); // Initialize Scanner for user input.

        // Input numbers
        System.out.print("Enter the first number: ");
        String num1Str = scanner.nextLine(); // Read input as a string to handle large numbers.
        BigInteger num1 = new BigInteger(num1Str); // Convert the string input to BigInteger.

        System.out.print("Enter the second number: ");
        String num2Str = scanner.nextLine(); // Read input as a string to handle large numbers.
        BigInteger num2 = new BigInteger(num2Str); // Convert the string input to BigInteger.

        // Invisible space (not necessary, can be removed or replaced with a comment for clarity)
        System.out.println("");

        // Operations and Output
        // Addition
        BigInteger sum = num1.add(num2); // Perform addition operation.
        System.out.println("Sum: " + sum); // Output the result.

        // Subtraction
        BigInteger difference = num1.subtract(num2); // Perform subtraction operation.
        System.out.println("Difference: " + difference); // Output the result.

        // Multiplication
        BigInteger product = num1.multiply(num2); // Perform multiplication operation.
        System.out.println("Product: " + product); // Output the result.

        // Division
        BigInteger[] quotientAndRemainder = num1.divideAndRemainder(num2); // Perform division operation and get quotient and remainder.
        BigInteger quotient = quotientAndRemainder[0]; // Extract quotient.
        BigInteger remainder = quotientAndRemainder[1]; // Extract remainder.
        System.out.println("Quotient = " + quotient + ", Remainder = " + remainder); // Output the result.

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}
