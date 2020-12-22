package com.maximov;

public class Calculator{

    public static int sum(int x, int y){
        return x + y;
    }

    public static int substract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int divide(int x , int y){

        boolean yEqualToZero = y == 0;
        if (yEqualToZero) throw new ArithmeticException("Y is equal to zero");

        return x / y;

    }
}