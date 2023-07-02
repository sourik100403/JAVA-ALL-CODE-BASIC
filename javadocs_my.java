package com.company;
/**
 * This is a java docs documentation which help to read this page.
 * this is a <i>italic</i>word<p>This is new Paragraph</p>
 * @author Sourik
 * @version 0.0.1
 * @since 2023
 * @see Java Docs
*/

public class javadocs_my {
    /**
     * this is add method add two integer number
     * @param a These is the first number to add
     * @param b These is the second number to add
     * @return These is the result of add return as a integer.
     * @throws Exception if i ==0 throw exception.
     * @deprecated  this method is deprecated please use + operator
     */
    public int add(int a,int b) throws Exception{
        if(a==0){
            throw new Exception();
        }
       int c;
       c=a+b;
       return c;
    }

    /**
     * 
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("this ios my main method");

    }
}
