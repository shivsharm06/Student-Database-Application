package com.studentdatabaseapp;

import java.util.Scanner;

public class Student {
   Scanner scanner = new Scanner(System.in);
  private String firstName;
  private String lastName;
  private  int year;
  private String student_id; //first number being there grade level
  private  String course_name= "";
  private int course_cost;
  private int tuition_fee = 0;
  private int costOfCourse = 600;
  private int id = 1000;
  private int remaining_balance;


  public Student() {

    System.out.print("Enter first name : ");
    this.firstName = scanner.nextLine();
    System.out.print("Enter last name : ");
    this.lastName = scanner.nextLine();
    System.out.println("Enter year : Press\n1 for Freshmen \n2 for Sophomore \n3 for Junior \n4 for Senior ");
    this.year = scanner.nextInt();
    id++;
    unique_id();
  }

  // 5 digit unique id
  public String unique_id() {
    return this.student_id = year + "" + id;
  }

  // Course Enrollment
  public void enroll() {
    do {
      System.out.println("Enter course in which you to enroll, press Q to Quit");
      Scanner scan=new Scanner(System.in);
      String course = scan.nextLine();
      if (!course.equals("Q")) {
        course_name = course_name + "\n  " + course;
        tuition_fee = tuition_fee + costOfCourse;
      }
      else {
        break;
      }
    }
    while (1!=0);
    System.out.println("Enrollment done!");
    System.out.println("Total fee " + tuition_fee);
  }

  public  void payTuition(){
    System.out.println("Your payment amount: ");
    int payment=scanner.nextInt();
    remaining_balance= tuition_fee -payment;
    System.out.println("Thank you for your payment!");
    //System.out.println("Your remaining remaining_balance is "+ remaining_balance);
  }

  public String toString(){
    System.out.println("Student info");
      return firstName +" "+ lastName + "\nCourses enrolled: " + course_name + "\nbalance " +  remaining_balance +
                   "\nStudent id " + unique_id();
  }
}

