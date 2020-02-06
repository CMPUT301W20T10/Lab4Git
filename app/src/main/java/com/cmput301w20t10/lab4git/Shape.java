package com.cmput301w20t10.lab4git;

public abstract class Shape {
    protected String color = "Neon Brown";

    protected int x;
    protected int y;

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
}
