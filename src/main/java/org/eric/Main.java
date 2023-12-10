package org.eric;

import org.eric.dto.*;

/**
 * @author Eric Tiganasu
 * The main class for the School Management System
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();

        system.addDepartment("Computer Science");
        system.addStudent("Laurie", "Chammah", "D001");
        system.addCourse("Intro to Programming", 3.0, "D001");
        system.addTeacher("Eric", "Tiganasu", "D001");

        system.modifyCourseTeacher("C001", "T001");
        system.modifyCourseTeacher("C001", "T002");
        system.modifyCourseTeacher("C002", "T001");

        system.registerCourse("S001", "C001");
        system.registerCourse("S001", "C002");
        system.registerCourse("S002", "C001");

        system.findDepartment("D001");
        system.findStudent("S001");
        system.findCourse("C001");
        system.findTeacher("T001");

        system.findDepartments();
        system.printStudents();
        system.findCourses();
        system.printTeachers();
    }
}
