package com.tw.bootcamp;


import com.tw.bootcamp.Calculator;
import com.tw.bootcamp.Coordinates;

public class Line {

    private Coordinates start;
    private Coordinates end;

    public Line(Coordinates start,Coordinates end){
        this.start=start;
        this.end=end;
    }


    public int getLength(){
        return Calculator.calculate(start, end);
    }
}
