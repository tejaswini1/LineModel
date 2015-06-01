package com.tw.bootcamp;
import com.tw.bootcamp.Calculator;
import com.tw.bootcamp.Coordinates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calculateTest(){

        assertEquals(3, Calculator.calculate(new Coordinates(2,4),new Coordinates(5,4)));
    }
}
