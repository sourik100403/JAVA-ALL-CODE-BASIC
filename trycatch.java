package com.company;

public class trycatch {
    public static void main(String[] args) {
      int x=12,y=0,z;
      y++;
      try
      {
          z=x/y;
          System.out.println(z);
      }
      catch (ArithmeticException e)
      {
          System.out.println(e);
          System.out.println("division not possilble");
      }
    }
}
