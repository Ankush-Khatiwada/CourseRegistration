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

  int select;

  public void courseUI() throws IOException {


      System.out.println("Please select the option \n1.Add COurse \n2.Cancel COure");
      select =sc.nextInt();

      if (select == 1){

          addCourse();
      }else {

          cancelCourse();
      }



  }

    public void addCourse() throws IOException {
        File f = new File("course.txt");
        FileWriter fw = new FileWriter(f);
        Scanner coursescan=new Scanner(System.in);

        ArrayList course = new ArrayList();


        System.out.println("Enter the name of course");
        course.add(coursescan.nextLine());


      for (int counter=0;counter<course.size(); counter++){

          System.out.println(course.get(counter));

      }






        }

        public void  cancelCourse() throws IOException{

        File file = new File("removedcourse.txt");
        FileWriter fw = new  FileWriter(file);

        ArrayList removed = new ArrayList();

            System.out.println(" Enter the name of the course you want to cancel  :");
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