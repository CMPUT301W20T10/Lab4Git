package com.cmput301w20t10.lab4git;

public abstract class Shape {

    protected int x;
    protected int y;

    private String color = "RED";

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setColor(String color) {this.color = color;}
    
    public String getColor() {return color;}
}
