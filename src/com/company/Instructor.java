package com.company;

import java.io.*;
import java.time.Instant;
import java.util.Scanner;

public class Instructor extends Result {

    int select;
    Scanner uiScan;
    public void InstructorUI() throws IOException {
uiScan=new Scanner(System.in);
        System.out.println("Select an Option \n1.Give Marks \n2.Student Enrollment");
        select = uiScan.nextInt();
        if (select == 1){

            giveMarks();
        }else{

            seeStudentEnrollment();
        }

    }

    public void giveMarks() throws IOException {

        int i;
        Result r = new Result();
        r.ResultUI();
        for (i=0;i<=100;i++) {
            System.out.println("***************************************************************************");

        }
        InstructorUI();


    }

    public void seeStudentEnrollment() throws IOException {

        // Open the file
        FileInputStream fstream = new FileInputStream("StudentCourse.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

//Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            System.out.println (strLine);
        }

//Close the input stream
        fstream.close();

        System.out.println("***************************************************************************");
        InstructorUI();

    }

    public static void main(String[] args) throws IOException {

        Instructor ins = new Instructor();
       ins.InstructorUI();
    }
}
