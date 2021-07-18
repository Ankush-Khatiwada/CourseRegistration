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

        System.out.println("Please Select an option Below \t\t\t\t\t\t\t\t\t\t\n1.Student \t\t\t\t\t\t\t\t\t\t\n2.CourseAdmin \t\t\t\t\t\t\t\t\t\n3.Instructor");
        System.out.println("\t\t**********************************************************************************************");
        System.out.println("\t\t**********************************************************************************************");

        input = main.nextInt();

        if (input == 1) {

            Student student = new Student();
            student.studentUI();
        }

        if (input == 2) {


           Admin ad = new Admin();
          Courses c = new Courses() {
              @Override
              public void courseUI() throws IOException {

                  System.out.println("Please select the option \n1.Add COurse \n2.Delete Course \n3.View Course \n4.Cancel Course");
                  select = sc.nextInt();

                  if (select == 1) {

                      addCourse();
                  }
                  if (select == 2) {

                      DeleteCourseByID();
                  }
                  if (select == 3) {

                      viewCourse();
                  }
                  if (select == 4) {

                      cancelCourse();
                  }


              }
          };
          c.courseUI();

        }

        if (input == 3) {

            Instructor ins= new Instructor();
            ins.InstructorUI();



        }

    }
}
