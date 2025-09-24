// StudentService.java - Service class for business logic
package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    // Add a new student
    public boolean addStudent(Student student) {
        if (student == null || student.getId() <= 0) {
            return false;
        }
        
        // Check if student ID already exists
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                return false;
            }
        }
        
        students.add(student);
        return true;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return new ArrayList<>(students); // Return copy to maintain encapsulation
    }

    // Find student by ID
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Remove student by ID
    public boolean removeStudent(int id) {
        Student studentToRemove = findStudentById(id);
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            return true;
        }
        return false;
    }

    // Get student count
    public int getStudentCount() {
        return students.size();
    }

    // Update student grade
    public boolean updateStudentGrade(int id, String newGrade) {
        Student student = findStudentById(id);
        if (student != null) {
            student.setGrade(newGrade);
            return true;
        }
        return false;
    }
}
