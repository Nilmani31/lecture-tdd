package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void additionTest(){
        var calculator = new Calculator();
        var result = calculator.Addition(3, 5);
        System.out.println(result);
        assertEquals(8,result);
    }
    @Test
    public void substractionTest(){
        var calculator = new Calculator();
        var result1 = calculator.substraction(45, 5);
        System.out.println(result1);
        assertEquals(40,result1);
        var result2 = calculator.substraction(4, 5);
        System.out.println(result2);
        assertEquals(-1,result2);
    }

}
