package homework161;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
        System.out.println("Object: " + calculator.hashCode());
    }

    @Test
    void additionTest() {
        System.out.println("additionTest");
        double result = calculator.addition(3.7, 6.3);
        Assertions.assertEquals(10, result);
    }

    @Test
    void subtractionTest() {
        System.out.println("subtractionTest");
        double result = calculator.subtraction(5, 5);
        Assertions.assertEquals(0, result);

    }

    @Test
    void multiplyTest() {
        System.out.println("multiplyTest");
        double result = calculator.multiplication(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    void dividingTest() {
        System.out.println("dividingTest");
        double result = calculator.dividing(5, 1);
        Assertions.assertEquals(5, result);
    }
}
