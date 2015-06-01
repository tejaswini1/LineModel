package com.tw.bootcamp;


public class Calculator {

    public static int calculate(Coordinates start,Coordinates end) {
         int x=start.getX()-end.getX();
         int y=start.getY()-end.getY();
     return (int)(Math.sqrt((x*x)-(y*y)));
    }
}
