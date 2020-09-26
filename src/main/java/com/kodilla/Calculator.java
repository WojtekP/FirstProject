package com.kodilla;

public class Calculator {
    public int adding(int first, int second){
        return first + second;
    }
    public int substract(int first, int second){
        return first - second;
    }
    public int divide(int first, int second){
        return first / second;
    }
    public int multiplication(int first, int second){
        return first * second;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.adding(5,20));
        System.out.println(calculator.divide(10,5));
        System.out.println(calculator.substract(50,10));
        System.out.println(calculator.multiplication(2,100));




    }
}
