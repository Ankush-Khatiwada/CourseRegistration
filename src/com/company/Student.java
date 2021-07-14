package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student {

    int input;
    Scanner scan;
    private String name;
    private int id;
    private int level;
    private String Course;

    public static void main(String[] args) throws IOException {

        Student student = new Student();
        student.register();

    }

    public void studentUI() throws NoSuchMethodException, IOException {
        scan = new Scanner(System.in);
        System.out.println("\t\t*******************************Welcome to  Student Interface**************************");
        System.out.println("\t\t**********************************************************************************************");

        System.out.println("Please Select an option Below \n1.Register Course \n2.View Module Instructor \n3.View Result\n4.get back to main menu\n5. Get back to student menu");
        System.out.println("\t\t**********************************************************************************************");
        System.out.println("\t\t**********************************************************************************************");

        input = scan.nextInt();

        if (input == 1) {

            register();
        }

        if (input == 2) {

            viewModulesofEachLevel();

        }

        if (input == 3) {

            viewResult();
        }

        if (input == 4) {

            studentUI();
        }
        if (input == 5) {
            Main m = new Main();
            m.mainUI();
        }


    }

    public void register() throws IOException {

        File file = new File("StudentCourse.txt");
        FileWriter fw = new FileWriter("StudentCourse.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        scan = new Scanner(System.in);

        System.out.println("************Registration**********************");
        System.out.println("Enter your name");
        name = scan.next();

        System.out.println("Enter your ID");
        id = scan.nextInt();
        System.out.println("Enter the name of your Desired Course");
        Course = scan.next();

        System.out.println("Enter your level");
        level = scan.nextInt();

        System.out.println("Your name is" + name + "Your id is " + id + "And your desired course is" + Course);

        pw.write("\tName: \t" + name + "\t ID:  \t" + id + " \tCourse\t " + Course + "\n" + System.lineSeparator());

        pw.close();
        pw.println("Name=" + name + " Course Enrolled: " + Course);


    }

    public void viewModulesofEachLevel() {

        System.out.println("View Your Modules");


    }

    public void viewResult() {

        System.out.println("View your Result Here");

    }
}
