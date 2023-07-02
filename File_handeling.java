package com.company;

import java.io.*;
import java.util.Scanner;

public class File_handeling {
    public static void main(String[] args) {
        // code to create a new file
//        File myFile=new File("myfile.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("unable to create file");
//            e.printStackTrace();
//        }

        //code to write a file
//        try {
//            FileWriter myfile=new FileWriter("myfile.txt");
//            myfile.write("this is my first write in a file \n khkd dsh ghsdk hkhdk \n hkb khwkh  djkshsjg");
//            myfile.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // read a file
//        File myfile= new File("myfile.txt");
//        try{
//            Scanner sc=new Scanner(myfile);
//            while(sc.hasNextLine()){
//                String line=sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }


        //delete a file
        File myfile= new File("myfile.txt");
        if(myfile.delete()){
            System.out.println("i have deleted trhe file" + myfile.getName());
        }
        else
        {
            System.out.println(" some error occure when i try to delete "+ myfile.getName() +"this file");
        }




    }
}
