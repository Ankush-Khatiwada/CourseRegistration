package com.company;

import java.io.FileNotFoundException;

public class Instructor extends Result {

    public void giveMarks() throws FileNotFoundException {

        Result r = new Result();
        r.ResultUI();


    }

    public static void main(String[] args) throws FileNotFoundException {

        Instructor i = new Instructor();
        i.giveMarks();
    }

}
