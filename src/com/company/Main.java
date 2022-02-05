package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle1 = new Triangle();

    Triangle triangle2 = new Triangle(3,4,5);
    triangle2.getSides();

    Triangle triangle3 = new Triangle(45.0,45.0,90.0);
    triangle3.getAngles();

    Triangle triangle4 = new Triangle(4,5,6,60,60,60);
    triangle4.getSides();
    triangle4.getAngles();
    }
}
