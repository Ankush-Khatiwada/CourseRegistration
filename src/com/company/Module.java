package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Module extends Admin {

    Scanner sc;
    String moduleName;
    String Instructor;
    FileWriter fw;
    File file;
    File Level5file;
    ArrayList level4Module;

    public  void Level4Modules() throws IOException {

        sc = new Scanner(System.in);
        Level5file = new File("BITLevel4.txt");
        fw=new FileWriter(Level5file,true);
        PrintWriter pw = new PrintWriter(fw);



        System.out.println("Enter the name of module");
        moduleName = sc.nextLine();
        System.out.println("Enter the name of instructor");
        Instructor= sc.nextLine();



        fw.write(moduleName+" is  "+" taught by"+" "+Instructor+"\n");

        fw.close();










    }

    public  void Level5Modules() throws IOException {

        sc = new Scanner(System.in);
        Level5file = new File("BITLevel5.txt");
        fw=new FileWriter(Level5file,true);
        PrintWriter pw = new PrintWriter(fw);



            System.out.println("Enter the name of module");
            moduleName = sc.nextLine();
            System.out.println("Enter the name of instructor");
            Instructor= sc.nextLine();



        fw.write(moduleName+" is "+" taught by"+" "+Instructor+"\n");

        fw.close();






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



        fw.write(moduleName+" is "+" taught by"+" "+Instructor+"\n");

        fw.close();

        System.out.println(moduleName+" "+Instructor);



    }


    public void changeModule() {
        String[] Module = {"WebDevelopment", "Embedded System", "Data Analysis"};
        String module;
        System.out.println("****Chsnge Module Name" + Module);
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < Module.length; i++) {

            if (Module[i].equals("WebDevelopment")) {

                Module[i] = "Introduction to HTML and CSS";
            }
            if (Module[i].equals("Embedded System")) {

                Module[i] = "IoT";


            }
            if (Module[i].equals("Data Analysis")) {

                Module[i] = "Explotary Data Analysis";

            }

            System.out.println(Module[i]);
        }


        System.out.println("Module changeed sucessfully");
    }

    public static void main(String[] args) throws IOException {


        Module m = new Module();
        m.Level5Modules();
    }

}
