package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Admin {

    public  String CourseName;
    public PrintWriter printWriter;
    public Scanner sc;
    public File file;
    public FileWriter fw;



}
class Courses extends Admin {

    Scanner sc = new Scanner(System.in);

    int select;

    public void courseUI() throws IOException {


        System.out.println("Please select the option \n1.Add COurse \n2.Delete Course \n3.View Course \n4.Cancel Course");
        select = sc.nextInt();

        if (select == 1) {

            addCourse();
        }
        if (select == 2) {

          DeleteCourseByID();
        }
        if (select == 1) {

            viewCourse();
        }
        if (select == 1) {

            cancelCourse();
        }



    }

    public void addCourse() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("AvialableCourses.txt", true));
        Scanner strInput = new Scanner(System.in);

       String ID;
        String name;

        System.out.print("Enter the Course ID: ");
        ID = strInput.nextLine();
        System.out.print("Enter the Course Name: ");
        name = strInput.nextLine();


        bw.write("Course:" + ID + "\nCourse Name: \t " + name);
        bw.flush();
        bw.newLine();
        bw.close();

    }


    public void DeleteCourseByID() throws IOException {
        Scanner strInput = new Scanner(System.in);
        String ID, record;


        File tempDB = new File("AvialableCourses_temp.txt");
        File db = new File("AvialableCourses.txt");


        BufferedReader br = new BufferedReader(new FileReader(db));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));


        System.out.println("\t\t Delete Course Record\n");

        System.out.println("Enter the Course ID: ");
        ID = strInput.nextLine();


        while ((record = br.readLine()) != null) {


            if (record.contains(ID))
                continue;

            bw.write(record);
            bw.flush();
            bw.newLine();

        }

        br.close();
        bw.close();

        db.delete();

        tempDB.renameTo(db);

    }


    public void viewCourse() {

        try {
            File file = new File("AvialableCourses.txt");    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
            }
            fr.close();    //closes the stream and release the resources
            System.out.println("*****************************Courses Avialable ***********************************");
            System.out.println(sb.toString());   //returns a string that textually represents the object
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void cancelCourse() throws IOException {

        File file = new File("canceledcourse.txt");
        FileWriter fw = new FileWriter(file);

        ArrayList removed = new ArrayList();

        System.out.println(" Enter the name of the course you want to cancel  :");
        removed.add(sc.nextLine());


        fw.write(String.valueOf(removed));
        fw.close();


    }

}