/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 * @author ijonezi
 */

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;


public class calcTest {

    public int randomRange(int start, int end) {
        Random random = new Random();
        int number = random.nextInt((end - start) + 1) + start;
        return number;
    }

    @Test
    public void calculatorInit() {
        calculator calculator = new calculator(0, 0);
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void validAddFive() {
        int valueA = randomRange(0, 10);
        int total = valueA + 5;
        calculator calculator = new calculator(valueA, 5);
        calculator.add();
        assertEquals(total, calculator.getValue());
    }

    @Test
    public void validMinusTwo() {
        int valueA = randomRange(0, 10);
        int total = valueA - 2;
        calculator calculator = new calculator(valueA, 2);
        calculator.subtract();
        assertEquals(total, calculator.getValue());
    }

    @Test
    public void validMultiplyTwo() {
        int valueA = randomRange(0, 10);
        int total = valueA * 2;
        calculator calculator = new calculator(valueA, 2);
        calculator.multiply();
        assertEquals(total, calculator.getValue());
    }

    @Test
    public void validDivisionTwo() {
        int valueA = randomRange(0, 10);
        int total = valueA / 2;
        calculator calculator = new calculator(valueA, 2);
        calculator.division();
        assertEquals(total, calculator.getValue());
    }
}
