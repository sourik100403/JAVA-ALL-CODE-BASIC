package com.company;

public class lec7_string_charat {
    public static void main(String[] args) {
        String s="sourik";
        String s3="  SoUrIk";
        char ch=s.charAt(2);
        boolean ch2=s.endsWith("k");
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(s.length());
        System.out.println(s.replace("sourik","parui"));
        System.out.println(s.compareTo("sourik"));
        System.out.println(s.compareToIgnoreCase("SOURIK"));
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf("u"));
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,2));
        System.out.println(s3);
        System.out.println(s3.trim());
        System.out.println(s.equals(s3));
        System.out.println(s.equalsIgnoreCase(s3));
    }
}
