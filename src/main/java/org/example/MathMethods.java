package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;


public class MathMethods {
    // 1st method
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2nd method
    public static int gcd(int a, int b) {  // method to calc greatest common divisor (GCD)
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    // 3rd method
    public static int generateRandomInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min must be less than or equal to max.");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    // 4th method
    public static double calculateMean(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }
        double sum = Arrays.stream(numbers).sum();
        return sum / numbers.length;
    }
    // 5th method
    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    // 6th method
    public static double calculateHypotenuse(double leg1, double leg2) {
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }
    // 7th method
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    // 8 th method
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    // 9th method
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers.");
        }
        return Math.sqrt(number);
    }


    public class PathTraversalVulnerability {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a file path: ");
            String filePath = scanner.nextLine();

            File file = new File(filePath); // Intentionally vulnerable code (no path validation)
            System.out.println("File exists: " + file.exists());

            scanner.close();
        }
    }
}
