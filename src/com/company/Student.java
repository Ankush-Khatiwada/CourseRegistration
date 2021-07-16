package com.company;

import java.io.*;
import java.util.Scanner;

public class Student {

    int input;
    Scanner scan;
    private String name;
    private int id;
    private int level;
    private String Course;
    Scanner optionalScan;



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

        if(level== 6){

            optionalScan = new Scanner(System.in);
            File f= new File("Ootional.txt");
            try{
                if (!file.exists()){

                    f.createNewFile();
                }
            }catch(Exception e){

                e.printStackTrace();
            }
            System.out.println("Please select the optional module of your Choice \n1.Robotics \n2.Game Development");

            FileWriter optionalFile = new FileWriter(f);
           optionalFile.write(String.valueOf(f));






        }
        System.out.println("Your name is" + name + "Your id is " + id + "And your desired course is" + Course);

        pw.write("\tName: \t" + name + "\t ID:  \t" + id + " \tCourse\t " + Course + "\n" + System.lineSeparator());

        pw.close();
        pw.println("Name=" + name + " Course Enrolled: " + Course);


    }

    public void viewModulesandInstructions() throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("View Your Modules");
        System.out.println("Select your level");

        int select = scan.nextInt();

        if(select==4){

            try {
                FileInputStream fileinput = new FileInputStream("BITLevel4.txt");

                BufferedInputStream input = new BufferedInputStream(fileinput);

                int i = input.read();

                while (i != -1) {

                    System.out.print((char) i);

                    i = input.read();

                }
                input.close();

            }catch (Exception e){

                e.printStackTrace();
            }


        }

        if(select==5){

            try {
                FileInputStream fileinput = new FileInputStream("BITLevel5.txt");

                BufferedInputStream input = new BufferedInputStream(fileinput);

                int i = input.read();

                while (i != -1) {

                    System.out.print((char) i);

                    i = input.read();

                }
                input.close();

            }catch (Exception e){

                e.printStackTrace();
            }


        }


        if(select==4){

            try {
                FileInputStream fileinput = new FileInputStream("BITLevel6.txt");

                BufferedInputStream input = new BufferedInputStream(fileinput);

                int i = input.read();

                while (i != -1) {

                    System.out.print((char) i);

                    i = input.read();

                }
                input.close();

            }catch (Exception e){

                e.printStackTrace();
            }


        }




    }

    public void viewResult() throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Your Name to view result");
        String name = sc.nextLine();

        try {
            File resultFile = new File(name);
            FileReader resultReader= new FileReader(resultFile);

            if (!resultFile.exists()){

                resultFile.createNewFile();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }




    }

    public static void main(String[] args) throws IOException {


        Student stu= new Student();
        stu.viewResult();
    }
}
