package com.codegym;

public class Student {
    private int num;
    private String name;
    private static String college = "VNU";

    //constructor
    Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method
    void display() {
        System.out.println(num + " " + name + " " + college);
    }
}
