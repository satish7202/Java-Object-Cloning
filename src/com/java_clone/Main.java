package com.java_clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
      Student s1=new Student(1,"Satish");
      Student s2 = (Student) s1.clone();
      s1.Name="Ratan";
      System.out.println(s1.Name +" "+s1.roll_no);
      System.out.println(s2.Name +" "+s2.roll_no );

    }
}
