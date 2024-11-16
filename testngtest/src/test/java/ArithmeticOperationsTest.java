
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.example.testngtest.ArithmeticOperations;

public class ArithmeticOperationsTest {

    private final ArithmeticOperations arithmetic = new ArithmeticOperations();

    @Test
    public void testAddition() {
        assertEquals(arithmetic.add(2, 3), 5);
    }

    @Test
    public void testSubtraction() {
        assertEquals(arithmetic.subtract(5, 3), 2);
    }

    @Test
    public void testMultiplication() {
        assertEquals(arithmetic.multiply(5, 3), 15);
    }

    @Test
    public void testDivision() {
        assertEquals(arithmetic.divide(5, 2), 2.5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        arithmetic.divide(5, 0);
    }
}