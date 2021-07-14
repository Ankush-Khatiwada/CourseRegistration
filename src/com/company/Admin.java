package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

    public  String CourseName;
    public PrintWriter printWriter;
    public Scanner sc;
    public File file;
    public FileWriter fw;



}
class Courses extends Admin{

  Scanner sc = new Scanner(System.in);



    public void addCourse() throws IOException {
        File f = new File("course.txt");
        FileWriter fw = new FileWriter("course.txt");

        ArrayList course = new ArrayList();


        System.out.println("ENter the name of course");
        course.add(sc.nextLine());


      for (int counter=0;counter<course.size(); counter++){

          System.out.println(course.get(counter));

      }






        }

        public void  cancelCourse() throws IOException{

        File file = new File("removedcourse.txt");
        FileWriter fw = new  FileWriter(file);

        ArrayList removed = new ArrayList();

            System.out.println(" Enter the name of the course you want to remove  :");
            removed.add(sc.nextLine());


fw.write(String.valueOf(removed));
fw.close();







        }






    public static void main(String[] args) throws IOException {

        Admin  ad = new Admin();

    Courses c = new Courses();
    c.cancelCourse();

    }



}