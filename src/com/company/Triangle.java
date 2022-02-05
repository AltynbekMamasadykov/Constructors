package com.company;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    private double angleA;
    private double angleB;
    private double angleC;

    public Triangle(){
        System.out.println("default constructor");
    }

    public Triangle(int sideA,int sideB,int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        System.out.println("assigned only sides of triangle");
    }

    public Triangle(double angleA,double angleB,double angleC){
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
        System.out.println("assigned only angles of triangle");
    }

    public Triangle(int sideA,int sideB,int sideC,double angleA,double angleB,double angleC){
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        System.out.println("all sides and angles of triangle assigned");
    }

    public void setSideA(int sideA){
        this.sideA = sideA;
    }

    public int getSideA(){
        return sideA;
    }

    public void setSideB(int sideB){
        this.sideB = sideB;
    }

    public int getSideB(){
        return sideB;
    }

    public void setSideC(int sideC){
        this.sideC = sideC;
    }

    public int getSideC(){
        return sideC;
    }

    public void setAngleA(double angleA){
        this.angleA = angleA;
    }

    public double getAngleA(){
        return angleA;
    }

    public void setAngleB(double angleB){
        this.angleB = angleB;
    }

    public double getAngleB(){
        return angleB;
    }

    public void setAngleC(double angleC){
        this.angleC = angleC;
    }

    public double getAngleC(){
        return angleC;
    }

    public void getSides(){
        System.out.println("side a :"+getSideA());
        System.out.println("side b :"+getSideB());
        System.out.println("side c :"+getSideC());
    }

    public void getAngles(){
        System.out.println("angle a :"+getAngleA());
        System.out.println("angle b :"+getAngleB());
        System.out.println("angle c :"+getAngleC());
    }
}
