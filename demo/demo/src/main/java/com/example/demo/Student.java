package com.example.demo;

import org.springframework.stereotype.Component;


public class Student {
    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
