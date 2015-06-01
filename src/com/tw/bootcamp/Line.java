package com.tw.bootcamp;

public class Line {

    private int startX,endX;
    private int startY,endY;


    public Line(int startX,int startY,int endX,int endY){
        this.endX=endX;
        this.endY=endY;
        this.startX=startX;
        this.startY=startY;
    }


    public int length(){
        return Calculator.calculate(startX,startY,endX, endY);
    }
}
