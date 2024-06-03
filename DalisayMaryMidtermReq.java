package Dalisay.Mary.MidtermReq;
import java.math.BigInteger;
import java.util.Scanner;

public class DalisayMaryMidtermReq {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // Input numbers
    System.out.print("Enter the first  number: ");
    String num1Str = scanner.nextLine();
    BigInteger num1 = new BigInteger(num1Str);

    System.out.print("Enter the second number: ");
    String num2Str = scanner.nextLine();
    BigInteger num2 = new BigInteger(num2Str);

    // Invisible space
    System.out.println("");
    
    // Operations and Output
    // Addition
    BigInteger sum = num1.add(num2);
    System.out.println("Sum: " + sum);

    //Subtraction
    BigInteger difference = num1.subtract(num2);
    System.out.println("Difference: " + difference);

    // Multiplication
    BigInteger product = num1.multiply(num2);
    System.out.println("Product: " + product);

     // Division
    BigInteger[] quotientAndRemainder = num1.divideAndRemainder(num2);
    BigInteger quotient = quotientAndRemainder[0];
    BigInteger remainder = quotientAndRemainder[1];
    System.out.println("Quotient = " + quotient + ", Remainder = " + remainder);
    }
}

