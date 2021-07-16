package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    int input;
    Scanner main;

    public static void main(String[] args) throws NoSuchMethodException, IOException {
        // write your code here

        Main m = new Main();
        m.mainUI();
    }

    public void mainUI() throws NoSuchMethodException, IOException {

        main = new Scanner(System.in);

        System.out.println("\t\t*******************************Welcome to Course Registration System**************************");
        System.out.println("\t\t**********************************************************************************************");

        System.out.println("Please Select an option Below \n1.Student \n2.CourseAdmin \n3.Instructor");
        System.out.println("\t\t**********************************************************************************************");
        System.out.println("\t\t**********************************************************************************************");

        input = main.nextInt();

        if (input == 1) {

            Student student = new Student();
            student.studentUI();
        }

        if (input == 2) {


           Admin ad = new Admin();
          Courses c = new Courses();
          c.courseUI();

        }

        if (input == 3) {

            Instructor ins= new Instructor();
            ins.giveMarks();

        }

    }
}
