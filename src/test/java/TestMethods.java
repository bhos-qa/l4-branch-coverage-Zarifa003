import org.junit.jupiter.api.Test;
import org.example.method;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMethods {

    method methods = new method();
    @Test
    public void testGcd() {
        // Test some pairs of integers with known GCD values
        assertEquals(1, methods.gcd(5, 7));
        assertEquals(2, methods.gcd(14, 6));
        assertEquals(3, methods.gcd(9, 6));
        assertEquals(4, methods.gcd(8, 12));
        assertEquals(5, methods.gcd(10, 15));
    }

    @Test
    public void testFactorial() {
        // Test factorial of positive numbers
        assertEquals(1, methods.Factorial(0));
        assertEquals(1, methods.Factorial(1));
        assertEquals(2, methods.Factorial(2));
        assertEquals(6, methods.Factorial(3));
        assertEquals(24, methods.Factorial(4));
        assertEquals(120, methods.Factorial(5));
    }
    @Test
    public void testIsPalindrome() {
        // Test palindromic strings
        assertTrue(methods.isPalindrome("racecar"));
        assertTrue(methods.isPalindrome("deified"));
        assertTrue(methods.isPalindrome("level"));

    }
    @Test
    public void testCalculateMean() {
        // Test with an array of positive numbers
        double[] positiveNumbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(3.0, methods.calculateMean(positiveNumbers), 0.0001); // Using delta for double comparison

        // Test with an array of negative numbers
        double[] negativeNumbers = {-1.0, -2.0, -3.0, -4.0, -5.0};
        assertEquals(-3.0, methods.calculateMean(negativeNumbers), 0.0001);

        // Test with an array containing only one number
        double[] singleNumber = {42.0};
        assertEquals(42.0, methods.calculateMean(singleNumber), 0.0001);
    }
    @Test
    public void testSquareRoot() {
        // Test square root of positive numbers
        assertEquals(0.0, methods.squareRoot(0.0), 0.0001); // Using delta for double comparison
        assertEquals(1.0, methods.squareRoot(1.0), 0.0001);
        assertEquals(2.0, methods.squareRoot(4.0), 0.0001);
        assertEquals(3.0, methods.squareRoot(9.0), 0.0001);
    }



}
