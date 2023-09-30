import org.junit.jupiter.api.Test;
import org.example.method;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMethods {
    @Test
    public void testGcd() {
        // Test some pairs of integers with known GCD values
        assertEquals(1, method.gcd(5, 7));
        assertEquals(2, method.gcd(14, 6));
        assertEquals(3, method.gcd(9, 6));
        assertEquals(4, method.gcd(8, 12));
        assertEquals(5, method.gcd(10, 15));
    }

    @Test
    public void testFactorial() {
        // Test factorial of positive numbers
        assertEquals(1, method.Factorial(0));
        assertEquals(1, method.Factorial(1));
        assertEquals(2, method.Factorial(2));
        assertEquals(6, method.Factorial(3));
        assertEquals(24, method.Factorial(4));
        assertEquals(120, method.Factorial(5));
    }
    @Test
    public void testIsPalindrome() {
        // Test palindromic strings
        assertTrue(method.isPalindrome("racecar"));
        assertTrue(method.isPalindrome("deified"));
        assertTrue(method.isPalindrome("level"));

    }
    @Test
    public void testCalculateMean() {
        // Test with an array of positive numbers
        double[] positiveNumbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(3.0, method.calculateMean(positiveNumbers), 0.0001); // Using delta for double comparison

        // Test with an array of negative numbers
        double[] negativeNumbers = {-1.0, -2.0, -3.0, -4.0, -5.0};
        assertEquals(-3.0, method.calculateMean(negativeNumbers), 0.0001);

        // Test with an array containing only one number
        double[] singleNumber = {42.0};
        assertEquals(42.0, method.calculateMean(singleNumber), 0.0001);
    }
    @Test
    public void testSquareRoot() {
        // Test square root of positive numbers
        assertEquals(0.0, method.squareRoot(0.0), 0.0001); // Using delta for double comparison
        assertEquals(1.0, method.squareRoot(1.0), 0.0001);
        assertEquals(2.0, method.squareRoot(4.0), 0.0001);
        assertEquals(3.0, method.squareRoot(9.0), 0.0001);
    }



}
