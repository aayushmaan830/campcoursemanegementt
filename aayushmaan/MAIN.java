// Main.java - Entry point of the application
package com.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Student Management System ===");
        
        while (true) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    findStudentById();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Find Student by ID");
        System.out.println("4. Exit");
    }

    private static void addStudent() {
        System.out.println("\n--- Add New Student ---");
        int id = getIntInput("Enter Student ID: ");
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();
        
        Student student = new Student(id, name, grade);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        
        System.out.println("\n--- All Students ---");
        for (Student student : students) {
            student.displayInfo();
        }
    }

    private static void findStudentById() {
        int id = getIntInput("Enter Student ID to search: ");
        
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found:");
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    private static int getIntInput(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
