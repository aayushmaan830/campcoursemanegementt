// Student.java - Student entity class
package com.studentmanagement;

public class Student {
    private int id;
    private String name;
    private String grade;

    // Constructor
    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade='" + grade + "'}";
    }
}
