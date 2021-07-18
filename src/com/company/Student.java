package com.company;

import java.io.*;
import java.util.Scanner;

public class Student {

    int input;
    Scanner scan;
    private String name;
    private String id;
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


            viewModulesandInstructions();

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

        try {
            System.out.println("Enter your ID");
            id = scan.next();

        }catch(Exception e){

            System.out.println("Enter integer value ");

        }

        System.out.println("These are Canceled course for this year");


        System.out.println("The available course are");
        Courses c = new Courses();
        c.viewCourse();
        System.out.println("Enter the name of your Desired Course");
        Course = scan.next();
        String avialableCourses = "BIT";

        if(Course.equals("BIT")){


            System.out.println("Enter your level");
            level = scan.nextInt();

            if(level== 6){

                optionalScan = new Scanner(System.in);
                File f= new File("StudentCourse.txt");
                FileWriter filew = new FileWriter(f,true);
                try{
                    if (!file.exists()){

                        f.createNewFile();
                    }


                    System.out.println("Please Enter the optional module of your Choice \n1.Robotics \n2.Game Development");
                    String optional = optionalScan.nextLine();

                    System.out.println("Your name is" + name + "Your id is " + id + "And your desired course is" + Course +"\t"+"Your level is:"+level+"And you took optional Course"+optional);




                    filew.write("\tName: \t" + name + "\t ID:  \t" + id + " \tCourse\t " + Course + "" + "\tLevel\t"+level+"Optional"+optional+System.lineSeparator());


                    filew.close();
                }catch(Exception e){

                    e.printStackTrace();
                }








            }else {

                System.out.println("Your name is" + name + "Your id is " + id + "And your desired course is" + Course +"\t"+"Your level is:"+level);


                pw.write("\tName: \t" + name + "\t ID:  \t" + id + " \tCourse\t " + Course + "" + "\tLevel\t"+level+"Optional"+System.lineSeparator() );


                pw.close();
                pw.println("Name=" + name + " Course Enrolled: " + Course);





            }

            pw.close();
            pw.println("Name=" + name + " Course Enrolled: " + Course);




        }else {

            System.out.println("Sorry the course you typed is Not present at the Moment");
        }




    }

    public void viewModulesandInstructions() throws IOException, NoSuchMethodException {

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


        if(select==6){

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


        studentUI();

    }

    public void viewResult() throws IOException, NoSuchMethodException {

        Scanner result= new Scanner(System.in);
        String name = null;
       

        try {
            // create a new file object
            System.out.println("Enter your Name:\n");
            name= result.nextLine();
            File file = new File(name+".txt");


            // create an object of Scanner
            // associated with the file
            Scanner sc = new Scanner(file);

            // read each line from file and print it

            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            // close scanner
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        studentUI();
    }

    public static void main(String[] args) throws IOException {

        Student st = new Student();
        st.register();
    }


}
