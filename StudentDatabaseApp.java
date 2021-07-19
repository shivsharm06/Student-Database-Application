package com.studentdatabaseapp;

import java.sql.Array;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        System.out.print("Enter the number of students you want to enroll: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Student[] student = new Student[n];

        for (int i = 0; i < n; i++) {

            student[i] =new Student();
            student[i].enroll();
            student[i].payTuition();
        }
        for (int i = 0; i < n; i++){
            System.out.println(student[i].toString());
        }
    }
}

