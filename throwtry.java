package com.company;

public class throwtry {
    public static void main(String[] args) {
        ArithmeticException ob=new ArithmeticException();
        try
        {
            throw ob;
//            System.out.println("inside the try block");
        }
        catch (ArithmeticException e)
        {
            System.out.println("inside catch block");
        }
    }
}
