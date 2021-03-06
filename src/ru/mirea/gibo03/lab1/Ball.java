package ru.mirea.gibo03.lab1;
import java.lang.System;

public class Ball {

    private String color;
    private int radius;

    public Ball(String c, int r) {
        color = c;
        radius = r;
    }

    public Ball(String c) {
        color = c;
        radius = 0;
    }

    public Ball() {
        color = "Pink";
        radius = 15;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return this.color + " ball, radius = " + this.radius;
    }

    public void volumeOfBall() {
        System.out.println(" Ball with " + color + " color has a volume of " + (4.0/3.0) * Math.PI * radius*radius);
    }

}
