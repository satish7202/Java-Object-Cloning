package com.java_clone;

public class Student implements Cloneable {
  int roll_no;
  String Name;
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public Student(int roll_no, String name) {
    this.roll_no = roll_no;
    Name = name;
  }
}
 /* git init
  git add README.md
  git commit -m "first commit"
  git branch -M main
  git remote add origin https://github.com/satish7202/Java-Object-Cloning.git
  git push -u origin main/*
