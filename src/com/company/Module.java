package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Module  extends Courses{

    Scanner sc;
    String moduleName;
    String Instructor;
    FileWriter fw;
    File file;

    public  void Level4Modules() throws IOException {

        sc = new Scanner(System.in);
        file = new File(moduleName= sc.nextLine());
        fw=new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);

        for (int i=4;i<5;i++){

            System.out.println("Enter the name of module");
            moduleName = sc.nextLine();
            System.out.println("Enter the name of instructor");
            Instructor= sc.nextLine();

        }

        fw.write(moduleName+"is taught by"+Instructor+"\n");

        fw.close();

        System.out.println(moduleName+" "+Instructor);







    }

    public  void Level5Modules() throws IOException {

        sc = new Scanner(System.in);
        file = new File("BITLevel5.txt");
        fw=new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);

        for (int i=4;i<5;i++){

            System.out.println("Enter the name of module");
            moduleName = sc.nextLine();
            System.out.println("Enter the name of instructor");
            Instructor= sc.nextLine();

        }

        fw.write(moduleName+"is taught by"+Instructor+"\n");


        fw.close();

        System.out.println(moduleName+" "+Instructor);








    }
    public  void Level6Modules() throws IOException {

        sc = new Scanner(System.in);
        file = new File("BITLevel6.txt");
        fw=new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);



            System.out.println("Enter the name of module");
            moduleName = sc.nextLine();
            System.out.println("Enter the name of instructor");
            Instructor= sc.nextLine();




        fw.write(moduleName+" is  \t"+" taught by"+" "+Instructor+"\n\n");

        fw.close();

        System.out.println(moduleName+" "+Instructor);







    }

    public static void main(String[] args) throws IOException {
       Module m = new Module();
       m.Level6Modules();
    }



}
