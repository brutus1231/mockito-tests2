package pl.sda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void divide() {
        //given
        Calculator calculator = new Calculator();

        //when
        //then
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10,0)
        );
    }
}