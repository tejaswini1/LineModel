package com.tw.bootcamp;
import com.tw.bootcamp.Coordinates;

import org.junit.*;
import static org.junit.Assert.*;

public class CoordinatesTest {

    @Test
    public void getCordinatesTest(){

        assertEquals(3,new Coordinates(3,4).getX());
    }
}