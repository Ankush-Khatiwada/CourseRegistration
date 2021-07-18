package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Result {

    File file;
    PrintWriter pw;
    private Scanner sc;
    private String studentName;
    private int studentID;
    private String courseName;
    private int level;
    private int Marks;
    private int level4;
    private int level5;
    private int level6;

    public void ResultUI() throws FileNotFoundException {
        sc = new Scanner(System.in);

        System.out.println("Welcome Instructore please give marks to the students");
        System.out.println("Enter the Name of student");
        studentName = sc.next();
        System.out.println("Enter the Student ID");
        studentID = sc.nextInt();
        System.out.println("Enter the name  of Course");
        courseName = sc.next();
        System.out.println("Enter the Level ");
        level = sc.nextInt();

        try {
            file = new File(studentName + ".txt");
            pw = new PrintWriter(file);

            if (!file.exists()) {

                file.createNewFile();
                System.out.println("New File Created Sucessfully");
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        if (level == 4) {


            System.out.println("Enter the Marks for : Java");
            int JavaMarks = sc.nextInt();
            System.out.println("Enter the marks for Python");
            int PythonMarks = sc.nextInt();
            System.out.println("Enter the Marks for : Software Analysis");
            int SoftwareMarks = sc.nextInt();
            System.out.println("Enter the marks for Database");
            int DatabaseMarks = sc.nextInt();

            System.out.println("Java:" + JavaMarks);
            System.out.println("Python:" + PythonMarks);
            System.out.println("Software Analysis:" + SoftwareMarks);
            System.out.println("Database:" + DatabaseMarks);

            int total = JavaMarks + PythonMarks + SoftwareMarks + DatabaseMarks;
            int Grade = total / 4;
            System.out.println("Your Percentage is : " + Grade + "%");

            if (Grade <= 39) {

                System.out.println("Sorry you are not promoted to next Semester");
            } else {

                System.out.println("Congratulation you are promoted to next Semester");
            }
            pw.write("Name:"+studentName + " \nCourse:" + courseName + "\nLevel:" + level + "\nJavaMarks:" + JavaMarks + "\nPythonMarks:" + PythonMarks + "\nTotalGrade:" + Grade);
            pw.close();


        }

        if (level == 5) {


            System.out.println("Enter the Marks for : Software Engineering");
            int SoftwareEngineering = sc.nextInt();
            System.out.println("Enter the marks for Web development");
            int WebDevelopment = sc.nextInt();
            System.out.println("Enter the Marks for : Database Management System");
            int DatabaseManagementSystem = sc.nextInt();
            System.out.println("Enter the marks for : Introduction to oops");
            int IntroductiontoOOps = sc.nextInt();

            System.out.println("Software Engineering:" + SoftwareEngineering);
            System.out.println("Web Development:" + WebDevelopment);
            System.out.println("Database Management System:" + DatabaseManagementSystem);
            System.out.println("Introduction to oops:" + IntroductiontoOOps);

            int total = SoftwareEngineering + WebDevelopment + DatabaseManagementSystem + IntroductiontoOOps;
            int Grade = total / 4;
            System.out.println("Your Percentage is : " + Grade + "%");

            if (Grade <= 39) {

                System.out.println("Sorry you are not promoted to next Semester");
                pw.write("Sorry you are not promoted to next Semester");
            } else {

                System.out.println("Congratulation you are promoted to next Semester");
                pw.write("You are promoted to next semester");
            }
            pw.write(studentName + " \n" + courseName + "\n" + level + "\nSoftware Engineering\t" + SoftwareEngineering + "\nWebDevelopment\t" + WebDevelopment + "\nDatabaseManagementSystem:" + DatabaseManagementSystem + "\nIntroduction to OOps:\t" + IntroductiontoOOps + "\nGrade:\t" + Grade);
            pw.close();


        }

        if (level == 6) {


            System.out.println("Enter the Marks for : Java");
            int JavaMarks = sc.nextInt();
            System.out.println("Enter the marks for Python");
            int PythonMarks = sc.nextInt();
            System.out.println("Enter the Marks for : Software Analysis");
            int SoftwareMarks = sc.nextInt();
            System.out.println("Enter the marks for Database");
            int DatabaseMarks = sc.nextInt();

            System.out.println("Java:" + JavaMarks);
            System.out.println("Python:" + PythonMarks);
            System.out.println("Software Analysis:" + SoftwareMarks);
            System.out.println("Database:" + DatabaseMarks);

            int total = JavaMarks + PythonMarks + SoftwareMarks + DatabaseMarks;
            int Grade = total / 4;
            System.out.println("Your Percentage is : " + Grade + "%");

            if (Grade  <=39) {

                System.out.println("Sorry you are not promoted to next Semester");
                pw.write("You Need to give resit on the module you have grade less than 39");
            } else {

                System.out.println("Congratulation you are promoted to next Semester");
                pw.write("Congratulations You are promoted to next semester");
            }
            pw.write("Name:"+studentName + " \nCourse:" + courseName + "\nLevel:\n" + level + "\nJavaMarks:\n" + JavaMarks + "\nPythonMarks:\n" + PythonMarks + "\nTotalGrade:\n" + Grade);
            pw.close();


        }


    }


}
