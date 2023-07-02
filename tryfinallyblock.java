package com.company;

public class tryfinallyblock {
    public static void main(String[] args) {
        try
        {
            int x=25,y=0,z;
            z=x/y;
            System.out.println("result="+z);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block always run");
        }
        System.out.println("rest of code");
    }
}
