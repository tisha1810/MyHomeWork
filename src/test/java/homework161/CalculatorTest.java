package homework161;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
        System.out.println("New calculator: " + calculator.hashCode());

    }

    @Test
    void additionTest() {
        System.out.println("Addition Test");
        double result = calculator.addition(5, 5);
        Assertions.assertEquals(10, result);
    }

    @Test
    void subtractionTest() {
        System.out.println("Subtraction Test");
        double result = calculator.subtraction(5, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    void multiplyTest() {
        System.out.println("Multiplication Test");
        double result = calculator.multiplication(5, 2);
        Assertions.assertEquals(10, result);
    }

    @Test
    void dividingTest() {
        System.out.println("Dividing Test");
        double result = calculator.dividing(2, 2);
        Assertions.assertEquals(1, result);
    }
}