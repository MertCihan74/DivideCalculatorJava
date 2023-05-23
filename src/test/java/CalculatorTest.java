/*
Student ID: B201202024
Name: Mert Cihan
Surname: Bayır
Course Name: Software Verification and Validation
Homework Number: Homework#1
Repository Adress: https://github.com/MertCihan74/DivideCalculatorJava.git
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() { assertEquals(2.5, Calculator.divide(12.5, 5)); }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5));
    }

    @Test
    void testDivision5() {
        assertEquals(5, Calculator.divide(12.5, 2.5));
    }

    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );

    }
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",         //testDivision1
            "10, 4, 2.5",       //testDivision2
            "12.5, 5, 2.5",     //testDivision3
            "10, 2.5, 4",       //testDivision4
            "12.5, 2.5, 5"      //testDivision5
    })
    void dataDrivenDivision(double dividend, double divisor, double expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor),
                "The result of Calculator.divide method is incorrect.");
    }
}